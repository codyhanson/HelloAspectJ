package io.clh.HelloAspectJ;


class HelloAspectJ{
    public static void main(String[] args) {
        System.out.println("Hello AspectJ! - from main"); 
        sayHello1();
        sayHello2();
    }

    public static void sayHello1() {
        System.out.println("Hello AspectJ! - from sayHello1"); 
    }

    public static void sayHello2() {
        System.out.println("Hello AspectJ! - from sayHello2"); 
    }
}

