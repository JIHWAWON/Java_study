package ex03;

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;

              //반복자(데이터 순회하기)
public class IteratorCollection { // SetCollection
	public static void main(String[] args) {

//      List<String> list = new LinkedList<>();
		HashSet<String> list = new HashSet<String>();  //HashSet = 중복x 순서x

		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("box");

		for(String s :list) {   //중복을 허용하지 않는 Set형태
			System.out.println(s);
		}			
		System.out.println("---------set--------");
		
//-------------------------------------------------------------------
		Iterator<String> itr = list.iterator(); // list.iterator()를 호출하여 리스트에 대한 반복자(Iterator)를 획득

		String str;
		while (itr.hasNext()) { // 반복자(itr)를 통해 리스트의 요소에 접근, 다음 요소가 있나?
			str = itr.next(); // 다음 요소를 가져오기
			if (str.equalsIgnoreCase("box")) {
				itr.remove(); // 현재 요소를 제거
			}System.out.println(str);  //box, toy, robot

		}
		System.out.println("=============");

		itr = list.iterator(); // 반복자를 다시 획득 (초기화)
		while (itr.hasNext()) {
			str = itr.next();
			System.out.println(str); //robot,toy
		}
	}
}