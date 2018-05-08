package entity;

public class Book extends Document{
	private String author;
	private int noPage;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoPage() {
		return noPage;
	}
	public void setNoPage(int noPage) {
		this.noPage = noPage;
	}
	@Override
	public String toString() {
		return
				this.getId()+", "+
				this.getNamePublisher()+", "+
				this.getNoRelease()+", "+
				this.getAuthor()+", "+
				this.getNoPage();
		
	}
}
