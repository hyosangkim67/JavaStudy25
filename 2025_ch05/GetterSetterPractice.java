package ch05;

public class GetterSetterPractice {

	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
		
		public boolean isStop() {
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		} // stop이 true면 stop이고 스피드가 0
	}


