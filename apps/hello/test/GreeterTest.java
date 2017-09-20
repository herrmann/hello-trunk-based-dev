import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	@Test
	public void newFeature() {
		Assert.assertTrue(new NewGreeter().greeting().startsWith("Goodbye"));
	}

}
