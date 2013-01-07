package me.lei.springblog.service;

import java.util.List;

import me.lei.springblog.domain.Category;

public interface CategoryService {
	List<Category> findAll();
}
