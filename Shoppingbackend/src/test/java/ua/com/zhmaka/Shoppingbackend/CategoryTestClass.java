package ua.com.zhmaka.Shoppingbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.com.zhmaka.Shoppingbackend.dao.CategoryDAO;
import ua.com.zhmaka.Shoppingbackend.dto.Category;

public class CategoryTestClass {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("ua.com.zhmaka.Shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

//	@Test
//	public void testAddCategory() {
//		category = new Category();
//		category.setName("Laptop");
//		category.setDescription("This is simple discription of Laptop");
//		category.setImageURL("CAT_3.png");
//
//		assertEquals("Successfully added a category inside thetable!", true, categoryDAO.add(category));
//
//	}

//	 @Test
//	 public void testGetCategory() {
//	 category = categoryDAO.getCategoryById(1);
//	
//	 assertEquals("Successfully fetched a single category from theDB","TV",category.getName());
//	 }

//	 @Test
//	 public void testUpdateCategory() {
//	 category = categoryDAO.getCategoryById(1);
//	
//	 category.setName("TVV");
//	
//	 assertEquals("Successfully updated a single category from the DB",true,categoryDAO.update(category));
//	 }

	// @Test
	// public void testDeleteCategory() {
	// category = categoryDAO.getCategoryById(1);
	//
	//
	// assertEquals("Successfully deleted a single category from the DB",true,categoryDAO.delete(category));
	// }
	
//	
//	 @Test
//		 public void testListCategory() {
//		 
//		 assertEquals("Successfully fetched a single list of category from the DB",3,categoryDAO.list().size());
//		 }
	
	
	@Test
	public void testCRUDCategory()
	{
		
		//testing a create operation	
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is simple discription of Laptop");
		category.setImageURL("CAT_1.png");
		assertEquals("Successfully added a category inside thetable!", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Television");
		category.setDescription("This is simple discription of TV");
		category.setImageURL("CAT_2.png");
		assertEquals("Successfully added a category inside thetable!", true, categoryDAO.add(category));

		
		//fetching and updating category
		category = categoryDAO.getCategoryById(2);
		
		category.setName("TV");
		
		assertEquals("Successfully updated a single category from the DB",true,categoryDAO.update(category));
		
		
		//deleting category
		 assertEquals("Successfully deleted a single category from the DB",true,categoryDAO.delete(category));
		 
		 //testing getting a list 
		 assertEquals("Successfully fetched a single list of category from the DB",1,categoryDAO.list().size());
		
		
	
		
			
	}
}
