package test;

public class CartItem02 {

//	private String[] itemBook = new String[7];
	private Book itemBook;

	private String bookID; // 도서 id
	private int quantity; // 수량
	private int totalPrice; // 합계

	// ===================================================================

	public CartItem02() { // 기본생성자
	}

//	  public CartItem02(String[] book) { //일반생성자(매개변수) this.itemBook = book;
//	  this.bookID = book[0]; this.quantity = 1; updateTotalPrice(); } //
//	  
//	  public String[] getItemBook() { return itemBook; }
//	  
//	  public void setItemBook(String[] itemBook) { this.itemBook = itemBook; }
//	 
	// ===================================================================

	public CartItem02(Book booklist) {
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.quantity = 1;
		updateTotalPrice();
	}

	public Book getItemBook() {
		return itemBook;
	}
	public void setItemBook(Book itemBook) {
		this.itemBook = itemBook;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	// ===================================================================

	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
//		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
		totalPrice = this.itemBook.getUnitPrice() * this.quantity;
	}

}
