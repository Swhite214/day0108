package day0108;

public class StringTest05 {

	public static void main(String[] args) {
		// 문자열 검색 : indexOf()
		String str = "안녕하세요. 반가워요!! 문자열 관련 메서드 처리중입니다.";
		System.out.println(str.indexOf("메서드"));//문자열 검색기능 일치하는 첫번째값의 앞글자기준 인덱스 제공 존재하지않으면 -1
		
		System.out.println(str.lastIndexOf("!")); //일치하는 값중 마지막 발생한 데이터의 인덱스
		System.out.println(str.contains("반가워요")); //결과값 true or false

	}

}
