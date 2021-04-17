package day5.inner;

public class Outer2App {

	public static void main(String[] args) {

		//new 외부클래스명.정적내부클래스생성자()
		//클래스명.정적변수
		//클래스명.정적메소드()
		
		//외부클래스에 대한 객체 생성 없이도 정적내부 클래스를 사용할 수 있다.
		Outer2.Inner inner = new Outer2.Inner();	//Outer클래스안에 Inner클래스에 대한 객체생성만 한것?
		inner.innerMethod();
		
		//아래의 정적변수, 정적메소드처럼 정적내부클래스로 객체생성 할 수 있다.
		System.out.println("정적변수: " + Outer2.y);
		Outer2.test2();
		
	}

}
