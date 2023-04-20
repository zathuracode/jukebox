package com.vobi.demo.stream.color;

import java.util.List;

public class ColorListVersions {

	public static void main(String[] args) {
		List<String> colors=List.of("Red","Orange","Yellow","Green","Blue","Purple","Pink","White","Gray","Brown","Black");
		
		//Java 1.4 o 4
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		//Java 1.5 o 5
		for (String color : colors) {
			System.out.println(color);
		}
		
		//Java 1.8 o 8
		colors.forEach(color->System.out.println(color));	
	}

}
