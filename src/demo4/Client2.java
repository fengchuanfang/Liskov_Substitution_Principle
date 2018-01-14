package demo4;

import java.util.ArrayList;
import java.util.List;

import demo3.Son;

public class Client2 {
	public static void main(String args[]) {
		Son son = new Son();
		FatherSource fatherSource = new FatherSource();
		SonSource sonSource = new SonSource();
		List list = new ArrayList<>();
		System.out.println(son.count(fatherSource.getList((ArrayList<Integer>) list)));
		System.out.println(son.count(sonSource.getList(list)));
	}

}
