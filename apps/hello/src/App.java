public class App {

	public static void main(final String[] args) {
		final AppConfig config = new AppConfig();
		if (config.useNewFeature()) {
			System.out.println("Goodbye, world!");
		} else {
			System.out.println("Hello, world!");
		}
	}

}
