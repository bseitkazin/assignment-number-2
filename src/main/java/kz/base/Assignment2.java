package kz.base;
import java.util.Scanner;

public class Assignment2 {
	/**
	*	Дано целое положительное число не превышающее Integer. Посчитать сумму всех его цифр.
	*	В решении нельзя использовать цикл и работу со строками.
	*	Ввод чисел через stdin (standard input). Предусмотреть наличие юнит теста.
	*/

	private static int value;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		int result = getSumOfDigitsinInt(value);
		System.out.println(result);
	}

	/**
	*	To solve this problem without a loop
	* 	first idea comes to me to use Stream in Java 8 API
	* 	but I think that it is also a sub-type of loop
	* 	and I am lazy to switch environment version to 8.
	*	So, instead of using loop, we always can replace it with Recurtion!
	*/
	public static int getSumOfDigitsinInt(int val) {
		// if we have just on digit, stop it
		if (val < 10) {
			return val;
		} else {
			//we find the last digit in the int value, if 123, the last is 3
			int theLastDigit = val % 10;
			//we find another part of int, to divide it, until we don't come to 1 digit
			int beforeTheLastDigit = val / 10;
			return theLastDigit + getSumOfDigitsinInt(beforeTheLastDigit);
		}
	}

	public void setValue(int v) {
		this.value = v;
	}
	public int getValue() {
		return this.value;
	}
}