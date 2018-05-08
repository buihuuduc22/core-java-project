package entity;

public class Staff extends Employee {
	private String task;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return
				super.toString()+", "+
				this.getTask();
	}
}
