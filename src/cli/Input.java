package cli;

public class Input {
	private final long firstParam;
	private final String secondParam;

	public Input(long firstParam, String secondParam) {
		this.firstParam = firstParam;
		this.secondParam = secondParam;
	}

	public long getFirstParam() {
		return firstParam;
	}

	public String getSecondParam() {
		return secondParam;
	}

	@Override
	public String toString() {
		return "Input{" +
				"firstParam='" + firstParam + '\'' +
				", secondParam='" + secondParam + '\'' +
				'}';
	}
}
