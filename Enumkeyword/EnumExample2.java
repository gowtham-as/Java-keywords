package Enumkeyword;

class EnumExample2 {

	enum Day {
		MONDAY, TUESDAY, WEDNSDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		Day day = Day.MONDAY;

		switch (day) {

		case MONDAY:

			System.out.println("MONDAY");

			break;

		case TUESDAY:

			System.out.println("TUESDAY");

		case WEDNSDAY:

			System.out.println("WEDNESDAY");

			break;
		default:
			System.out.println("other day");

		}

	}
}
