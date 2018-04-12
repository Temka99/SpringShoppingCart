package ua.com.zhmaka.Shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.zhmaka.Shoppingbackend.dao.CategoryDAO;
import ua.com.zhmaka.Shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();
	
	

	@Override
	public List<Category> list() {
		String  selectAvtivCategory = "FROM Category WHERE active  = :active";
		Query query  = sessionFactory.getCurrentSession().createQuery(selectAvtivCategory);
		
		query.setParameter("active", true);
		return query.getResultList();
	}



	@Override
	public Category getCategoryById(int id) {
	 return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}



	@Override
	
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
	}
	

}
