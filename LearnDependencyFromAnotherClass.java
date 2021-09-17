package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependencyFromAnotherClass extends LearnDependency{
	@Test(dependsOnMethods=week6.day2.LearnDependency.createLead)
	public void duplicateLead() {
		System.out.println("duplicatelead");
		
	}
}
