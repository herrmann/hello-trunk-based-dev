public class GreeterFactory {

	public static Greeter buildGreeter() {
		return new GreeterImpl();
	}

}
