package oca;

//class MyException extends Exception {
	//String m;
	//MyException(String s){
		//m=s;
	//}
	//@Override
	//public String getMessage() {
		//return m;
	//}
//}

class MyException extends RuntimeException {
	String m;
	MyException(String s){
		m=s;
	}
	@Override
public String getMessage() {
		return m;
	}
}
class Employee{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws MyException {
		if(age>0) {
			this.age = age;
		}else {
			throw new MyException("Invalid age");
		}
	}
}
public class ExceptionHandlingEx11 {
	public static void main(String[] args) {
		Employee s=new Employee();
		try{
			s.setAge(-12);
			System.out.println("Your Age: "+s.getAge());
		}catch (MyException e) {
			System.out.println(e);
		}
	}


}
