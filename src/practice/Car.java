public class Car {
	private int Speed;
	private boolean Stop;
	
	public int getSpeed() {
		return Speed;
	}
	
	public void setSpeed(int Speed) {
		if(Speed < 0) {
			this.Speed = 0;
			return;
		}
	}
	
	public boolean isStop() {
		return Stop;
	}
	
	public void setStop(boolean Stop) {
		this.Stop = Stop;
		this.Speed = 0;
	}
	

}
