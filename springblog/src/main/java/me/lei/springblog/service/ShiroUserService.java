package me.lei.springblog.service;

import me.lei.springblog.domain.ShiroUser;

public interface ShiroUserService {
	ShiroUser getById(int id);
	
	ShiroUser getByUserId(String userId);
	
	void addShiroUser(ShiroUser user);
}
