package excercice;


public class Robot  {
	
    protected int sante;
    protected String nom;
    //En general il est interdit qu'un champ soit de  visibilité autre que private car l'utilisateur pourrait acceder aux données et bouverser le programme  
    public Robot(){
    	   this.sante=10;
       }
       public Robot(String s,int n) {
    	   this.sante=n;
    	   this.nom=s;
       }
       public Robot(String o){
    	   this.nom=o;
    	   
       }
       public void toString(String s) {
    	   System.out.println(s);
    	   }
      public String getNom() {return nom;}
      public int getSante() {return sante;}
      public void setNom(String n) {this.nom=n;}
      public void setSante(int s) {this.sante=s;}
      

      
      
      Robot fire(Robot r) {
    	  Robot r2=new Robot();
    	  r.sante-=2;
    	  System.out.println(r.nom+" a ete touche par "+this.nom+" vie restante "+r.sante);
    	  return r;
      }
      
      
      
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Robot bob= new Robot("Robot bob",10);
        Robot john =new Robot("Robot john");
        System.out.println(bob.nom);
        System.out.println(john.nom);
        bob.toString("je suis test 3");
	}

}
