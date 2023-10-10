package test;

public class Cart implements CartInterface {

	static final int NUM_BOOK = 3;
	CartItem02 mCartItem = new CartItem02();
	static int mCartCount = 0;

	public Cart() {
	}

	public void printBookList(Book[] booklist) {
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getBookId() + " | ");
			System.out.println(booklist[i].getName() + " | ");
			System.out.println(booklist[i].getUnitPrice() + " | ");
			System.out.println(booklist[i].getAuthor() + " | ");
			System.out.println(booklist[i].getDescription() + " | ");
			System.out.println(booklist[i].getCategory() + " | ");
			System.out.println(booklist[i].getReleaseDate() + " | ");
			System.out.println("");
		}
	}

	public void insertBook(Book book) {
		mCartItem[mCartCount++] = new CartItem02(book);
	}

	public void deleteBook() {
		mCartItem = new CartItem02[NUM_BOOK];
		mCartCount = 0;
	}

	public void printCart() {
		System.out.println("장바구니 상품 목록 :");
		System.out.println("-------------------------------------------");
		System.out.println("  도서ID\t|     수량\t|     합계");

		for (int i = 0; i < mCartCount; i++) { // 장바구니에 담긴 상품 수만큼 반복
			System.out.print(mCartItem[i].getBookID() + "|");
			System.out.print("      " + mCartItem[i].getQuantity() + "\t| ");
			System.out.print("   " + mCartItem[i].getTotalPrice());
			System.out.println("   ");
		}
		System.out.println("-------------------------------------------");
	}

	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		for (int i = 0; i < mCartCount; i++) {
			if (bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
				flag = true;
			}
		}
		return flag;
	}

	public void removeCart(int numId) {
		CartItem[] cartItem = new CartItem[NUM_BOOK];
		int num = 0;

		for (int i = 0; i < mCartCount; i++) {
			if (numId != i)
				cartItem[num++] = mCartItem[i];

			mCartCount = num;
			mCartItem = cartItem;
		}
	}
}