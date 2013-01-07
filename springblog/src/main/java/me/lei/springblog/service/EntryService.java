package me.lei.springblog.service;

import java.util.List;

import me.lei.springblog.domain.Entry;

public interface EntryService {
	Entry add(Entry entry);
	
	List<Entry> findAll();
	
	Entry find(int id);
}
