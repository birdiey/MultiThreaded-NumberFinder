
package ex7a;

import java.util.Random;
import za.ac.tut.util.NumFind;
import za.ac.tut.util.NumFind2;
import za.ac.tut.util.NumGenerated;

public class Ex7a {

  
    public static void main(String[] args) {
        int n=new Random().nextInt(10);
       NumGenerated ng = new NumGenerated(n);
       NumFind nf= new NumFind(ng);
       NumFind2 nf2= new NumFind2(ng);
       
       Thread t1= new Thread(nf);
      
       Thread t2= new Thread(nf2);
        System.out.println("The main class has generated "+n);
       
       t1.start();
       t2.start();
       
       
       
    }
    
}
