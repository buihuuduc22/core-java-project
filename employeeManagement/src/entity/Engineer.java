package entity;

public class Engineer extends Employee {
	private String specialized;//chuyên môn

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}
	@Override
	public String toString() {
		return
				super.toString()+", "+
				this.getSpecialized();
	}
}
