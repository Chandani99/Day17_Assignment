package Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        Set <Song> song= new HashSet<>();
		
		song.add(new Song("Om shanti om","Ankho me teri.."));
		song.add(new Song("Kranti","dilwale dilwale tera nam kya h"));
		song.add(new Song("The Legend of Bhagat singh","Mera rang de basnati"));
		
		song.add(new Song("The Legend of Bhagat singh","Mera rang de basnati"));
		
		List <Song> song1=new ArrayList<>(song);
		PlayList pl=new PlayList();
		for(int i=0; i<song1.size(); i++) {
			pl.addSong(song1.get(i));

		}
		
		for(int j=0; j<pl.songs.size(); j++) {
			Song s=pl.songs.get(j);
			s.play();
		}

	}

}
