package main;

public class Quiz1 {

	public static void main(String[] args) {

		Calc calk = new Calculator(); // 형변환 
		
		if(calk instanceof Calculator) { // 타입 체크
			Calculator calculator = (Calculator)calk; // 다운캐스팅
			calculator.showInfo(); // 실제 인스턴스의 함수 사용
		}
	}

}
