package com.akshay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.entity.Product;
import com.akshay.repository.DataRepository;

@Service
public class ProductService {
	
	@Autowired
	DataRepository repo;
	public Product saveProduct(Product product)
	{
		return repo.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return repo.saveAll(products);
	}
	
	public List<Product> getProduct()
	{
		return repo.findAll();
	}

	public Product getProductById(Integer ProductId)
	{
		return repo.findById(ProductId).orElse(null);
	}
	/*public Product getProductByName(String ProductName)
	{
		return repo.findByName(ProductName);
	}*/
	public String deleteProduct(Integer productId)
	{
		 repo.deleteById(productId);
		 return "product with "+productId+" removed successfully ";
	}

	public Product updateProduct(Product product)
	{
		Product existingProduct=repo.findById(product.getProductId()).orElse(null);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductQuantity(product.getProductQuantity());
		existingProduct.setProductPrice(product.getProductPrice());
		return repo.save(existingProduct);
	}
	
	
}
