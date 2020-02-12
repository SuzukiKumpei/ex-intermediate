package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Hotel;

/**
 * ホテルに関する情報を扱うリポジトリ.
 * @author suzukikunpei
 *
 */
@Repository
public class HotelRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	
	private static final RowMapper<Hotel> HOTEL_ROW_MAPPER = (rs,i) ->{
		Hotel hotel = new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setArea_name(rs.getString("area_name"));
		hotel.setHotel_name(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearest_station(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setParking(rs.getString("parking"));
		return hotel;
	};
	
	/**
	 * ホテル全件検索を行う.
	 * @return ホテル情報一覧
	 */
	public List<Hotel> findAll(){
		String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking ORDER BY price";
		List<Hotel> hotelList = template.query(sql, HOTEL_ROW_MAPPER);
		return hotelList;
	}
	
	/**
	 * 入力した値以下のホテル一覧情報を表示.
	 * @param price ホテルの価格
	 * @return 入力した値以下のホテル一覧情報
	 */
	public List<Hotel> findByPrice(Integer price) {
		String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price <= :price";
		SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);
		List<Hotel> hotelList = template.query(sql, param, HOTEL_ROW_MAPPER);
		return hotelList;
	}
	
	

}
