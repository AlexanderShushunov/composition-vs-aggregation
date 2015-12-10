package enumoverriding;

public enum Month {
	JANUARY(31),
	FEBRUARY(28),
	MARCH(31),
	APRIL(30),
	MAY(31),
	JUNE(30),
	JULY(31),
	AUGUST(31),
	SEPTEMBER(30),
	OCTOBER(31),
	NOVEMBER(30),
	DECEMBER(31);

	private final int daysAmount;

	Month(int amountOfDays) {
		this.daysAmount = amountOfDays;
	}

	public int getDaysAmount(final int year) {
		if (this == FEBRUARY && isBissextile(year)) {
			return 29;
		}
		return daysAmount;
	}

	private static boolean isBissextile(final int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}
