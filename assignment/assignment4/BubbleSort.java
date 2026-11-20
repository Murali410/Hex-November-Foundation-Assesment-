package assignment.assignment1assignment2;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1]-(arr[j+1]=arr[j]);
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {42,17,35,8,36};
		bubbleSort(arr);
	}

}
