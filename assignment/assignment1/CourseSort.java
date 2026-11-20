package assignment.assignment1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CourseSort {
public static void main(String[] args) {
	Course c1=new Course(101,"Java",1200);
	Course c2=new Course(102,"python",100);
	Course c3=new Course(103,"react",200);
	Course c4=new Course(104,"SQL",15200);
	Course c5=new Course(105,"angular",12300);
	Course c6=new Course(6,"Java",120560);
	List<Course> list=new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6));
	Collections.sort(list,new FeesSort("ASC"));
	System.out.println(list);
	Collections.sort(list,new FeesSort("DESC"));
		System.out.println(list);
	Collections.sort(list,new NameSort());
	System.out.println(list);
		
	}

	
	

}


