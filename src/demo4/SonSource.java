package demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SonSource extends FatherSource {
	public ArrayList<Integer> getList(List<Integer> list) {
		list.clear();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return (ArrayList<Integer>) list;
	}
}
