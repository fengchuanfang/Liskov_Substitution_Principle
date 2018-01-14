package demo4;

import java.util.ArrayList;
import java.util.List;

public class FatherSource {
	public List<Integer> getList(ArrayList<Integer> list) {
		list.clear();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		return list;
	}
}
