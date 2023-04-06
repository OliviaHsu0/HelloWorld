public class LogicOperator {
	public static void main(String[] args) {
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		if(age > 20 & age < 90) {
			System.out.println("ok200");
		}
	}
}