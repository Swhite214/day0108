package day0108;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "HELLO";
		String str2 = "hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//대 소문자 무시
		System.out.println(str2.equalsIgnoreCase(str1));//대 소문자 무시
	}

}
