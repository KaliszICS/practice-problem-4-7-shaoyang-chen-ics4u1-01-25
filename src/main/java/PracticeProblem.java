/**
 * This class provides utility methods for validating various inputs
 * with proper exception handling.
 *
 * @author Shaoyang Chen
 * @version 114.514
 * @since 1919.8.10
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	/**
	 * Validates the given age.
	 *
	 * @param age the age to validate
	 * @return true if the age is valid
	 * @throws IllegalArgumentException if age is negative with message "Age cannot be negative"
	 * @throws IllegalArgumentException if age is greater than 150 with message "Age must be realistic"
	 */
	public static boolean validateAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}

		if (age > 150) {
			throw new IllegalArgumentException("Age must be realistic");
		}

		return true;
	}

	/**
	 * Withdraws the specified amount from the given balance.
	 *
	 * @param amount the amount to withdraw
	 * @param balance the current balance
	 * @return the new balance after withdrawal
	 * @throws IllegalArgumentException if the amount is negative or zero
	 * @throws IllegalStateException if the withdrawal would result in a negative balance
	 */
	public static double withdraw(double amount, double balance) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive");
		}

		double newBalance = balance - amount;
		if (newBalance < 0) {
			throw new IllegalStateException("Insufficient funds for withdrawal");
		}

		return newBalance;
	}

	/**
	 * Retrieves the element at the specified index from the given array.
	 *
	 * @param array the array to retrieve the element from
	 * @param index the index of the element to retrieve
	 * @return the element at the given index
	 * @throws NullPointerException if the array is null with message "Array cannot be null"
	 * @throws IndexOutOfBoundsException if the index is negative or >= array length
	 */
	public static int getElement(int[] array, int index) {
		if (array == null) {
			throw new NullPointerException("Array cannot be null");
		}

		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException(
					"Index " + index + " is out of bounds for array of length " + array.length
			);
		}

		return array[index];
	}

	/**
	 * Validates the given email address.
	 *
	 * @param email the email address to validate
	 * @return the trimmed email if valid
	 * @throws IllegalArgumentException if email is null or empty with message "Email cannot be empty"
	 * @throws IllegalArgumentException if email doesn't contain an '@' symbol with message "Invalid email format"
	 * @throws IllegalArgumentException if email doesn't contain a '.' after the '@' with message "Invalid email format"
	 */
	public static String validateEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			throw new IllegalArgumentException("Email cannot be empty");
		}

		String trimmedEmail = email.trim();

		if (!trimmedEmail.contains("@")) {
			throw new IllegalArgumentException("Invalid email format");
		}

		int atIndex = trimmedEmail.indexOf("@");
		if (atIndex == trimmedEmail.length() - 1 || !trimmedEmail.substring(atIndex).contains(".")) {
			throw new IllegalArgumentException("Invalid email format");
		}

		return trimmedEmail;
	}

	

}
