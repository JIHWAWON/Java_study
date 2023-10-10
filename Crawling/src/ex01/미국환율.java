package ex01; //<크롤링> 

//ex) 1.자바프로젝트+클래스 만들기  2.네이버-F12검사-부분복사Ctrl+v 3.메이븐에서 jsoup다운 4.프로젝트Bildpath에 jar추가 5.밑에 작 

import java.io.IOException;
import org.jsoup.Jsoup; //import를 jsoup로 하기 
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 미국환율 {

	public static void main(String[] args) throws IOException { // throws IOException으로 예외 처리

		Document doc = Jsoup.connect( // connect() 메서드를 사용하여 지정된 URL에서 웹 페이지를 가져와서 Document 객체에 저장
				"https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%AF%B8%EA%B5%AD%ED%99%98%EC%9C%A8")
				.get();
//		System.out.println(doc);

		// Document에서 원하는 HTML 요소를 선택
//		Elements value =doc.getElementsByAttributeValue("class", "nb_txt_sub_price");   // 환율 정보를 포함한 텍스트 정보
//		Elements value =doc.getElementsByAttributeValue("class", "compare_section");  // 그 중 환율을 비교하는 부분
		Elements value = doc.getElementsByAttributeValue("class", "input_box _input_box"); // 그 중 입력 상자와 관련된 경우
//		Elements value = doc.getElementsByAttributeValue("class", "recite _recite"); 
		
		System.out.println(value);
		System.out.println(value.get(0).text());
		System.out.println(value.get(1).text());
	}
}
