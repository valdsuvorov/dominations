import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class dominosFX extends importDominos {

	public static final int NB_COLONNES = 9;
	public static final int NB_LIGNES = 9;
    static int[][] matrice = new int[NB_LIGNES][NB_COLONNES];
    public static final Color BROWN = new Color(139,69,19);  // on crée la couleur marron qui n'existe pas de base 

    
    public static void afficher(int[][] matrice) {  //ce code sert a afficher une matrice vide 9x9 mais peut servir à verifier les bonnes valeurs de type d'un demi-domino
        int i, j;
        for(i=0; i<matrice.length; i++){
            for(j=0; j<matrice.length ; j++){
                System.out.print(matrice[i][j]);
            }
            System.out.println("");
        }
    }

    public static void afficherMatriceDomino( int abs, int ord, int num, int nombreCouronne ) {  // je crée une fonction qui ajoute un seul demi domino avec les valeurs de position, de type et le nombre de couronnes
    	JFrame frame =new JFrame("Matrice"); 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel(new GridLayout(0,NB_COLONNES));  
	    JLabel couronne1 = new JLabel("1");
	    JLabel couronne2 = new JLabel("2");
	    for( int i=0; i<NB_LIGNES; i++) {
	        for( int j=0; j<NB_COLONNES; j++) {
	            matrice[4][4]=42;   //je place le chateau blanc au centre de la matrice 9x9
	            matrice[abs][ord]=num;  //je place mon demi-domino selon l'abscisse et ordonnée voulue avec le numero correspondant au type du demi domino
	            int valeur = matrice[i][j];
	            JPanel plateau = new JPanel();
	            plateau.setPreferredSize(new Dimension(50,50));
	            switch (valeur) {  //Pour chaque demi-domino je lui donne une couleur selon le num du type, par exemple 1 c'est le jaune donc les champs
	            case 1:
	            	plateau.setBackground(Color.YELLOW);  
	            	if ( nombreCouronne == 1) {  // je verifie si le demi-domino a des couronnes, si oui je les affiche sur le plateau
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            case 2:
	            	plateau.setBackground(Color.GREEN);
	            	if ( nombreCouronne == 1) {
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            case 3:
	            	plateau.setBackground(Color.BLUE);
	            	if ( nombreCouronne == 1) {
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            case 4:
	            	plateau.setBackground(BROWN);
	            	if ( nombreCouronne == 1) {
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            case 5:
	            	plateau.setBackground(Color.GRAY);
	            	if ( nombreCouronne == 1) {
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            case 42:
	            	plateau.setBackground(Color.WHITE);
	            	if ( nombreCouronne == 1) {
	            		plateau.add(couronne1);
	            	}
	            	
	            	else if (nombreCouronne == 2) {
	            		plateau.add(couronne2);
	            	}
	            	break;
	            default: //de base le plateau est rouge 
	            	plateau.setBackground(Color.RED);
	            	break;
	            }
	            panel.add(plateau);
	        }
	    }
	    frame.add(panel);  //ce ne sont que des fonctions d'affichage de l'onglet
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
    }

    
	public static void main(String[] args) {
		afficher(matrice);  // pas utile actuellement 
		afficherMatriceDomino(4,5,2,2); // j ajoute le demi domino en position [4][5] avec le type 2 donc vert pour les plaines et avec 2 couronnes
 // La fonction afficherMatrice ne fonctionne que localement, c'est à dire que la matrice reste vide, il faut le faire en continu avec un while ou la rendre globale directement dans le code d'ajout de dominos de Matthieu

	}

}
