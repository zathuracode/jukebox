package com.vobi.demo.stream.color;

import java.util.List;
import java.util.stream.Stream;

public class ColorList {

	public static void main(String[] args) {
		List<String> colors=List.of("Red","Orange","Yellow","Green","Blue","Purple","Pink","White","Gray","Brown","Black");
		
		Stream<String> streamColors=colors.stream();
		streamColors.forEach(c->System.out.println(c));
		
		Stream<String> streamColorsLimit5=colors.stream().limit(5);
		streamColorsLimit5.forEach(c->System.out.println(c));		
	}

}
