
public class Cartefinie extends Demarrage {
	static int [][] carte = new int [13][13];
    public final static int X_MAX= 130;
    public final static int Y_MAX= 130;
    public final static int WIDTH=5;
   int i;
   int j;
    

    public static initJoueur Joueur1;
    //public static Personnage2 garde;
    
    public static void main(String[]args){
    	System.out.println("Choisissez votre couleur: Rouge ('r/R'); Orange('o/O'); Jaune('j/J'); Vert('v/V'); Indigo (i/I); Bleu('b/B'):");
		Character1();
		chooseColor();
		Character2();
		chooseColor();
    	afficher_carte();
    	 //infiltre = new Personnage(0, 0);
    	//garde = new Personnage2(140, 0);
    
    }
    
    public static void afficher_carte(){
        StdDraw.setXscale(0, X_MAX);
        StdDraw.setYscale(-Y_MAX,0);
        StdDraw.clear(StdDraw.GRAY);
        char[][] carte={ //changer les chiffres en lettre 
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'},
        		{'r','o','i','j','v','b','j','v','i','o','j','r','j'}
        };
        //System.out.println(carte.length);
        for(int i=0; i!=13; i++){
            for(int j=0; j!=13; j++){
                if(carte[i][j]=='r'){
                	StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH); // on rajoute 5 à l'abscisse pour centrer les carrés 
               
                }
                if(carte[i][j]=='v'){
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH); 
                    
                }
                if((carte[i][j]=='j')){
                    	StdDraw.setPenColor(StdDraw.YELLOW);
                    	StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH);
                    	
                    }
              
       
                if((carte[i][j]=='b')){
                	StdDraw.setPenColor(StdDraw.BLUE);
                	StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH);
                	
                }  
                if((carte[i][j]=='o')){
                	StdDraw.setPenColor(StdDraw.ORANGE);
                	StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH);
                	
                }
                if((carte[i][j]=='i')){
                	StdDraw.setPenColor(StdDraw.MAGENTA);
                	StdDraw.filledSquare(j*10+5, -i*10-5, WIDTH);
                   
                }              
                }                
            }
        }
    
}