public class App {

	public static void main(final String[] args) {
		final AppConfig config = new AppConfig();
		final Greeter greeter = buildGreeter(config);
		greeter.greeting();
	}

	private static Greeter buildGreeter(final AppConfig config) {
		if (config.useNewFeature()) {
			return new NewGreeter();
		} else {
			return new OldGreeter();
		}
	}

}
