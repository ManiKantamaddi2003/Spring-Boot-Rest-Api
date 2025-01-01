package com.twg.springbootmydairyrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springbootmydairyrestapi.entites.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {
		public List<Entry>findByUserid(long id);
}
