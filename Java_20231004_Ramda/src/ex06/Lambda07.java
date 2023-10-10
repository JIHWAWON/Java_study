package ex06;

									  //Consumer = 값을 입력으로 받아서 결과를 반환하지 않고, 단순히 입력 값을 소비하거나 처리
import java.util.function.BiFunction; //BiFunction = 두 개의 매개변수를 받아 하나의 결과를 반환
import java.util.function.Function;   //Function = 하나의 매개변수를 받아, 하나의 결과를 반환

public class Lambda07 {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = x -> x * x; // Integer를 입력받아 Integer를 반환(람다)

		System.out.println(f1.apply(5));

		BiFunction<Integer, Integer, Integer> bif1 = (x, y) -> x + y; // Integer 두 개를 입력받아 Integer 하나를 반환

		bif1.apply(10, 10);
	}
}
