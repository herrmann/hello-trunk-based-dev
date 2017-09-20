public class App {

	public static void main(final String[] args) {
		final AppConfig config = new AppConfig();
		Greeter greeter;
		if (config.useNewFeature()) {
			greeter = new NewGreeter();
		} else {
			greeter = new OldGreeter();
		}
		greeter.greeting();
	}

}
