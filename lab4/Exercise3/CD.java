package mylab.lab4.Exercise3;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public CD(int uidNo, String title, int noOfCopies, int runtime,String artist,String genre) {
		super(uidNo, title, noOfCopies, runtime);
		
	}
	
	

}
