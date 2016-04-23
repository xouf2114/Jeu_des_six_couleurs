import java.awt.event.KeyEvent;


public class initJoueur{
	public static void Character1 (){
		
	
		System.out.println("Joueur1, veuillez choisir votre couleur:");
		
	}
	
	public static void Character2 (){
		System.out.println("Joueur2, veuillez choisir votre couleur:");
		
	}
}


	/*public void run(){
		boolean move=true;
		int x=0;
		int y=0;
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledSquare(x, y, 5);
		StdDraw.show(0);
		
		while (move){
			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
				x+=10;
				afficher_carte();
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
				y-=10;
				afficher_carte();
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
				y+=10;
				afficher_carte();
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
				x-=10;
				afficher_carte();
			}
			if (x>120){
			x=120;
			}
			if (x<0){
			x=0;
			}
			if (y<-120);
			y=-120;
			}
			if (y>0){
			y=0;
			}
			StdDraw.setPenColor(SrdDraw.BLUE);
			StdDraw.filledSquare(x,y,WIDTH);
			StdDraw.show(100);
		}
	}
}
*/