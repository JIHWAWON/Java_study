package ex02;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버경제뉴스 {

	public static void main(String[] args) throws IOException {

		int pages = 2; // 크롤링할 페이지 수

		for (int i = 0; i < pages; i++) { // 1차 반복문 = 페이지 수 만큼 반복(전체 묶기)

			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=259&sid1=101&mid=shm&date=20220501&page="
					+ i; // 크롤링할 페이지의 URL을 생성, i페이지번호

			Document doc = Jsoup.connect(url).get(); // Jsoup을 사용하여 웹페이지의 HTML문서를 가져오기

			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body"); // 1차 요소선택

			// System.out.println(elements.size()); //기사 갯수

			// System.out.println(elements.get(0));

			Element element = elements.get(0); // 선택한 요소 중 첫 번째 요소

			Elements photoelements = element.getElementsByAttributeValue("class", "photo"); // "photo" 클래스를 가진 하위 요소

//------------------------------------------------------------------------------------------------------------------//

			for (int j = 0; j < photoelements.size(); j++) { // 2차 반복문 = 각 기사의 (제목, 이미지 링크, 내용) 추출

				Element newelements = photoelements.get(j);

				// System.out.println(newelements);

				Elements a_newelements = newelements.select("a");

				Element a_newelement = a_newelements.get(0);

				// System.out.println(a_newelement);

				String newUrl = a_newelement.attr("href"); // 기사링크

				// System.out.println(newUrl);

				Elements imgelements = newelements.select("img");

				// System.out.println(imgelements.size() );

				Element imgelement = imgelements.get(0);

				// System.out.println(imgelement);

				String imgUrl = imgelement.attr("src"); // 이미지 링크

				// System.out.println(imgUrl);

				String title = imgelement.attr("alt"); // 기사 제목

				// System.out.println(title);

//------------------------------------------------------------------------------------------------------------------//

				Document detailDoc = Jsoup.connect(newUrl).get(); // 기사 제목클릭 상세기사로 이동 주소

				// System.out.println(detailDoc);

				Element contentemement = detailDoc.getElementById("dic_area");

				// System.out.println(contentemement.text()); //br태크 있는 것은 text()로 기사 내용만 검색

				String content = contentemement.text(); // 기사 내용 추출

				System.out.println(title);

				System.out.println(content);

				System.out.println();
			} // 2차 반복문 끝
			
//------------------------------------------------------------------------------------------------------------------//

		} // 1차 반복문 끝
	}
}