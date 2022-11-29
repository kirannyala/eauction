package com.cts.iiht.eauction.dto;

import java.util.List;

import com.cts.iiht.eauction.bean.Product;

public class ProductBuyerBids {

	private Product product;
	private List<BuyerBids> buyerBids;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<BuyerBids> getBuyerBids() {
		return buyerBids;
	}
	public void setBuyerBids(List<BuyerBids> buyerBids) {
		this.buyerBids = buyerBids;
	}
	
	
}
