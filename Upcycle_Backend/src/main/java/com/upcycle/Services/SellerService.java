package com.upcycle.Services;

import java.util.List;

import com.upcycle.Entity.Seller;



public interface SellerService {
	void registerSeller(Seller seller);
	List<Seller> allSellers();
	Seller findById(int id);
	Seller validate(String userid,String pwd);
	void deleteSeller(int id);
	
}
