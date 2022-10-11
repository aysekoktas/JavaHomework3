package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.IDao;
import oopWithNLayeredApp.entities.Courses;

public class CourseManager {
	private IDao iDao;
	private ArrayList<Courses> courses =new ArrayList<Courses>();
	private ILogger iLogger;
	
	public void getCourses() {
		System.out.println("My courses:");
		for (Courses currCourse: this.courses) {
            System.out.println("- "+ currCourse.getName());
        }
	}
	
	public CourseManager(IDao iDao, ILogger iLogger) {
        this.iDao = iDao;
        this.iLogger = iLogger;
    }
	
	public void addCourse(Courses course) throws Exception{
	       if(this.courses.size() > 0){
	           for (Courses currentCourse: this.courses) {
	               if(currentCourse.getName() == course.getName()){
	                   throw new Exception("Course name already used!");
	               } 
	           }
	       }
	       if(course.getPrice() <= 0){
	           throw new Exception("Price has to be greater than 0");
	       }
	       this.courses.add(course);
	       this.iDao.addCourses(course);
    }
}
