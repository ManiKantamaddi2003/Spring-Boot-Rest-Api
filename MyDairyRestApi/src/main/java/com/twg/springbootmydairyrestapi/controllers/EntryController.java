package com.twg.springbootmydairyrestapi.controllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twg.springbootmydairyrestapi.entites.Entry;
import com.twg.springbootmydairyrestapi.service.EntryService;

@RestController
@RequestMapping("/")
public class EntryController {
	@Autowired
	 private EntryService entryService;
	 @GetMapping("/entrie/" )
	public List<Entry> findAllEntries()
	{
		
		List<Entry> entriesList = entryService.findAll();
		
		return entriesList;
		
	}
	 @PostMapping("/" )
	public Entry saveEntry(@RequestBody Entry entry)
	{
		 Entry saveEntry=entryService.saveEntry(entry);
		return saveEntry;
		
	}
	 @PutMapping("/")
	 public Entry updateEntry(@RequestBody Entry entry)
	 {
		 Entry updateEntry=entryService.updateEntry(entry);
		return updateEntry;
	 }
	 @GetMapping("/entries/{id}")
	 public Entry getEntry(@PathVariable int id)
	 {
		 Entry entry=entryService.findById(id);
		 return entry;
	 }
	 @DeleteMapping("/{id}")
	 public void deleteEntry(@PathVariable int id)
	 {
		 Entry entry=entryService.findById(id);
		 entryService.deleteEntry(entry);
	 }
	 
	 @PutMapping("/{id}")
	 public Entry updateEntry(@PathVariable("id")int id,@RequestBody Entry entry)
	 {
		 Entry entry1=entryService.findById(id);
		 entry1.setDescription(entry.getDescription());
		 entry1.setUserid(entry.getUserid());
		 entry1.setEntrydate(entry.getEntrydate());
		 
		 Entry updateEntry=entryService.updateEntry(entry1);
		return updateEntry;
	 }
	 
	 @PatchMapping("/{id}")
	 public Entry UpadateEntry2(@PathVariable("id")int id,@RequestBody Entry entry)
	 {
		 Entry entry1=entryService.findById(id);
		 String desc=entry.getDescription();
		 Date dt=entry.getEntrydate();
		 long userid=entry.getUserid();
		 
		 if(desc!=null && desc.length()>0)
		 {
			 entry1.setDescription(entry.getDescription());
		 }
		 if(dt!=null )
		 {
			 entry1.setEntrydate(entry.getEntrydate());
		 }
		 if(userid>0)
		 {
			 entry1.setUserid(entry.getUserid());
		 }
		 
		 Entry updateEntry=entryService.updateEntry(entry1);
			return updateEntry;
		 
	 }
}
