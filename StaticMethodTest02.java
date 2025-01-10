package day0108;

public class StaticMethodTest02 {
	
	int no=1; //멤버필드 인스턴스 변수 인스턴스화를 해야만 쓸수있기때문에
	static String com="kh";
	
	void disp() {
		System.out.println("멤버 메서드입니다. 사용시 객체생성후 객체 변수로 접근가능");
		System.out.println(no);// 애는 왜되냐고? 그야 얘를 쓰려면 객체를만든후 불러야사용가능하기에 객체가 만들어지면 인스턴스 변수는 이미 인스턴스화됨
		print(); //이건가능
	}
	static void print() {
		StaticMethodTest02 obj = new StaticMethodTest02();
		System.out.println(obj.no);//static메서드에는 공유메모리안에없기때문에 즉 사용하기위해선 객체를 만들어야함
		//얘는 객체안만들어도 사용가능하기에 인스턴스화 하기전에 사용될수있기에 반드시 객체 만들고 써야함
		System.out.println(com + "static 필드 접근 가능");
		System.out.println("static 메서든 사용시 객체생성할 필요없이 사용가능 클래스이름.메서드()");
		//disp(); 이건 불가능
		obj.disp(); //이건가능
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
