package lecture_practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice02 {
	public static void main(String[] args) {

		ArrayList a = new ArrayList(); // 문자 숫자 같이 넣을 수 있음, 요소를 추가하거나 삭제할 때 배열의 크기를 조절해야함, 데이터에 순차적으로 접근할 때 빠름
		//	List a =new ArrayList();
		a.add("kor");
		a.add(10);
		a.add(10.2);
		System.out.println(a);

		LinkedList b = new LinkedList(); // 문자 숫자 같이 넣을 수 있음, 요소를 중간에 추가하거나 삭제할 때 다른 요소와의 연결만 수정하면 됨(효율적)
		//	List a =new LinkedList();
		b.add(10);
		b.add("kor");
		b.add(10.2);
		System.out.println(b);

		for (Object o : a) // a에 있는 각 요소를 차례대로 o에 할당
			System.out.print(o + " ");
	}
}
