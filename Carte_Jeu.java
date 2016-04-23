
public class Carte_Jeu {
	static int [][] carte_de_jeu= new int [13][13];
	static int [][] grille = new int[13][13];
	public static int colonneMax=130;
	public static int ligneMax=130;
	public final static int WIDTH=5;
	int i;
	int j;
	
	   public static void main (String [] args){
		   afficher_Grille();
	   }
	
	public static void afficher_Grille(){
		
		 StdDraw.setXscale(0, ligneMax);
	        StdDraw.setYscale(-colonneMax,0);
	        StdDraw.clear(StdDraw.GRAY);        
	        int[][] Grille={{1,0,1,0,1,2,1,0,1,1,1,1,1},
     			   			{1,1,1,1,1,0,1,0,1,0,1,0,1},
     			   			{1,0,1,0,1,0,1,0,1,0,1,0,1},
     			   			{1,0,2,0,1,1,2,1,1,0,1,0,1},
     			   			{1,0,1,0,1,0,1,0,2,1,1,5,1},
     			   			{1,0,1,0,1,0,1,1,1,0,1,0,1},
     			   			{1,1,2,1,1,0,1,0,1,0,1,0,1}};
	       for(int i=0; i!=grille.length; i++){
	    	   for(int j=0;j!=grille.length;j++){
	    		   
	    		   if(Grille[i][i]==0 && Grille[j][j]==0){
	    			   StdDraw.setPenColor(StdDraw.WHITE);
	    			   StdDraw.filledSquare(j*10, -i*10, WIDTH);   
	    		   }
	    		   
	    		   /*else if(i==0 &&j==grille.length-1){
	    			   StdDraw.setPenColor(StdDraw.YELLOW);
	    			   StdDraw.filledSquare(j*10, -i*10, WIDTH);   
	    		   }*/
	    		   
	    		   else{
	    			   StdDraw.setPenColor(StdDraw.BLACK);
	    			   StdDraw.filledSquare(j*10, -i*10, WIDTH); 
	    		   }
	    		   
	    	   }
	    	  
	       }
	}
}
	
