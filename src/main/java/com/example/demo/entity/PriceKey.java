package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PriceKey implements Serializable {

	private Integer itemId;
	
	private Integer priceId;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	@Override
	public String toString() {
		return "PriceKey [itemId=" + itemId + ", priceId=" + priceId + "]";
	}

	
}
