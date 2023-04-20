package com.vobi.demo.stream.jukebox;

import java.util.List;
import java.util.stream.Collectors;

public class ListAllSongs {
	
	public static void main(String[] args) {
		 List<Song> allSongs=Songs.getSongs();
		 
		 List<Song> songs = allSongs
				 .stream()
				 .collect(Collectors.toList());
		 
		 System.out.println(songs);
	}

}
