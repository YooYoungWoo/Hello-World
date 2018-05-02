public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setSpeed(-50);  // 비정상적인 속도값 변경
		
		System.out.println("Now Speed: " +car.getSpeed());
		
		car.setSpeed(60);
		
		System.out.println("Now Speed: " +car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
	}

}
