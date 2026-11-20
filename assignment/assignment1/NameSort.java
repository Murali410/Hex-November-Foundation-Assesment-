package assignment.assignment1;

import java.util.Comparator;

public class NameSort implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		if(o1.name.compareTo(o2.name) >1) return 1;
		else if(o1.name.compareTo(o2.name) < 1) return -1;
		else return 0;
	}

}
