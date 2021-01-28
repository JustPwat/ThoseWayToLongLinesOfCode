import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

class MainLabyrinthe {

    public static void main(String[] args) {
        int[][] labyrinthe = charger("labyrinthe2.txt");
        Labyrinthe.afficher(labyrinthe);
        if (Labyrinthe.resoudre(labyrinthe)){
            System.out.println("Chemin trouvé!");
        } else {
            System.out.println("Chemin non trouvé!");
        }
        Labyrinthe.afficher(labyrinthe);

    }



    /* méthode fournie pour lire une grille dans un fichier*/ 
    public static int[][] charger(String fichier) {		
		File file = new File(fichier);
		int[][] tableau = new int[20][20]; //grille 20x20
				
		try { // gestion d'erreurs (fichier non trouvé...)
			Scanner lectureFichier = new Scanner(file);
			int count = 0;
			for (int i = 0; i<20; i++) { // le fichier a 20 lignes
			    String ligne  = lectureFichier.nextLine();
			    char[] caracteres = ligne.toCharArray();
			    for (int c=0;c<caracteres.length;c++) {
				    tableau[i][c]= (caracteres[c]=='0'?0:1); // expression conditionnelle: si '0' alors 0 else 1
				}
			}
			lectureFichier.close();
							
			return tableau;
		} catch (FileNotFoundException e) {
			System.err.println("Fichier non trouvé: "+file.getAbsolutePath());
			e.printStackTrace();
			return null;
		}
			
			
			
	}
  
}