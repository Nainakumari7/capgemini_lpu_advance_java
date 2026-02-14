package com.product;

import javax.management.Query;

import antlr.collections.List;

public class Demo {
	
	String jpql = "select p from Product p where p.price>=a and p.quant";
	Query query =em.createQuery(jpql);
	query.setParameter("a",5.0);
	query.setParameter("b", 0);
	
	List<Product> list = query.getResultList();
	for(product p:list) {
		System.out.println(p);
	}
	

	
	

}
