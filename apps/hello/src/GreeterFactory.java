public class GreeterFactory {

	public static Greeter buildGreeter() {
		final AppConfig config = AppConfig.getInstance();
		if (config.enabled("uppercase")) {
			return new UppercaseGreeter(new GreeterImpl());
		} else {
			return new GreeterImpl();
		}
	}

}
