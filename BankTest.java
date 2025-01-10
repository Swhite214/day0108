package day0108;

public class BankTest {

	public static void main(String[] args) {
		Teller tell_1=new Teller(1,"카리나");
		
		for(int i=1; i<=10;i++) {
			tell_1.call();
		}
		tell_1.call();
		tell_1.deposit();
		tell_1.call();
		tell_1.withdraw();
		Teller tell_2=new Teller(2,"아이유");//엄연히 다른 공간에 할당됨 같은 객체일지라도
		tell_2.call();
		Teller tell_3=new Teller(3,"이다혜"); //그렇기에 번호표는 초기화됨 이때 쓰는게 static
		tell_3.call();
	}

}
