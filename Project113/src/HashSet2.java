import java.util.HashSet;
import java.util.Set;

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

public class HashSet2 {
	public static void main(String[] args) {
		Set<Element> h = new HashSet<>();
		h.add(new Element("¾È³ç"));
		h.add(new Element("¾È³ç"));
		System.out.println(h.size());
		System.out.println(h);
	}
}