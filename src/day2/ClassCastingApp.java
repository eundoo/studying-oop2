package day2;

public class ClassCastingApp {

	public static void main(String[] args) {
		Panzer car1 = new Panzer();
		PoliceCar car2 = new Panzer();
		Car car3 = new Panzer();

		System.out.println("### Panzer 타입의 참조변수를 Panzer 타입의 참조변수로 Panzer객체 참조하기");
		//Panzer 객체의 메소드 사용가능
		car1.setWeapon("기관총");
		car1.fireWeapon();
		//PoliceCar 객체의 메소드 사용가능 <- Panzer의 상위 클래스임
		car1.patrol();
		//Car객체의 메소드 사용가능 <- PoliceCar상위 클래스임
		car1.setColor("검정색");
		car1.drive();
		car1.stop();
		
		System.out.println("### PoliceCar 타입의 참조변수로 Panzer 객체 참조하기");
		//Panzer객체의 메소드 사용가능
		//Car2.setWeapon("기관총")	//오류 - 사용불가
		//Car2.fireWeapon();		//오류 - 사용불가
		//PoliceCar 객체의 메소드 사용가능 <- Panzer의 상위 클래스임
		car2.patrol();
		//Car객체의 메소드 사용가능 <- PoliceCar상위 클래스임
		car2.setColor("파랑색");
		car2.drive();
		car2.stop();
		
		System.out.println("### Car 타입의 참조변수로 Panzer객체 참조하기");
		//Panzer객체의 메소드 사용가능
		//Car3.setWeapon("기관총")	//오류 - 사용불가
		//Car3.fireWeapon();		//오류 - 사용불가
		//PoliceCar객체의 메소드 사용가능 <- Panzer의 상위 클래스명
		//car3.patrol();			//오류 - 사용불가
		//Car객체의 메소드 사용가능 <- PoliceCar의 상위 클래스임
		car3.setColor("검정색");
		car3.drive();
		car3.stop();
	}
}
