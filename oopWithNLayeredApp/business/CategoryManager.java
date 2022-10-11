package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.IDao;
import oopWithNLayeredApp.entities.Categories;
import oopWithNLayeredApp.entities.Courses;

public class CategoryManager {
	private IDao iDao;
	private ArrayList<Categories> categories = new ArrayList<Categories>();
	private ILogger iLogger;
	
	public void getCategories() {
		System.out.println("My category:");
		for (Categories currCategory: this.categories) {
            System.out.println("- "+ currCategory.getName());
        }
	}
	
	 public CategoryManager(IDao iDao, ILogger iLogger) {
	        this.iDao = iDao;
	        this.iLogger = iLogger;
	    }
	 
	 
	 public void addCourse(Categories categories) throws Exception{
	       if(this.categories.size() > 0){
	           for (Categories currentCategory: this.categories) {
	               if(currentCategory.getName() == categories.getName()){
	                   throw new Exception("Category name already used!");
	               }
	           }
	       }
     } 
	 
	 
}
