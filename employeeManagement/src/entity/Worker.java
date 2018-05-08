package entity;

public class Worker extends Employee {
	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return
				super.toString()+", "+
				this.getLevel();
	}
}
