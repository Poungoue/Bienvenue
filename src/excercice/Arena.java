package excercice;
public class Arena extends Robot {
		Robot r1,r2;
		String chaine;
		Arena(){}
		public Arena(Robot a,Robot b){
			this.r1=a;
			this.r2=b;
		}
		   public void toString(String s) {
	    	   System.out.println(s);
	      }
		  public boolean isDead(Robot r) {
	    	  if(r.sante==0) {
	    		  System.out.println(r.nom+" est mort");
	    		  return true;
	    	  }
	    	  return false;
	      }
	      
		public Arena fight( Robot r1,Robot r2) {
			while(r2.sante!=0) {
				r1.fire(r2);
				if(r2.sante!=0) {
					r2.fire(r1);
				}else {
					isDead(r2);
					System.out.println("combat terminer "+r1.nom+" est vainqueur");
					
				}
			}
	        return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Robot r1= new Robot("D2R2",10);
         Robot r2= new Robot("Data",10);
         Arena A= new Arena(r1,r2);
         A.fight(r1, r2);
         r1.toString("je suis un test");
	}

}
