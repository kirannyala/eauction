package com.cts.iiht.eauction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.iiht.eauction.bean.BiddingRequest;
import com.cts.iiht.eauction.service.AuctionService;

@RestController
@RequestMapping("/api/v1/buyer")
public class BuyerController {

	@Autowired
	AuctionService auctionService;
	
	
	
	@PostMapping("/place-bid")
	public String placeBidForProduct(@RequestBody BiddingRequest biddingRequest) {
		return auctionService.placeBidForProduct(biddingRequest);
	}
	
	@PutMapping("/update-bid/{productId}/{buyerEmailId}/{newBidAmount}")
	public String updateBid(@PathVariable int productId, @PathVariable String buyerEmailId, @PathVariable int newBidAmount) {
		return auctionService.updateBid(productId, buyerEmailId, newBidAmount);
		
	}
}
