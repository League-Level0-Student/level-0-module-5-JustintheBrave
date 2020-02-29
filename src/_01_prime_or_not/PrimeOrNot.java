package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean check = false;
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog("pick an integer");
		int num = Integer.parseInt(number);
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = true;
			}
		}

		if (check == true) {
			JOptionPane.showMessageDialog(null, "your number is composite");
		} else {
			JOptionPane.showMessageDialog(null, "your number is prime");
		}

	}
}
