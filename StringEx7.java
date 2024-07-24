package oca;
	import java.util.StringTokenizer;

	public class StringEx7 {

		public static void main(String[] args) {
			String s="I love my INDIA";
			
	        //StringTokenizer st = new StringTokenizer(s," ");
	        StringTokenizer st = new StringTokenizer(s,"o");
	        int c=st.countTokens();
	        System.out.println(c);
	        
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
	        
			//for(int x=1;x<=c;x++){
			while(st.hasMoreTokens()) {
	                System.out.println(st.nextToken());
	        }
			
			String n[]=s.split(""); 
	        for(String x:n)
	            System.out.println(x);
	        
	        //String nn[]=s.split(" ");
	        String nn[]=s.split("o");
	        for(String x:nn)
	            System.out.println(x);
		}
}
