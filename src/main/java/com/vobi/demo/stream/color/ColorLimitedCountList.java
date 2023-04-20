package com.vobi.demo.stream.color;

import java.util.List;
import java.util.stream.Stream;

public class ColorLimitedCountList {

	public static void main(String[] args) {
		List<String> colors=List.of("Red","Orange","Yellow","Green","Blue","Purple","Pink","White","Gray","Brown","Black");
		
		Stream<String> streamColorsLimit5=colors.stream().limit(5);
		streamColorsLimit5.forEach(c->System.out.println(c));		
	}

}
