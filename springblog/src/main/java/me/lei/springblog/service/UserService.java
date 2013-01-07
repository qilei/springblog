package me.lei.springblog.service;

import me.lei.springblog.domain.AppUser;

public interface UserService {
	AppUser addUser(AppUser user);
	
	AppUser FindById(int id);
}
