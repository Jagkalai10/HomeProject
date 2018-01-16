package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Item;
import com.example.demo.entity.Price;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.PriceRepository;

@SpringBootApplication
public class SpringTest2Application implements CommandLineRunner{

	private ItemRepository itemRepository;
	
	@Autowired
	public void itemRepository(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	private PriceRepository priceRepository;
	
	@Autowired
	public void priceRepository(PriceRepository priceRepository) {
		this.priceRepository = priceRepository;
	}
	
	private Logger log = LoggerFactory.getLogger(SpringTest2Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTest2Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		// Insert in ITEM table
		Item item1 = new Item();
		item1.setId(1);
		item1.setItemname("Item1");
		item1.setItemdesc("item1 description");
		
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setId(2);
		item2.setItemname("Item2");
		item2.setItemdesc("item2 description");
		
		itemRepository.save(item2);
		
		Item item3 = new Item();
		item3.setId(3);
		item3.setItemname("Item3");
		item3.setItemdesc("item3 description");
		
		itemRepository.save(item3);
	
		// Insert in PRICE table
		Price price1 = new Price();
		
		price1.setId(1);
		price1.setPriceid(111);
		price1.setPrice(125);
		price1.setPricedesc("price1 description");
		
		priceRepository.save(price1);
		
		Price price2 = new Price();
		
		price2.setId(1);
		price2.setPriceid(222);
		price2.setPrice(133);
		price2.setPricedesc("price2 description");
		
		priceRepository.save(price2);
		
		
		
	}
}
