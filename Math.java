package day0108;

import java.io.PrintStream;

public class Math {
	
	 public static double pi = 3.14; //final은 상수
	 //static은 공유의목적으로 쓰기에 멤버필드는 기본적으로 private이지만 static이 붙으면 public이 기본
	 //물론 보통 static은 final과 같이써요
	 public void disp() {
		 PrintStream out = System.out; //out 은 스태틱 멤버필드
		 //기본적으로 out은 멤버필드임 저거 클릭해보면 class System이라는곳의 멤버필드지만
		 //객체생성없이 System.out으로 호출가능 이유? static
	 }
	 
	 public static void display() {
		 System.out.println("static 메서드입니다.");
	 }
	 //static 메모리는 생성자가 초기화 해주지않아요~
	 //그럼 누가 디폴트값(힙에들어있는 멤버들)을 초기화 해줄까요? 물론 생성자로 호출되기야함
	 // static 초기화 블럭
	 static{ pi = 3.141592; System.out.println("static 초기화 블록");} //이렇게합니다 근데 사실 그냥 final이랑 같이쓰는시점에서
	 //그냥 다이렉트로 초기화 합니다.(파이널은 수정불가에요)
	 //이렇게 초기화 하면 static메서드의 초기값은저걸로됩니다.
}