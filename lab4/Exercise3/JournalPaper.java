package mylab.lab4.Exercise3;

public class JournalPaper extends WrittenItem{
	
	private int yp;

	public JournalPaper(int uidNo, String title, int noOfCopies, String author, int yp) {
		super(uidNo, title, noOfCopies, author);
		this.yp = yp;
		
	}

	public int getYp() {
		return yp;
	}

	public void setYp(int yp) {
		this.yp = yp;
	}
	
	

}
