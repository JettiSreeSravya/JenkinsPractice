package jenkins_project;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.GenericMethods;

public class FirstTestClass extends GenericMethods{
	
	@Test
	public void test() throws IOException {
		openUrl();
	}

}
