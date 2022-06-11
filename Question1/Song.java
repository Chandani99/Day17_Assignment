package Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Song {
	private String movieName; 
	private String songName;
	
	public Song() {
		
	}
	
	public Song(String movieName, String songName) {
		this.movieName = movieName;
		this.songName = songName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
//===============Function====
	public void play() {
		System.out.println(songName+" song of movie "+movieName+" is playing");
	}
//=======================	
	@Override
	public String toString() {
		return "Song [movieName=" + movieName + ", songName=" + songName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}
	
	
	
	public static void main(String [] args) {
		
		
		
	}
}
