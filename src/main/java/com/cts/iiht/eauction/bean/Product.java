package com.cts.iiht.eauction.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Product {

	private String productName;
	private String shortDesc;
	private String detailedDesc;
	private String category;
	private String startingPrice;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date bidEndDate;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getDetailedDesc() {
		return detailedDesc;
	}
	public void setDetailedDesc(String detailedDesc) {
		this.detailedDesc = detailedDesc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(String startingPrice) {
		this.startingPrice = startingPrice;
	}
	public Date getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	
	
}
