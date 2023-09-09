package assignment;

class Customer {
	int id;
	String name;
	double walletBalance;
	String address;

	public Customer(int id, String name, double walletBalance, String address) {
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}

}

class Item {
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;

	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}

}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String s) {
		super(s);
	}
}

class ItemOutOfStockException extends Exception {
	public ItemOutOfStockException(String s) {
		super(s);
	}
}

public class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {

		if (!i.isInStock) {
			throw new ItemOutOfStockException("item is out of stock.");
		} else if (i.price > c.walletBalance) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		} else {
			return "Order Successful";
		}
	}

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		Customer cusDet = new Customer(927589, "John", 50000.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 9500, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		try {
			String out = obj.purchaseItem(itemDet, cusDet);
			System.out.println(out);

		} catch (ItemOutOfStockException e1) {
			System.out.println(e1.getMessage());
		} catch (InsufficientBalanceException e2) {
			System.out.println(e2.getMessage());
		}

	}
}
