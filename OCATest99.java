package oca;

class Basee {
	protected int i;
	int g=9;
	Basee() {
		add(1);
		System.out.println(g);
	}
	void add(int v) {
		i += v;
	}
	void print() {
		System.out.println(i);
	}
}
class Extensionn extends Basee {
	int g=89;
	Extensionn() {
		add(2);
		System.out.println(g);
	}
	void add(int v) {
		System.out.println("ggh");
		i += v * 2;
	}
}
public class OCATest99 {
	public static void main(String[] args) {
		bogo(new Extensionn());
	}
	static void bogo(Basee b) {
		b.add(8);
		b.print();
	}


}
