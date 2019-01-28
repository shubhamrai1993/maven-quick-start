package clinic.programming.training;

import java.util.*;

public class Application {
	public Application() {
		System.out.println("Inside application");
	}
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");

		for (String greet : greetings) {
			System.out.println("Greeting: " + greet);
		}
	}
	
	//	method main(): Always the application entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();

		app.greet();
	}
}
