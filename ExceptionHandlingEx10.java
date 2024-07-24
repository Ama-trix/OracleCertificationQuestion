package oca;

class Student{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}else {
			throw new ArithmeticException("Invalid age");
		}
	}
}
public class ExceptionHandlingEx10 {
	public static void main(String[] args) {
		try {
			Student s=new Student();
			s.setAge(-22);
			System.out.println("Your Age: "+s.getAge());
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
