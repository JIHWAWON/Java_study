package ex07;

public class MethodReference {
	public static void main(String[] args) {

		Person person = new Person();

		person.action(new Calcu() {

			@Override
			public double cal(double x, double y) {
				return x + y;
			}
		});
		System.out.println("----------------------------------------------");
		person.action((x, y) -> x + y);
		System.out.println("----------------------------------------------");

	}
}
