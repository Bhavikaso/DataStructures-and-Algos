package com.company.javaStuffs.collectionExamples.steamsExample;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicExamples {

	public void usingForeach(){
		( new Random())
				.ints ()
				.limit ( 10 )
				.forEach ( System . out :: println);
	}

	public void uniquSquaresUsingMap(){
		Stream.of(1,2,3,2,5,1)
				.map(a->a*a)
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
