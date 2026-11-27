package book_library;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {
	static int bookShelf=3;
	static int bookShelfLoc=3;
	static String[][] library=new String[3][3];
	public static void main(String[] args) {
		book b1=new book(1,"Harry Potter 1");
		book b2=new book(2,"Harry Potter 2");
		book b3=new book(3,"Harry Potter 3");
		book b4=new book(4,"Harry Potter 4");
		book b5=new book(5,"Harry Potter 5");
		b1.baddress=hashAddress(b1);
		b2.baddress=hashAddress(b2);
		b3.baddress=hashAddress(b3);
		b4.baddress=hashAddress(b4);
		b5.baddress=hashAddress(b5);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		Map<Integer,book> map=new HashMap<>();
		map.put(b1.bid,b1);
		map.put(b2.bid,b2);
		map.put(b3.bid,b3);
		map.put(b4.bid,b4);
		map.put(b5.bid,b5);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book id:");
		int id=sc.nextInt();
		System.out.println(map.get(id));
		
	}
	private static String hashAddress(book b) {
		int shelfNo=b.bid%bookShelf;
		for(int loc=0;loc<library.length;loc++) {
			if(library[shelfNo][loc]==null) {
				library[shelfNo][loc]="Book" + b.bid;
				return b.bid+"#"+"S"+(shelfNo+1)+"#"+"L"+(loc+1);
			}
		}
		return "No space available";
	}

}
