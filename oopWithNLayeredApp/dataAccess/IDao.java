package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Categories;
import oopWithNLayeredApp.entities.Courses;
import oopWithNLayeredApp.entities.Instructors;

public interface IDao {
	
	void addCategories(Categories categories);
	void addCourses(Courses courses);
	void addInstructors(Instructors instructors);
	

}
