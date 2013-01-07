package me.lei.springblog.repository;

import me.lei.springblog.domain.ShiroUser;

import org.springframework.data.repository.CrudRepository;

public interface ShiroUserRepository extends CrudRepository<ShiroUser,Integer> {
	ShiroUser getShiroUserByUserId(String userId);

}
