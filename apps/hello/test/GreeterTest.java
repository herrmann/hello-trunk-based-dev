import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

	@Test
	public void oldFeature() {
		Assert.assertTrue(new OldGreeter().greeting().startsWith("Hello"));
	}

	@Test
	public void newFeature() {
		Assert.assertTrue(new NewGreeter().greeting().startsWith("Goodbye"));
	}

}
