package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

/**
 * ホテルの情報に関する処理を行うサービス.
 * 
 * @author suzukikunpei
 *
 */
@Service
public class HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	
	
	
	
	/**
	 * 入力した値以下のホテル一覧を表示する.
	 * 
	 * @param price ホテルの価格
	 * @return 入力した値以下のホテル一覧
	 */
	public List<Hotel> searchByLessThanPrice(Integer price) {
		
		if(price == null) {
		return hotelRepository.findAll();
		}
		return hotelRepository.findByPrice(price);
		
	}

}
