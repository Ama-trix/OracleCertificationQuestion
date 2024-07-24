package oca;
	import java.io.IOException;
	class DFG{
		void m1() throws RuntimeException{
			
		}
		void m2() throws ArithmeticException{
			
		}
		
		void m3() throws IOException{
			throw new IOException();
		}
	}
	public class ExceptionHandlingEx18 extends DFG {
		void m1() throws ArithmeticException{
			
		}
		void m2() throws RuntimeException{
			
		}
		void m3() throws ArithmeticException{
		}
//		void m3() throws Exception{ //error: in case of unreported[ can not throw super exception while method overriding ]
//			
//		}
}
