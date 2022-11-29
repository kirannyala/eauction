package com.cts.iiht.eauction.dto;

public class BuyerBids {

	private String productId;
	private String buyerBidAmount;
	private String buyerfirstName;
	private String buyerEmail;
	private String buyerPhone;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getBuyerBidAmount() {
		return buyerBidAmount;
	}
	public void setBuyerBidAmount(String buyerBidAmount) {
		this.buyerBidAmount = buyerBidAmount;
	}
	public String getBuyerfirstName() {
		return buyerfirstName;
	}
	public void setBuyerfirstName(String buyerfirstName) {
		this.buyerfirstName = buyerfirstName;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
	
	
}
