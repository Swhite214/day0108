package day0108;

public class StringTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 변환
		String str1 = "HELLO";
		System.out.println(str1.toLowerCase()); //물론 1회용임 저값을따로 하나 만들어서 저장하지않는이상 원본이 바뀌지 않아요! 다시 돌아옴 이게 문자열의 불변성 규칙
		String str2 = "hello";
		System.out.println(str2.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1);
		char asd [] = {'a','b','c','d','e','f'};
		System.out.println(asd[0]); //asd.index 이거아님 이건 length
		//trim 필요없는 공백 처음과 마지막만 중간은제외 없애줌
		
	}

}
