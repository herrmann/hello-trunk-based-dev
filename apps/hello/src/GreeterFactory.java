public class GreeterFactory {

	public static Greeter buildGreeter() {
		final AppConfig config = AppConfig.getInstance();
		if (config.useNewFeature()) {
			return new NewGreeter();
		} else {
			return new OldGreeter();
		}
	}

}
