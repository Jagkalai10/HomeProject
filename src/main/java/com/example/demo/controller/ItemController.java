package com.example.demo.controller;

import com.example.demo.service.ItemService;
import com.example.demo.entity.Item;
import com.example.demo.entity.Price;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/item")
public class ItemController {
	
	private Logger log = LoggerFactory.getLogger("[controller]");
	
	private ItemService itemService;
			
	@Autowired
	public void ItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@RequestMapping(path = "/getid", method = RequestMethod.GET)
	public Item getItemById(@RequestParam("id") int id) {
		Item result = itemService.getItemById(id);
		return result;
	}
	
	@RequestMapping(path = "post", method = RequestMethod.GET)
	public Item saveItem(@RequestBody Item itemToSave) {
		Item itemMove = new Item();
		itemMove.setItemId(itemToSave.getItemId());
		itemMove.setItemDesc(itemToSave.getItemDesc());
		itemMove.setItemName(itemToSave.getItemName());
		Price priceMove = new Price();
		priceMove.setItemEntity(itemToSave);
		itemMove.getPriceEntity().add(priceMove);
		itemService.saveItem(itemToSave);
		log.info("Item saved from controller" + itemMove);
		return itemMove;
	}
}
