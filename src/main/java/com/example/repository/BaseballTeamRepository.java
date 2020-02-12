package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Detail;

@Repository
public class BaseballTeamRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	/**
	 * RowMapper定義.
	 */
	private static final RowMapper<Detail> DETAIL_ROW_MAPPER = (rs, i) -> {
		Detail detail = new Detail();
		detail.setId(rs.getInt("id"));
		detail.setLeague_name(rs.getString("league_name"));
		detail.setTeam_name(rs.getString("team_name"));
		detail.setHeadquarters(rs.getString("headquarters"));
		detail.setInauguration(rs.getString("inauguration"));
		detail.setHistory(rs.getString("history"));
		return detail;
	};

	/**
	 * チーム名一覧をチーム発足日の昇順で表示する.
	 * 
	 * @return チーム名リスト
	 */
	public List<Detail> findAll() {
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams ORDER BY inauguration";
		List<Detail> detailList = template.query(sql, DETAIL_ROW_MAPPER);
		return detailList;
	}
	
	/**
	 * 主キーからチーム詳細情報を取得.
	 * @param id チーム名ID
	 * @return チーム詳細情報
	 */
	public Detail load(Integer id) {
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history FROM teams WHERE id = :id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		Detail detail = template.queryForObject(sql, param, DETAIL_ROW_MAPPER);
		return detail;
		}
	
	
	
	

}
