package me.lei.springblog.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.google.common.collect.Lists;

import me.lei.springblog.domain.Entry;
import me.lei.springblog.repository.EntryRepository;
import me.lei.springblog.service.EntryService;

@Service("entryService")
@Transactional
public class EntryServiceImpl implements EntryService {
	private EntryRepository entryRepository;

	@Autowired
	public EntryServiceImpl(EntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}

	public Entry add(Entry entry) {
		return entryRepository.save(entry);
	}
	
	public Entry find(int id){
		return entryRepository.findOne(id);
	}

	public List<Entry> findAll() {
		return Lists.newArrayList(entryRepository.findAll());
	}

}
