package com.prakash.abstractmethod;

public abstract class AbstractClass {

	public abstract void f1();
	
	public void f2() {
		System.out.println("In AbstractClass.f2().");
		f1();
	}
	
}
