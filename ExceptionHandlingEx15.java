package oca;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	public class ExceptionHandlingEx15 {
		public static void main(String[] args) throws FileNotFoundException, IOException {
//			try { //error
//				int a=12,b=0,r=0;
//				r=a/b;
//				System.out.println("Division: "+r);
//			}
			
			//try with resource(ex: file or database etc.)
			try(FileInputStream f=new FileInputStream("abc.txt")){
				int a=f.read();//if this read() gives an exception, file will be automatically closed
				System.out.println(a);
				//f.close(); //file close is optional now
			}
			
			//try without resource(ex: file or database etc.)
			FileInputStream f=new FileInputStream("abc.txt");
			try{
				int a=f.read();
				System.out.println(a);
			}finally {
				f.close();//file close is your responsibility
			}
		}
	

}
