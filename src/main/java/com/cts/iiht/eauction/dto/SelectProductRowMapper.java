package com.cts.iiht.eauction.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cts.iiht.eauction.bean.Product;
import com.cts.iiht.eauction.bean.SelectProduct;

public class SelectProductRowMapper implements RowMapper<SelectProduct>{

	@Override
	public SelectProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SelectProduct product = new SelectProduct();
		product.setProductId(rs.getString("PRODUCT_ID"));
		product.setProductName(rs.getString("PRODUCT_NAME"));
		
		return product;
	}
	
	

}
