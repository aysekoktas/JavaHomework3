package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Categories;
import oopWithNLayeredApp.entities.Courses;
import oopWithNLayeredApp.entities.Instructors;

public class JdbcDao implements IDao {

	@Override
	public void addCategories(Categories categories) {
		System.out.println("Added with JDBC category name = " + categories.getName());
	}

	@Override
	public void addCourses(Courses courses) {
		System.out.println("Added with JDBC course name =" + courses.getName() + 
				"and course price =" +courses.getPrice());
	}

	@Override
	public void addInstructors(Instructors instructors) {
		System.out.println("Added with JDBC instructor name = " + instructors.getName());	
	}

}
