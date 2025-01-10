package day0108;

public class StringTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "여로의 물결을 타고 무도회장에서 춤추자~";
		System.out.println(str.concat(" 어디든 갈수있어")); //뒤에 붙이기
		System.out.println(str);
		System.out.println("---");
		
		System.out.println(str.replace("여ㅁㅇㄴ", "야")); //이래도 오류가나진않네요 왼쪽단어를 오른쪽으로 바꿔주세요
		str = "필요한/모든것들을/다갖추고/왕의길로/마침내/들어서리라";
		String str1 [] = str.split("/");
		System.out.println(str1); //문자열 여러개형태인 배열이므로
	}

}
