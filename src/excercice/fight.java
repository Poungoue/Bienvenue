package excercice;
import java.util.Random;
public class fight extends Robot{
	fight f1;
	fight f2;
	String nom;
	int vie;
	boolean seed;
	fight(){}
	/*fight(fight f,fight k){
		this.f1=f;
		this.f2=k;
	}*/
	fight(String s,int e){
		this.nom=s;
		this.vie=e;
	}
	  public void toString(String s) {
   	   System.out.println(s);
	  }
	
	fight fire (fight r) {
		if(nextBoolean()==true){
			r.sante=r.sante;
			System.out.println(r.nom+" a ete rate par "+this.nom+" .vie "+r.sante);
			}else if(nextBoolean()==false){
				r.sante -= 2;
				System.out.println(r.nom+" a ete rate par "+this.nom+" .vie "+r.sante);
			}
			return r;
	}
		private boolean nextBoolean() {
			Random rand= new Random();
			seed=rand.nextBoolean();
			return seed;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            fight f1=new fight("king",11);
            fight f2=new fight("senku",11);
            f1.fire(f2);
            f2.fire(f1);
               f1.toString("je suis un test 2");
	}

}
