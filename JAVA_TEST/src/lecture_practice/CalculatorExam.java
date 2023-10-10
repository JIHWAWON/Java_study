package lecture_practice;

public class CalculatorExam {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 20);
		System.out.println(c.result1); // 30
		System.out.println(c.result2); // 0

		c.result2 = 123;
		
		Calculator cc = new Calculator();
		cc.add(100, 200);
		System.out.println(cc.result1); // 300
		System.out.println(cc.result2); // 123

	
		Calculator.result2=321;
		System.out.println(Calculator.result2);  //321
		
		Calculator.sub(10,5);
		System.out.println(Calculator.result2);  //5

	}

}
