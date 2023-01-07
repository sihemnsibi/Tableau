package pack;

public class TestTableau {
	public static void main (String [] args) {
	
	
	 Tableau tableau = new Tableau(10);
     tableau.remplir();
     float f= tableau.moyenne();
     System.out.println("la moyenne :" +f);
     int s= tableau.somme();
     System.out.println("la somme :"+s);
     s= tableau.max();
     System.out.println("le maximum:"+s);
     s=tableau.min();
     System.out.println("le minimum"+ s);
     System.out.println( tableau.chercher(5) );
     tableau.afficher();

}
}
