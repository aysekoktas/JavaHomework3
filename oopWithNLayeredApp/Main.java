package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateDao;
import oopWithNLayeredApp.dataAccess.JdbcDao;
import oopWithNLayeredApp.entities.Categories;
import oopWithNLayeredApp.entities.Courses;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		   Courses course1 = new Courses("C", 1, 1000);
	       Courses course2 = new Courses("C#", 1, 200);

	       ILogger[] loggers = new ILogger[]{new DatabaseLogger(), new FileLogger()};
	       

	       CourseManager myCourseManager = new CourseManager(new HibernateDao(), new FileLogger());
	       myCourseManager.addCourse(course1);
	       myCourseManager.addCourse(course2);
	       
	       
	       
	       CategoryManager myCategoryManager = new CategoryManager(new JdbcDao(), new DatabaseLogger());
	       Categories category1 = new Categories(1, "Yazılım");
	       Categories category2= new Categories(1, "Yazılım");
	       
	       myCategoryManager.addCourse(category2);
	       myCategoryManager.addCourse(category1);
	       
	       
	       
	}
}
