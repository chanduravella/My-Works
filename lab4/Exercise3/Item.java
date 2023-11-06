package mylab.lab4.Exercise3;

public abstract class Item {
	
	private int uidNo;
	private String title;
	private int noOfCopies;
	public int getUidNo() {
		return uidNo;
	}
	public void setUidNo(int uidNo) {
		this.uidNo = uidNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public Item(int uidNo, String title, int noOfCopies) {
		super();
		this.uidNo = uidNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	
	

}
