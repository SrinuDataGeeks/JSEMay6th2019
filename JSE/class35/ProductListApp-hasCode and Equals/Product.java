package com.google.bean;

public class Product
	{
private Integer productId ;
private String productName;
private Float productPrice;

public Product()
{
}

public Product(Integer productId , String productName,Float productPrice)
	{
this.productId = productId;
this.productName  = productName;
this.productPrice = productPrice;
	}

//write setters

public Integer getProductId()
{
	return productId;
}

public String getProductName()
{
	return productName;
}

public Float getProductPrice()
	{
	return productPrice;
	}
@Override
public boolean equals(Object obj)
{
	Product p = (Product) obj;

	if(this.productId == p.getProductId())
		{
	return true;
		}
	else
	{
	return false;
	}
	
}

@Override
public int hashCode()
{
	return this.productId;
}
	}








