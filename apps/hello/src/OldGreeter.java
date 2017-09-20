public class OldGreeter implements Greeter {

	@Deprecated
	@Override
	public String greeting() {
		return "Hello, world!";
	}

}
