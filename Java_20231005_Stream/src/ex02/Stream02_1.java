package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PriceInfo2 {
	 String model;

	public PriceInfo2(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
}

public class Stream02_1 {
	public static void main(String[] args) {

		List<PriceInfo2> lists = new ArrayList<PriceInfo2>();

		lists.add(new PriceInfo2("가가"));
		lists.add(new PriceInfo2("나나나"));
		lists.add(new PriceInfo2("다다다다다"));

		
		lists.stream().filter(s -> s.getModel().length() >= 4).map(PriceInfo2::getModel)
				.forEach(s -> System.out.println(s));

	}
}
