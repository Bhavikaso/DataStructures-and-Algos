package com.company.designPatterns;



public class SingletonPattern {

    public static void callRuntimeMethod() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Runtime "+runtime);

        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println("Runtime "+anotherRuntime);


    }
}
