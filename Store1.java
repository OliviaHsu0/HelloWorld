public class Store1 {
	String productType;
	
	public Store1(String product) {
		productType = product;
	
	}
	public void advertise() {
		System.out.println("Selling " + productType + "!");
		System.out.println("Come spend some money!");
	}
	
	
	public void greetCustomer(String customer) {
		System.out.println("Welcom to the store, " + customer + "!");
	}
	
	public static void main(String[] args) {
	Store1 lemonadeStand = new Store1("Lemonade");
    lemonadeStand.greetCustomer("Luara");
	
	}
	}
	

