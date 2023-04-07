public class Order1 {
	boolean isFilled;
	double billAmount;
	String shipping;
	String couponCode;
	
	public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
			System.out.println("Hight value item!");
		}
		isFilled = filled;
		billAmount = cost;
		shipping = shippingMethod;
		couponCode = coupon;
	}
	
	public void ship() {
		if (isFilled) {
			System.out.println("Shipping");
			System.out.println("Shipping cost: " + calculateShipping());
		} else {
			System.out.println("Order not ready");
		}
	}
}