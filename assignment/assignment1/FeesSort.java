package assignment.assignment1;

import java.util.Comparator;

public class FeesSort implements Comparator<Course>{
		String type;

		public FeesSort(String type) {
			this.type=type;
		}

		@Override
		public int compare(Course o1, Course o2) {
			if(type.equals("ASC")) {
				if(o1.fees>o2.fees) return 1;
				if(o1.fees<o2.fees) return -1;
				return 0;
			}
			else {
				if(o1.fees<o2.fees) return 1;
				if(o1.fees>o2.fees) return -1;
				return 0;
			}
			
		}

	}


