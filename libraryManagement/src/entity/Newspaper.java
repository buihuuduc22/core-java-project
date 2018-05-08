package entity;

public class Newspaper extends Document {
	private String dateRele;//date release

	public String getDateRele() {
		return dateRele;
	}

	public void setDateRele(String dateRele) {
		this.dateRele = dateRele;
	}
	@Override
	public String toString() {
		return
				this.getId()+", "+
				this.getNamePublisher()+", "+
				this.getNoRelease()+", "+
				this.getDateRele();
	}
}
