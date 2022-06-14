package com.eval4;
import java.util.List;
import java.util.ArrayList;

public class Ecommerce {
	List<Product> productList=new ArrayList<>();
	public void addProductToList(Product product)
	{
		if(productList.contains(product))
		{
			for(Product p:productList)
			{
				p.setCount(p.getCount()+product.getCount());
			}
			System.out.println("Count updated Product already exists");
		}
		else {
			productList.add(product);
			System.out.println("Product added successfully");
		}
	}
	public  List<Product> showAllProducts()
	{
	    return productList;
	}
	

}
//-List<Product> productList=new ArrayList<>();
//-addProductToList(Product product) : void
//-showAllProduct():List<Product>