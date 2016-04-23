import java.util.Scanner;

public class Demarrage extends initJoueur{

	public static void chooseColor(){
		boolean valid=false; 
		Scanner sc = new Scanner(System.in);
		String couleur;
		char coul;
		
		do{
			couleur = sc.nextLine();
			coul=couleur.charAt(0);
			if(coul=='o'||coul=='O'||coul=='r'||coul=='R'||coul=='j'||coul=='J'||coul=='v'||coul=='V'||coul=='b'||coul=='B'||coul=='i'||coul=='I'){ //la flemme de tout ecrire ;)
				System.out.println("Bon choix");
				valid=true;
				System.out.println("Joueur1 a choisi"+" "+coul);
				
			}else{
				System.out.println("Mauvais choix");
				valid=false;
				System.out.println("Veuillez ressaisir votre couleur:");
			}
		   }
		while (valid==false); //Si la condition est fausse, on recommencee
	}



	public static void main(String [] args){
		/*System.out.println("Choisissez votre couleur: Rouge ('r/R'); Orange('o/O'); Jaune('j/J'); Vert('v/V'); Indigo (i/I); Bleu('b/B'):");
		Character1();
		chooseColor();
		Character2();
		chooseColor();
		*/
		
	}
}