package me.lei.springblog.service.jpa;

import java.util.List;

import me.lei.springblog.domain.Category;
import me.lei.springblog.repository.CategoryRepository;
import me.lei.springblog.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	public List<Category> findAll() {
		return Lists.newArrayList(categoryRepository.findAll());
	}	
}
