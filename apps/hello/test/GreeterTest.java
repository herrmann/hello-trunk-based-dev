import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	@Test
	public void newFeature() {
		Assert.assertTrue(new GreeterImpl().greeting().startsWith("Goodbye"));
	}

}
