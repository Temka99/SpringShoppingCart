package ua.com.zhmaka.Shoppingbackend.dao;

import java.util.List;

import ua.com.zhmaka.Shoppingbackend.dto.Category;


public interface CategoryDAO {
	
	
	boolean update(Category category);
	boolean delete(Category category);
	boolean add(Category category);
	List<Category> list();
	Category getCategoryById(int id);
}
