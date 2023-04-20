package com.vobi.demo.stream.color;

import java.util.List;
import java.util.stream.Collectors;

public class ColorSortedList {

	public static void main(String[] args) {
		List<String> colors=List.of("Red","Orange","Yellow","Green","Blue","Purple","Pink","White","Gray","Brown","Black");
	
		System.out.println("Lista sin Ordenar");
		System.out.println(colors);
		
		
		List<String> colorsSorted=colors
				.stream()
				.sorted()
				//.skip(1)
				//.limit(6)
				.collect(Collectors.toList());
		
		System.out.println("Lista Ordenada");
		System.out.println(colorsSorted);
		
		
		
	}

}
