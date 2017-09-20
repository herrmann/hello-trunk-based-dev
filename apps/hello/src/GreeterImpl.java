public class GreeterImpl implements Greeter {

	@Override
	public String greeting() {
		return greeting("world");
	}

	@Override
	public String greeting(final String name) {
		return "Goodbye, " + name + "!";
	}

}
