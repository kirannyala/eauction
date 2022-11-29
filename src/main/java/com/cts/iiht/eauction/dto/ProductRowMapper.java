package com.cts.iiht.eauction.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.iiht.eauction.bean.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductName(rs.getString("PRODUCT_NAME"));
		product.setShortDesc(rs.getString("SHORT_DESC"));
		product.setDetailedDesc(rs.getString("DETAILED_DESC"));
		product.setCategory(rs.getString("CATEGORY"));
		product.setStartingPrice(rs.getString("STARTING_PRICE"));
		product.setBidEndDate(rs.getDate("BID_ENDDATE"));
		
		return product;
	}
	
	

}
