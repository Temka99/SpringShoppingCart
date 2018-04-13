package ua.com.zhmaka.Shoppingbackend.dao;

import java.util.List;

import ua.com.zhmaka.Shoppingbackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId );
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	
	//business logic
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	

}
