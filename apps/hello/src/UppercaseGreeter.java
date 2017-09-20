public class UppercaseGreeter implements Greeter {

	protected final Greeter greeter;

	public UppercaseGreeter(final Greeter greeter) {
		this.greeter = greeter;
	}

	@Override
	public String greeting() {
		return greeter.greeting().toUpperCase();
	}

	@Override
	public String greeting(final String name) {
		return greeter.greeting(name).toUpperCase();
	}

}
