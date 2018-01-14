package demo3;

import java.util.ArrayList;

public class Client1 {
	public static void main(String args[]) {
		Father father = new Father();
		Son son = new Son();

		System.out.println(father.count(getList()));
		System.out.println(son.count(getList()));
	}

	private static ArrayList<Integer> getList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
}
