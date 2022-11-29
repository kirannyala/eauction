package com.cts.iiht.eauction.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductBidsRowMapper implements RowMapper<BuyerBids>{

	@Override
	public BuyerBids mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BuyerBids prodcutbid = new BuyerBids();
		prodcutbid.setProductId(rs.getString("PRODUCT_ID"));
		prodcutbid.setBuyerBidAmount(rs.getString("BID_AMOUNT"));
		prodcutbid.setBuyerfirstName(rs.getString("FIRST_NAME"));
		prodcutbid.setBuyerPhone(rs.getString("PHONE"));
		prodcutbid.setBuyerEmail(rs.getString("EMAIL"));
		
		return prodcutbid;
	}
	
	

}
