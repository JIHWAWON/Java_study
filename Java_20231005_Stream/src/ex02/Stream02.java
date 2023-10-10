package ex02;

import java.util.ArrayList;
import java.util.List;

class PriceInfo {
	private String model; // 멤버변수
	private int price;

	public PriceInfo(String model, int price) { // 일반생성자
		this.model = model;
		this.price = price;
	}

	public int getPrice() { // getter
		return price;
	}

}

public class Stream02 {

	public static void main(String[] args) {

		List<PriceInfo> lists = new ArrayList<PriceInfo>();
		// PriceInfo 객체를 저장하기 위한 비어있는 ArrayList를 생성, lists에 참조, PriceInfo 객체를 추가하거나 변경.
		
		lists.add(new PriceInfo("Toy", 500));
		lists.add(new PriceInfo("Robot", 1500));
		lists.add(new PriceInfo("Box", 700));

		int sum = lists.stream().filter(s -> s.getPrice() > 500).mapToInt(s -> s.getPrice()).sum();
		//mapToInt를 통해서 (PriceInfo 객체)의 가격 정보만을 추출하여 -> 정수형으로 변환
		System.out.println(sum);

	}

}
