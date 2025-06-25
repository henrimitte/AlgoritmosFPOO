package counter;

import java.util.function.Consumer;

public class Counter {

	private int start;
	private int end;
	private int step;

	public Counter() {
		this.start = 1;
		this.end = 10;
		this.step = 1;
	}

	public Counter(int start, int end, int step) {
		this.start = start;
		this.end = end;
		this.step = step;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public void count(Consumer<Integer> consumer) {
		for (int value = start; value <= this.end; value += this.step)
			consumer.accept(value);
	}

	public void countDown(Consumer<Integer> consumer) {
		for (int value = end; value >= this.start; value -= this.step)
			consumer.accept(value);
	}
}
