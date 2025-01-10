package day0108;

public class StringTest04 {

	public static void main(String[] args) {
		// 문자열 추출
		String str = "0123456789";
		str="가나다라마바사";
		System.out.println(str.substring(1)); //()괄호안에있는 인덱스 번호부터 끝까지 출력해줘 원본 변화 없음
		System.out.println(str.substring(3, 6)); //앞의 숫자부터 뒤에숫자까지(인덱스)
		System.out.println(str.substring(4, str.length()-1));
		
		//문자열 위치값을 이용해서 하나만 추출
		System.out.println(str.charAt(2)); //문자열로 지정된거 문자 하나만 char형식으로 리턴
	}

}
