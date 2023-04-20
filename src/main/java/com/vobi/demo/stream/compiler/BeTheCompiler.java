package com.vobi.demo.stream.compiler;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class BeTheCompiler {

	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("Hi!");
		r.run();
		
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Java is Cool");
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Hello"));
		
		Supplier<String> s = () -> "Some string";
		System.out.println(s.get());
		
		Function<String, Integer> f2= (String  cadena) -> cadena.length();
		System.out.println(f2.apply("Hi"));
		
	}

}
