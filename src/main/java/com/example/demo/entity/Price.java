package com.example.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Price {
	
	@EmbeddedId
	private PriceKey priceKey;
	
	public Price() {
		priceKey = new PriceKey();
	}
	
	@MapsId("itemId")
	@ManyToOne
	private Item itemEntity;
	
	private Integer priceAmt;
	private String priceDesc;

	
	public PriceKey getPriceKey() {
		return priceKey;
	}

	public void setPriceKey(PriceKey priceKey) {
		this.priceKey = priceKey;
	}

	public int getPriceAmt() {
		return priceAmt;
	}

	public void setPriceAmt(int priceAmt) {
		this.priceAmt = priceAmt;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public Item getItemEntity() {
		return itemEntity;
	}

	public void setItemEntity(Item itemEntity) {
		this.itemEntity = itemEntity;
	}


	@Override
	public String toString() {
		return "Price [priceKey=" + priceKey + ", price=" + priceAmt + ", priceDesc=" + priceDesc + "]";
	}

	
}
