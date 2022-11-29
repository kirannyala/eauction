package com.cts.iiht.eauction.bean;

public class AddProductRequest {

	private Seller seller;
	private Product product;
	
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
