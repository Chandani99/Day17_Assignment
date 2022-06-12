package Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		List <Song> song1=new ArrayList<>();
		for(int i=1; i<=2; i++) {
			System.out.println("Enter movie name");
			
			String movieNa=sc.next();
			
	        System.out.println("Enter song name");
			
			String songNa=sc.next();
			
			song1.add(new Song(movieNa,songNa));
		}
		
		
		
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
