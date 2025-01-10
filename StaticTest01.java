package day0108;

public class StaticTest01 {

	public static void main(String[] args) {
		// 기존에는 Math math = new Math();로 new로 인스턴스화(객체를힙메모리에할당작업)
		//후 생성자를 호출하여 객체를 만들어야 접근이 가능했지만
		System.out.println(Math.pi);//객체없이도 불러지네요? 다른클래스인데?
		//static을 사용하면 객체를 만들필요없이 클래스이름.멤버필드로 접근이 가능해요!
		//이렇게 접근되는 변수를 클래스 변수라고 부릅니다.
		Math.display(); //와! 메서드도 static이면 그냥 부를수있네요
		//당연히 남발하면 메모리공간 낭비에요
		//static은 생생자가 담당하진 않아요(객체 안만들었으니 당연하지)
	
	}

}
