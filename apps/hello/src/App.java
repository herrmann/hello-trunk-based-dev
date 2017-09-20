public class App {

	public static void main(final String[] args) {
		final Greeter greeter = buildGreeter();
		greeter.greeting();
	}

	private static Greeter buildGreeter() {
		final AppConfig config = AppConfig.getInstance();
		if (config.useNewFeature()) {
			return new NewGreeter();
		} else {
			return new OldGreeter();
		}
	}

}
