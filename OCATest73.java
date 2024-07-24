package oca;

abstract class DG{
	abstract void m() ;
}
abstract class FGG extends DG{
	//its NOT compulsory to override m() here
	void m() {
		System.out.println("mm");
	}
}
class DFD extends FGG{
	
}
class FG extends DG{
	//its compulsory to override m() here
	void m() {
		System.out.println("mm");
	}
}
public class OCATest73{
	public static void main(String[] args) {
		
	}
}