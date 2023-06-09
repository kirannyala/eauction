package com.cts.iiht.eauction.repo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.iiht.eauction.bean.AddProductRequest;
import com.cts.iiht.eauction.bean.BiddingRequest;
import com.cts.iiht.eauction.bean.Product;
import com.cts.iiht.eauction.bean.SelectProduct;
import com.cts.iiht.eauction.dto.BuyerBids;
import com.cts.iiht.eauction.dto.ProductBidsRowMapper;
import com.cts.iiht.eauction.dto.ProductBuyerBids;
import com.cts.iiht.eauction.dto.ProductRowMapper;
import com.cts.iiht.eauction.dto.SelectProductRowMapper;
import com.cts.iiht.eauction.util.QueryConstants;

@Repository
public class ProductRepo {

	@Autowired
	private JdbcTemplate jdbcTemplte;
	
	@Transactional(rollbackFor = SQLException.class)
	public int addProduct(AddProductRequest addProductReq) {
		
		jdbcTemplte.update(QueryConstants.ADD_SELLER,
				new Object[] {addProductReq.getSeller().getSellerId(),addProductReq.getSeller().getFirstName(),
						addProductReq.getSeller().getLastName(),addProductReq.getSeller().getAddress(),
						addProductReq.getSeller().getCity(),addProductReq.getSeller().getState(),
						addProductReq.getSeller().getPin(),addProductReq.getSeller().getPhone(),
						addProductReq.getSeller().getEmail()});
		
		return jdbcTemplte.update(QueryConstants.ADD_PRODUCT,
				new Object[] {addProductReq.getSeller().getSellerId(),addProductReq.getProduct().getProductName(),
						addProductReq.getProduct().getShortDesc(),addProductReq.getProduct().getDetailedDesc(),
						addProductReq.getProduct().getCategory(),Integer.parseInt(addProductReq.getProduct().getStartingPrice()),
						addProductReq.getProduct().getBidEndDate()});
		
		//String productID = jdbcTemplte.queryForObject("select last_insert_id()",String.class);		
	}
	
	@Transactional(rollbackFor = SQLException.class)
	public int placeBiddingForProduct(BiddingRequest bidRequest) {
		return jdbcTemplte.update(QueryConstants.PLACE_BID,
				new Object[] {bidRequest.getProductId(),bidRequest.getFirstName(),bidRequest.getLastName(),
						bidRequest.getAddress(),bidRequest.getCity(),bidRequest.getState(),
						bidRequest.getPin(),bidRequest.getPhone(),bidRequest.getEmail(),bidRequest.getBidAmount()});
	}
	
	public ProductBuyerBids showBids(int productid) {
		Product product = jdbcTemplte.queryForObject(QueryConstants.GET_PRODUCT, new ProductRowMapper(), productid);
		List<BuyerBids> bids = jdbcTemplte.query(QueryConstants.GET_BIDS, new ProductBidsRowMapper(), productid);
		ProductBuyerBids pbids = new ProductBuyerBids();
		pbids.setProduct(product);
		pbids.setBuyerBids(bids);
		return pbids;
	}
	
	public int updateBid(int productid, String buyerEmailId, int newBidAmount) {
		return jdbcTemplte.update(QueryConstants.UPDATE_BID, newBidAmount, productid,buyerEmailId);
	}
	
	public int deleteproduct(int productid) {
		return jdbcTemplte.update(QueryConstants.DELETE_PRODUCT, productid);
	}
	
	public List<SelectProduct> getProducts() {
		List<SelectProduct> products = jdbcTemplte.query(QueryConstants.SELECT_GET_PRODUCT, new SelectProductRowMapper());
		return products;
	}
}
