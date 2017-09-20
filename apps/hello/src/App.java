public class App {

	public static void main(final String[] args) {
		final Greeter greeter = GreeterFactory.buildGreeter();
		System.out.println(greeter.greeting());
	}

}
