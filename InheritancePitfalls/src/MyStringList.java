import java.util.ArrayList;
import java.util.Collection;

public class MyStringList {
	private ArrayList<String> list = new ArrayList<>();
	public void add(String t) {
		list.add(t);
	}
	public void addAll(Collection<String> t) {
		list.addAll(t);
	}
	public String concatenateList(String delimiter) {
		return String.join(delimiter, list);
	}
}
