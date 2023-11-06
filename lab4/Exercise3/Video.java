package mylab.lab4.Exercise3;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yr;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	
	public Video(int uidNo, String title, int noOfCopies, int runtime, String director, String genre, int yr) {
		super(uidNo, title, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yr = yr;
		
	}

}
