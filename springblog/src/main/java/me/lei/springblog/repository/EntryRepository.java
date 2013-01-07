package me.lei.springblog.repository;

import me.lei.springblog.domain.Entry;

import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Integer> {

}
