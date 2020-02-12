package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Detail;
import com.example.service.BaseBallTeamSerive;

/**
 *野球チームの情報を操作するコントローラ.
 * @author suzukikunpei
 *
 */
@Controller
@RequestMapping("/ex01")
public class BaseballTeamController {
	
	@Autowired
	private BaseBallTeamSerive baseBallTeamSerive;
	
	@RequestMapping("/showList")
	public String showList(Model model) {
		List<Detail> detailList = baseBallTeamSerive.showList();
		model.addAttribute("detailList",detailList);
		
		return "baseballTeamList";
	}
	
	
	
	

}
