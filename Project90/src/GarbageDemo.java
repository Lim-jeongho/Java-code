class Garbage {
	public int no;
	
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) »ý¼º\n", no);
	}
	protected void finalize() {
		System.out.printf("Garbage(%d) ¼ö°Å\n", no);
	}
}
public class GarbageDemo {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++)
			new Garbage(i);
		System.gc(); 
	}
}
