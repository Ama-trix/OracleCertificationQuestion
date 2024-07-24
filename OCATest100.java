package oca;

 class OCATest100 {
	public static void main(String[] args) {
		final int iLoc = 3;
        final Integer iFour = 4;
        Integer iRef = 4;
        switch (iRef) {
        //case iFour: System.out.println("It's OK.");//error [case expressions must be constant expressions, NO objects allowed]
        case 1:
        case iLoc:
        case 2 * iLoc: System.out.println("It's not OK.");
        default: System.out.println("You are OK.");
        }
	}


}
