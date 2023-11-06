package mylab.lab4.Exercise3;

public abstract class WrittenItem extends Item{
	
	private String author;

	public WrittenItem(int uidNo, String title, int noOfCopies, String author) {
		super(uidNo, title, noOfCopies);
		this.author = author;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
