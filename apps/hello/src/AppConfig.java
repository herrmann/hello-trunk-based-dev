public class AppConfig {

	private AppConfig() {
	}

	private static class SingletonHelper {
		private static final AppConfig INSTANCE = new AppConfig();
	}

	public static AppConfig getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
