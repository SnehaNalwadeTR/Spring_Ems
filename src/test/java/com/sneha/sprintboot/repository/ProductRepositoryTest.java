package com.sneha.sprintboot.repository;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sneha.sprintboot.model.Products;


@SpringBootTest
class ProductRepositoryTest {

	@Autowired
	private ProductsRepository pr;
	
	
	@Test
	public void saveMethod() {
		Products pd1 = new Products();
		pd1.setPName("test1");
		pd1.setPQuanity(100);
		
		Products savedProduct = pr.save(pd1);
		System.out.println(savedProduct.getPtId());
		System.out.println(savedProduct.toString());
		
		
	}
	
	@Test
	public void update() {
		Integer i = 1;
		Products pd = pr.findById(i).get();
		pd.setPName("updatedproduct");
		pd.setPQuanity(300);
		pr.save(pd);
		
	}
}
