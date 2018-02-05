package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {

	private Logger log = LoggerFactory.getLogger("[Service]");

	private ItemRepository itemRepository;
	
	@Autowired
	public void itemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	public Item getItemById(Integer itemId) {
		Item items = itemRepository.findByItemId(itemId);
		return items;	
	}
	
	public Item saveItem(Item item) {
		if (getItemById(item.getItemId()) != null) {
			// Item already exist
			log.info("Item already exist - " + item);
		}
		else {	
			itemRepository.save(item);
			log.info("Item saved from service - " + item);
		}
		return item;
			
		}
}
