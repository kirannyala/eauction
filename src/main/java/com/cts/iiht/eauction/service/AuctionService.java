package com.cts.iiht.eauction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.iiht.eauction.bean.AddProductRequest;
import com.cts.iiht.eauction.bean.BiddingRequest;
import com.cts.iiht.eauction.bean.SelectProduct;
import com.cts.iiht.eauction.dto.ProductBuyerBids;
import com.cts.iiht.eauction.repo.ProductRepo;

@Service
public class AuctionService {

	@Autowired
	ProductRepo productRepo;
	
	public String addProduct(AddProductRequest addProductReq) {
		int rowCreated = productRepo.addProduct(addProductReq);
		return rowCreated>=1 ? "Add product success" : "Add product failed" ;
	}
	
	public String placeBidForProduct(BiddingRequest biddingRequest) {
		int rowCreated = productRepo.placeBiddingForProduct(biddingRequest);
		return rowCreated>=1 ? "Bidding success" : "Bidding failed" ;
	}
	
	public ProductBuyerBids showBids(int productId) {
		return productRepo.showBids(productId);
	}
	
	public String updateBid(int productId, String buyerEmailId, int newBidAmount) {
		int rowCreated = productRepo.updateBid(productId, buyerEmailId, newBidAmount);
		return rowCreated>=1 ? "Bid Amount Updated" : "Bidd Amount update failed" ;
	}
	
	public String deleteProduct(int productId) {
		int rowCreated = productRepo.deleteproduct(productId);
		return rowCreated>=1 ? "Product Deleted" : "Product Delete failed" ;
	}
	
	public List<SelectProduct> getProducts() {
		return productRepo.getProducts();
	}
}
