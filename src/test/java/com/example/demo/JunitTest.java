package com.example.demo;

import java.awt.PageAttributes;
import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.ItemController;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;

@RunWith(MockitoJUnitRunner.class)
public class JunitTest {

	@Mock
	private ItemService itemService;
	
	private ItemController controller;

	//private List<Item> emptyList;

	private Item createEmptyList() {
		return new Item();
	}
	
	private Item createPopulatedList() {
		Item result = new Item();
		return result;
	}
	
	
	@Before
	public void setup() {
		controller = new ItemController();
		controller.ItemService(itemService);
		//emptyList = createEmptyList();
	}
	
	@Test
	public void getItembyid_EmptyTest() {
		when(itemService.getItemById(1)).thenReturn(createEmptyList());
		
		Item result = controller.getItemById(1);
		
		assertEquals(result, createEmptyList());
		
	}

	@Test
	public void getItembyid_PopulatedTest() {
		when(itemService.getItemById(1)).thenReturn(createPopulatedList());
		
		Item result = controller.getItemById(1);
		System.out.println(result.toString());
		assertThat(result.toString(), equalTo(createPopulatedList().toString()));
		
	}


}

