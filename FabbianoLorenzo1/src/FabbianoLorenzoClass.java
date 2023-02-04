/**
 * <Mark> 4AI </Mark>
 * <b> @author FabbianoLorenzo </b>
 * <i> 04/02/2023 </i>
 */

	public class FabbianoLorenzoClass {
		
		
		public static int FabbianoMet(int s,int f) {
			int r=0;
			for(int i=0;i<f;i++) {
				r=r+r;//doveva essere r*r
			}
			return r;
		}

		public static void main(String[] args) {
			
	       FabbianoLorenzoClass main = new FabbianoLorenzoClass();
	       System.out.println("il risultato è "+ FabbianoMet(8,10));
	       System.out.println("il risultato è "+ FabbianoMet(1,5));
	       System.out.println("il risultato è "+ FabbianoMet(6,8));
		}

	}



