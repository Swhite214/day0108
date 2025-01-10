package day0108;

public class Teller {
	static int genNum;
	String tellerName;
	int tellNO;
	static {
		System.out.println("번호표가 준비되었습니다."); //공유메모리에잇으므로 한번만 실행 공유메모리에있으면 일단 거기뒤져보고있으면 다시만들지않고 참조해서 그거갖다씀
		genNum=1; //이런식으로 스태틱 필드로 초기화 해야함
	}
	
	public Teller(int telNO, String tellerName) { //생성자
		this.tellerName=tellerName;
		tellNO = telNO;
		//genNum을 생성자에서 초기화하면 무효임 왜냐하면 static은 초기화를 생성자를 통해하지않으므로 만약하게되면 공유안됨
		
	
	}
	public void call() {
		System.out.println(genNum + "번 고객님 어서오세요!");
		System.out.println(genNum + "번 고객님 "+ tellNO + "번 " + tellerName + "의 창구로 와주세요");
		genNum++;
	}
	
	public void deposit() {
		System.out.println("입금 처리 합니다.");
		
	} //...입금 영어임
	
	public void withdraw() {
		System.out.println("출금 처리 합니다.");
	} //출금 영어임
	
}
