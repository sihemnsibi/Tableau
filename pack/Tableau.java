package pack;
import java.util.Random;

public class Tableau {
	 int[] tab;
	    public Tableau (int n) {
	        tab = new int[n];
	    }
	    void remplir(){
	        Random rand = new Random();
	        for(int i=0; i<tab.length;i++){
	            tab[i] = rand.nextInt(100);
	        }
	    }
	    int somme(){
	        int s =0;
	        for(int i = 0;i<tab.length;i++){
	            s+=tab[i];
	        }
	        return s;
	    }
	    float moyenne(){
	        return somme()/ tab.length;
	    }
	    int max(){
	        int max = tab[0];
	        for(int i = 0;i<tab.length;i++){
	            if (tab[i]>max) {
	                max = tab[i];
	            }
	        }
	        return max;
	    }
	    int min(){
	        int min = tab[0];
	        for(int i = 0;i<tab.length;i++){
	            if (tab[i]<min) {
	                min = tab[i];
	            }
	        }
	        return min;
	    }
	    String chercher (int p) {
	    	boolean test;
	    	int i=0;
	    	test = false;
	    	while (test==false && i< tab.length ) {
	    		if(tab[i]==p)
	    			test=true;
	    		else
	    		i++; }
	    	if (test==true) 
	    		return ("l'élement existe dans le tableau , il est d'indice :"+ i );
	    	else
	    		return ("l'élement n'existe pas");
	    }
	    void afficher() {
	    	int i;
	    	for(i=0;i<tab.length;i++) {
	    		System.out.println(tab[i]);
	    	}
	    }

}
