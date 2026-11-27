package book_library;

public class book {
	int bid;
	String bname;
	String baddress;
	public book(int bid, String bname) {
		this.bid = bid;
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "book [bid=" + bid + ", bname=" + bname + ", baddress=" + baddress + "]";
	}
	

}
