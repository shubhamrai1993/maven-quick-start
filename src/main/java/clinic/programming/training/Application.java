package clinic.programming.training;

public class Application {
	public Application() {
		System.out.println("Inside application");
	}
	
	//	method main(): Always the application entry point
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();
	}
}
