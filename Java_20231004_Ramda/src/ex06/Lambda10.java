package ex06;

import java.util.function.Function;

public class Lambda10 {
	public static void main(String[] args) {

		Function<Integer[], Integer> f =  

		
			arr -> {
				int sum = 0;
				for (int i : arr)
					sum += i;
				return sum;
			
		};

 int result = f.apply(new Integer[] { 1, 2, 3, 4, 5 });
		System.out.println(result);

	}

}
