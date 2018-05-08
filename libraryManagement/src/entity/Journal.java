package entity;

public class Journal extends Document {
	private int idRelease;//số xuất bản
	private String monthRele;//month release
	public int getIdRelease() {
		return idRelease;
	}
	public void setIdRelease(int idRelease) {
		this.idRelease = idRelease;
	}
	public String getMonthRele() {
		return monthRele;
	}
	public void setMonthRele(String monthRele) {
		this.monthRele = monthRele;
	}
	@Override
	public String toString() {
		return
				this.getId()+", "+
				this.getNamePublisher()+", "+
				this.getNoRelease()+", "+
				this.getIdRelease()+", "+
				this.getMonthRele();
	}
	
}
