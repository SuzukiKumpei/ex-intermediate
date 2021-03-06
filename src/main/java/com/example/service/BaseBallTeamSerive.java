package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Detail;
import com.example.repository.BaseballTeamRepository;

/**
 * チーム名一覧の操作をするサービス.
 * 
 * @author suzukikunpei
 *
 */
@Service
public class BaseBallTeamSerive {

	@Autowired
	private BaseballTeamRepository baseballTeamRepository;

	/**
	 * チーム名一覧を全件取得する.
	 * 
	 * @return チーム名一覧
	 */
	public List<Detail> showList() {
		return baseballTeamRepository.findAll();
	}

	/**
	 * チームの詳細情報を取得.
	 * @param id チーム名ID
	 * @return チーム詳細情報
	 */
	public Detail showDetail(Integer id) {
		return baseballTeamRepository.load(id);
	}

}
