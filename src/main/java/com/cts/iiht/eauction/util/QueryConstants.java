package com.cts.iiht.eauction.util;

public class QueryConstants {

	public static final String ADD_SELLER = "INSERT INTO productdb.SELLER (SELLER_ID,FIRST_NAME,LAST_NAME,ADDRESS,CITY,STATE,PIN,PHONE,EMAIL) VALUES (?,?,?,?,?,?,?,?,?)";
	public static final String ADD_PRODUCT ="INSERT INTO productdb.PRODUCT (SELLER_ID,PRODUCT_NAME,SHORT_DESC,DETAILED_DESC,CATEGORY,STARTING_PRICE,BID_ENDDATE) VALUES (?,?,?,?,?,?,?)";
	public static final String PLACE_BID ="INSERT INTO productdb.BUYER_BID(PRODUCT_ID,FIRST_NAME,LAST_NAME,ADDRESS,CITY,STATE,PIN,PHONE,EMAIL,BID_AMOUNT) VALUES (?,?,?,?,?,?,?,?,?,?)";
	public static final String GET_PRODUCT ="select PRODUCT_NAME,SHORT_DESC,DETAILED_DESC,CATEGORY,STARTING_PRICE,BID_ENDDATE from productdb.product where product_id=?";
	public static final String SELECT_GET_PRODUCT = "select PRODUCT_ID,PRODUCT_NAME from productdb.PRODUCT order by product_name";
	
	public static final String GET_BIDS= "SELECT b.product_id,b.bid_amount,b.first_name,b.email,b.phone "
			+ "FROM productdb.seller as s join productdb.product as p "
			+ "ON s.seller_id=p.seller_id "
			+ "JOIN productdb.buyer_bid as b "
			+ "ON p.product_id = b.product_id "
			+ "WHERE p.PRODUCT_ID=? ORDER BY b.bid_amount desc";
	
	public static final String UPDATE_BID= "UPDATE productdb.BUYER_BID SET BID_AMOUNT=? WHERE PRODUCT_ID=? and EMAIL=?";
	public static final String DELETE_PRODUCT= "DELETE FROM productdb.PRODUCT WHERE PRODUCT_ID=?";
}
