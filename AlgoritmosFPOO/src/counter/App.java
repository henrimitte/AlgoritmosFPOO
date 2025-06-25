package counter;

import java.util.Scanner;

public class App {

	Scanner scanner = new Scanner(System.in);
	Counter counter;

	private int readInt(String message) {
		System.out.print(message);
		int value = scanner.nextInt();
		return value;
	}

	private void exercise_1() {
		counter = new Counter(1, 10, 1);
		counter.count(System.out::println);
	}

	private void exercise_2() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");

		counter = new Counter(x, y, 1);
		counter.count(System.out::println);
	}

	private void exercise_3() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");

		counter = new Counter(x, y, 2);
		counter.count(System.out::println);
	}

	private void exercise_4() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");

		counter = new Counter(x, y, 3);
		counter.count(System.out::println);
	}

	private void exercise_5() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");
		int step = this.readInt("Valor de STEP: ");

		counter = new Counter(x, y, step);
		counter.count(System.out::println);
	}

	private void exercise_6() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");

		counter = new Counter(x, y, 1);
		counter.countDown(System.out::println);
	}

	private void exercise_7() {
		int x = this.readInt("Valor de X: ");
		int y = this.readInt("Valor de Y: ");
		int step = this.readInt("Valor de STEP: ");

		counter = new Counter(x, y, step);
		counter.countDown(System.out::println);
	}

	public static void main(String[] args) {
		App app = new App();

		app.exercise_1();
		app.exercise_2();
		app.exercise_3();
		app.exercise_4();
		app.exercise_5();
		app.exercise_6();
		app.exercise_7();
	}
}
