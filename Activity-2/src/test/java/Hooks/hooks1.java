package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class hooks1 {
    @Before
	public void method1() {
		System.out.println("method 1 printing");
	}
    @After
	public void method2() {
		System.out.println("method 2 printing");
	}
    
  
}
