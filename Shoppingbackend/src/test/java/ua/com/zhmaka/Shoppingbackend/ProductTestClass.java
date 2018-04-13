package ua.com.zhmaka.Shoppingbackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.com.zhmaka.Shoppingbackend.dao.ProductDAO;
import ua.com.zhmaka.Shoppingbackend.dto.Product;

public class ProductTestClass {

	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("ua.com.zhmaka.Shoppingbackend");
		context.refresh();

		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	// @Test
	// public void testAddProduct()
	// {
	// product = new Product();
	//
	// product.setName("Oppo selfie S53");
	// product.setBrand("Oppo");
	// product.setDescription("This is some description for oppo mobile phones");
	// product.setUnitePrice(2500);
	// product.setActive(true);
	// product.setCategoryId(3);
	// product.setSupplierId(3);
	//
	// assertEquals("Adding Product to the table went wrong", true,
	// productDAO.add(product));
	//
	// }

	// @Test
	// public void featchAndUpdateProduct()
	// {
	// product = productDAO.get(6);
	// product.setQuantity(4);
	//
	// assertEquals("Featching or updating went wrong occasionally", true,
	// productDAO.update(product));
	// }

	// @Test
	// public void deleteProductTest()
	// {
	// product = productDAO.get(8);
	// assertEquals("Deleting product went wront occasionally", true,
	// productDAO.delete(product));
	// }
//	@Test
//	public void testListSizeProduct() {
//
//		assertEquals("Comparing lists size of producst went wrong", 8,productDAO.list().size() );
//
//	}
	
	@Test 
	public void testListActvieProducts() {
		assertEquals("Comparing lists size of active producst went wrong", 7,productDAO.listActiveProducts().size() );
	}
	
	@Test 
	public void testListActvieProductsByCategory() {
		assertEquals("Comparing lists size of active producst by category went wrong", 5,productDAO.listActiveProductsByCategory(3).size() );
	}
	@Test 
	public void testGetLatestActiveProducts() {
		assertEquals("Comparing  latest lists size of active producst by category went wrong", 2,productDAO.getLatestActiveProducts(2).size() );
	}
}
