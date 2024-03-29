package com.productapp.repository;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
@Mapper
public interface IProductRepository {
	
	@Insert("insert into product(product_name,brand,price,category) values(#{productName},#{brand},#{price},#{category})")
	void addProduct(Product product);
	
	@Update("update product set price=#(price) where product_id=#{productId}")
	void updateProduct(Product product);
	
	@Delete("delete from product where product_id = #{productId} ")
	void deleteProduct(int productId);
	
	@Select("select * from product where product_id=#{productId}")
	Product findById(int productId)throws ProductNotFoundException;
	
	@Select("select *  from product")
	List<Product> findAll();
	
	@Select("select * from product where brand=#{brand}")
	List<Product>findByBrand(String brand)throws ProductNotFoundException;
	
	@Select("select * from product where price=#{price}")
	List<Product>findByLesPrice(double price)throws ProductNotFoundException;
	
	@Select("select * from product where category=#{category}")
	List<Product>findByCategoryandPrice(String category,double price )throws ProductNotFoundException;
	
}
