package ar.edu.unlp.oo1.ejercicio1;

public class WallPostImpl implements WallPost{
	private String texto;
	private int likes;
	private boolean featured;
	
	
	public WallPostImpl() {
		this.texto = "Undefined post";
		this.likes = 0;
		this.featured = false;
	}
	
	public void like() {
		this.likes++;
	}
	
	public void setText(String unTexto) {
		this.texto = unTexto;
	}
	
	public String getText() {
		return this.texto;
	}
	
	public void dislike() {
		this.likes--;
	}
	
	public void toggleFeatured() {
		if (this.featured == true) {
			this.featured = false;
		}
		else {
			this.featured = true;
		}
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	public boolean isFeatured() {
		return this.featured;
	}
	
	
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}
	
	
