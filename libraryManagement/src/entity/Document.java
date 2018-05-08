package entity;

public class Document implements Comparable<Document> {
	private String id;
	private String namePublisher;
	private int noRelease;//number of release;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNamePublisher() {
		return namePublisher;
	}
	public void setNamePublisher(String namePublisher) {
		this.namePublisher = namePublisher;
	}
	public int getNoRelease() {
		return noRelease;
	}
	public void setNoRelease(int noRelease) {
		this.noRelease = noRelease;
	}
	@Override
	public int compareTo(Document d) {
		return this.id.compareTo(d.id);
	}
	
}
