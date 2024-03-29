package book.javapuzzlers.ch05.p38;

public class UnwelcomeGuest {
	public static final long GUEST_USER_ID = -1;
	private static final long USER_ID;
	static {
		try {
			USER_ID = getUserIdFromEnvironment();
		} catch (IdUnavailableException e) {
			USER_ID = GUEST_USER_ID;
			System.out.println("Logging in as guest");
		}
	}

	private static long getUserIdFromEnvironment()
			throws IdUnavailableException {
		throw new IdUnavailableException();
	}

	public static void main(String[] args) {
		System.out.println("User ID: " + USER_ID);
	}
}

class IdUnavailableException extends Exception {
}
