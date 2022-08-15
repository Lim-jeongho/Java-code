import java.util.HashMap;
import java.util.Map;

class Element {
	String value;
	public Element(String value) {
		this.value = value;
	}
	public boolean equals(Object o) {
		if(o instanceof Element) {
			return ((Element) o).value.equals(value);
		}
		return false;
	}
	public String toString() {
		return "Element[" + value + "]";
	}
}

public class HashMap2 {
	public static void main(String[] args) {
		Map<Element, Integer> map = new HashMap<>();
		map.put(new Element("¾È³ç"), 1);
		map.put(new Element("¾È³ç"), 2);
		map.put(null, 3);
		System.out.println(map.size());
		System.out.println(map);
	}
}