package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.HotelService;

/**
 * ホテルの情報を扱うコントローラ.
 * 
 * @author suzukikunpei
 *
 */
@Controller
@RequestMapping("/ex02")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@RequestMapping("")
	public String hotelSearch() {
		return "hotelSearch";
	}

	/**　入力した値以下のホテル一覧を表示する.
	 * @param model リクエストスコープ
	 * @param price　ホテルの価格
	 * @return　ホテル一覧情報
	 */
	@RequestMapping("/search")
	public String search(Model model, Integer price) {
		model.addAttribute("hotelList", hotelService.searchByLessThanPrice(price));
		return "hotelSearch"; //return先はここでいいのか？
	}

}
