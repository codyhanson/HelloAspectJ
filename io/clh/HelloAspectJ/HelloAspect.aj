package io.clh.HelloAspectJ;

public aspect HelloAspect {

	pointcut onHelloPointcut(): execution(void *.sayHello*());
	
	before(): onHelloPointcut(){
		System.out.println("Before a Hello function! - inserted by HelloAspect");
	}
	
	after(): onHelloPointcut(){
		System.out.println("After a Hello function! - inserted by HelloAspect");
	}
	
}
