package demo3;

import java.util.List;

public class Father {
	public int count(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}
}
