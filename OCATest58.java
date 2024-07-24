package oca;

	class HHH{
		int g=10;
		static int h=10;
		private HHH(){
			System.out.println("hi HHH"+--g+--h);
		}
		static HHH getObj() {
			return new HHH();
		}
	}
	public class OCATest58 {
		public static void main(String[] args) {
			HHH h1;
			//h1=new HHH();//error
			h1=HHH.getObj();
			HHH h2=HHH.getObj();
		}
	}


