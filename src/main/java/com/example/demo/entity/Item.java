package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Item {
	
	@Id
	int id;
	String itemname;
	String itemdesc;
	
	@OneToMany()
	@JoinColumn(name = "id")
	private List<Price> prices;

	public Item() {
		
	}
	
	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getItemdesc() {
		return itemdesc;
	}
	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	public Item(int id, String itemname, String itemdesc, List<Price> prices) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.itemdesc = itemdesc;
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", itemdesc=" + itemdesc + ", prices=" + prices + "]";
	}
	

	
	
}
