package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {
	
	@Id
	int priceid;
	int price;
	String pricedesc;
	int id;
	
	public int getPriceid() {
		return priceid;
	}
	public void setPriceid(int priceid) {
		this.priceid = priceid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPricedesc() {
		return pricedesc;
	}
	public void setPricedesc(String pricedesc) {
		this.pricedesc = pricedesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Price [priceid=" + priceid + ", price=" + price + ", pricedesc=" + pricedesc + ", id=" + id + "]";
	}
	
	
	
	
}
