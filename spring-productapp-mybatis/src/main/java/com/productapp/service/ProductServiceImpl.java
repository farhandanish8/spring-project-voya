package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository iProductRepository;
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		iProductRepository.addProduct(product);
		
	}
	@Override
	public void updateProduct(int productId, double price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getByLesPrice(double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getByCategoryandPrice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void updateProduct(int productId,double price) {
//		// TODO Auto-generated method stub
//		iProductRepository.updateProduct(productId , price);
//	}
//
//	@Override
//	public void deleteProduct(int productId) {
//		// TODO Auto-generated method stub
//		iProductRepository.deleteProduct(productId);
//	}
//
//	@Override
//	public Product getById(int productId) {
//		// TODO Auto-generated method stub
//		return iProductRepository.getById(productId);
//	}
//
//	@Override
//	public List<Product> getAll() {
//		// TODO Auto-generated method stub
//		return iProductRepository.getAll();
//	}
//
//	@Override
//	public List<Product> getByBrand(String brand) {
//		// TODO Auto-generated method stub
//		return iProductRepository.getByBrand(brand);
//	}
//
//	@Override
//	public List<Product> getByLesPrice(double price) {
//		// TODO Auto-generated method stub
//		return iProductRepository.getByLesPrice(price) ;
//	}
//
//	
//	@Override
//	public List<Product> getByCategoryandPrice(String category, double price) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		return iProductRepository.getByCategoryandPrice(category, price);
//	}
//
//	@Override
//	public void updateProduct(Product product) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Product findById(int productId) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> findByBrand(String brand) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> findByLesPrice(double price) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Product> findByCategoryandPrice(String category, double price) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
