import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class AppConfig {

	private static final Logger log = Logger.getLogger(AppConfig.class.getName());

	private AppConfig() {
	}

	private static class SingletonHelper {
		private static final AppConfig INSTANCE = new AppConfig();
	}

	public static AppConfig getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public boolean enabled(final String feature) {
		final Properties props = new Properties();
		final InputStream stream = this.getClass().getResourceAsStream("features.properties");
		if (stream != null) {
			try {
				props.load(stream);
			} catch (final IOException e) {
				log.warning("Could not load feature flags configuration file: " + e.getMessage());
			}
		} else {
			log.warning("No feature flags configuration file available");
		}
		final String value = props.getProperty(feature);
		return Boolean.valueOf(value);
	}

}
