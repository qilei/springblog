package me.lei.springblog.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lei.springblog.domain.ShiroUser;
import me.lei.springblog.repository.ShiroUserRepository;
import me.lei.springblog.service.ShiroUserService;

@Service("shiroUserService")
public class ShiroUserServiceImpl implements ShiroUserService {

	private ShiroUserRepository shiroUserRepository=null;

	@Autowired
	public ShiroUserServiceImpl(ShiroUserRepository shiroUserRepository) {
		super();
		this.shiroUserRepository = shiroUserRepository;
	}

	public ShiroUser getById(int id) {
		return shiroUserRepository.findOne(id);
	}

	public ShiroUser getByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addShiroUser(ShiroUser user) {
		shiroUserRepository.save(user);
	}

}
