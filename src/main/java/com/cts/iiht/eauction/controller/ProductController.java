package com.cts.iiht.eauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.iiht.eauction.bean.AddProductRequest;
import com.cts.iiht.eauction.bean.SelectProduct;
import com.cts.iiht.eauction.dto.ProductBuyerBids;
import com.cts.iiht.eauction.service.AuctionService;

@RestController
@RequestMapping("/api/v1/seller")
public class ProductController {

	@Autowired
	AuctionService auctionService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello boot..";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody AddProductRequest addProductReq) {
		return auctionService.addProduct(addProductReq);
	}
	
	@GetMapping("/show-bids/{productId}")
	public  ProductBuyerBids placeBidForProduct(@PathVariable int productId) {
		return auctionService.showBids(productId);
	}
	
	@PutMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		return auctionService.deleteProduct(productId);
		
	}
	
	@GetMapping("/products")
	public  List<SelectProduct> getProducts() {
		return auctionService.getProducts();
	}
}
