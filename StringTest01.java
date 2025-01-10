package day0108;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";//리터널 방식 이건 #상수풀
		String str2 = new String("Hello"); //인스턴스화
		String str3 = new String("Hello"); //위에놈이랑 다름 이건 #힙에 할당
		String str4 = "Hello"; //이건 1이랑 같음 상수풀은 같은 값이면 같은메모리공간에 할당
		System.out.println(str2);
		System.out.println("str1 == str2 : " + str1 == str2);
		System.out.println("str1 == str2 : " + str3 == str2);
		System.out.println("str1 == str2 : " + str1 == str4); //아 이거 이유를 알았다 ㅋㅋ;;
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
	}

}
