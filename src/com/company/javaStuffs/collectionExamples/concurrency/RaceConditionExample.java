package com.company.javaStuffs.collectionExamples.concurrency;

import java.util.Random;

public class RaceConditionExample {

 int randInt=10;
 Random random = new Random(System.currentTimeMillis());


 void printer(){
	 System.out.println("In printer");
	int i=1000;

	while (i!=0){
		if(randInt%5==0){
			System.out.println(randInt);
		}
		i--;
	}


 }


 void modifier(){
	 System.out.println("In modifier");
		int i=1000;
		while (i!=0){
			randInt= random.nextInt();
			i--;
		}
 }

 public static void runTest(){
 	RaceConditionExample raceCondition = new RaceConditionExample();

 	Thread t1 = new Thread(()-> raceCondition.printer());


 	Thread t2 = new Thread(() -> raceCondition.modifier());

 	t1.start();
 	t2.start();
 }

 public static void main(String args[]){
 	RaceConditionExample.runTest();
 }
}
