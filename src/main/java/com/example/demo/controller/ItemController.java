package com.example.demo.controller;

import com.example.demo.service.ItemService;
import com.example.demo.entity.Item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/getitem")
public class ItemController {
	
	private ItemService itemService;
	
	@Autowired
	public void ItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@RequestMapping(path = "/item", method = RequestMethod.GET)
	public List<Item> getItemById(@RequestParam("id") int id) {
		List<Item> result = itemService.getItemById(id);
		return result;
	}
}
