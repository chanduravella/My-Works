package mylab.lab4.Exercise3;

public abstract class MediaItem extends Item{
	
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public MediaItem(int uidNo, String title, int noOfCopies, int runtime) {
		super(uidNo, title, noOfCopies);
		this.runtime = runtime;
	}
	
	

}
