package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Item {
	public Item() {
		priceEntity = new ArrayList<>();
	}
	
	@Id
	//@GeneratedValue
	private Integer itemId;
	
	private String itemName;
	private String itemDesc;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "itemEntity")
	private List<Price> priceEntity;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public List<Price> getPriceEntity() {
		return priceEntity;
	}

	public void setPriceEntity(List<Price> priceEntity) {
		this.priceEntity = priceEntity;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", prices=" + priceEntity
				+ "]";
	}
}
