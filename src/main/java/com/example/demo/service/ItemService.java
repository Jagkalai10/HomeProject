package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {
	private ItemRepository itemRepository;
	
	@Autowired
	public void itemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	public List<Item> getItemById(Integer itemId) {
		Iterable<Item> items = itemRepository.findByItemId(itemId);
		return (List<Item>) items;	
	}
}
