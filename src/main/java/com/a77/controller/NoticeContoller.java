package com.a77.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a77.entity.Notice;
import com.a77.repo.NoticeRepo;

@Controller
public class NoticeContoller {
	
	@Autowired
	NoticeRepo noticeRepo;
	
	
	
	@GetMapping("/notice")
	public String notice(Map<String, Object> model) {
		
		Iterable<Notice> notices = noticeRepo.findAll();
		model.put("notices", notices);
		return "notice";
	}
	
	@PostMapping("/notice")
	public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
		
		Notice notice = new Notice(text, tag);
		
		noticeRepo.save(notice);
		
		Iterable<Notice> notices = noticeRepo.findAll();
		model.put("notices", notices);
		
		return "notice";
	}
	
	@PostMapping("filter")
	public String filter(@RequestParam String filter, Map<String, Object> model) {
		
		List<Notice> notices = noticeRepo.findByTag(filter);
		
		model.put("notices", notices);
		
		return "notice";
	}
	

}








//
