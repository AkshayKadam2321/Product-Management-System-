package com.akshay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.entity.Product;
import com.akshay.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	//@RequestMapping(method=RequestMethod.POST,value="/addProduct")
	@PostMapping("/addProduct")
	
	public Product addProduct(@RequestBody Product product)
	{
		
		return productservice.saveProduct(product);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return productservice.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProduct()
	{
		return productservice.getProduct();
	}
	
	@GetMapping("/product/{productId}")
	public Product findAllProductById(@PathVariable Integer productId)
	{
		return productservice.getProductById(productId);
	}
	
	/*@GetMapping("/product/{name}")
	public Product findAllProductByName(@PathVariable String productName)
	{
		return productservice.getProductByName(productName);
	}*/
	@PutMapping("/update/{productId}")

	public Product updateProduct(@RequestBody Product product)
	{
		return productservice.updateProduct(product);
	}
	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable int productId)
	{
		return productservice.deleteProduct(productId);
	}
}
