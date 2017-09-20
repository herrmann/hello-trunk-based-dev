public class App {

	public static void main(final String[] args) {
		final Greeter greeter = GreeterFactory.buildGreeter();
		String greeting;
		if (args.length > 0) {
			greeting = greeter.greeting(args[0]);
		} else {
			greeting = greeter.greeting();
		}
		System.out.println(greeting);
	}

}
