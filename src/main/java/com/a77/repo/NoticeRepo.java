package com.a77.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.a77.entity.Notice;

public interface NoticeRepo extends CrudRepository<Notice, Long>{
	
	List<Notice> findByTag(String tag);
	

}
