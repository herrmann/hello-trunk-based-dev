import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	@Test
	public void newFeature() {
		Assert.assertTrue(new GreeterImpl().greeting().startsWith("Goodbye"));
	}

	@Test
	public void defaultName() {
		Assert.assertTrue(GreeterFactory.buildGreeter().greeting().contains("world"));
	}

	@Test
	public void configurableName() {
		final String name = "testing";
		Assert.assertTrue(GreeterFactory.buildGreeter().greeting(name).contains(name));
	}

	@Test
	public void nullName() {
		Assert.assertTrue(GreeterFactory.buildGreeter().greeting(null).contains("null"));
	}

}
