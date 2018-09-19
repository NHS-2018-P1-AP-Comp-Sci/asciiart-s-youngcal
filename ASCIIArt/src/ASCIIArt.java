/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

//Welcome to Callie's neighborhood!!
public class ASCIIArt {
	public static void CallieNeighborhood () {
		System.out.println("   +---\\");
		System.out.println("  + +---\\");
		System.out.println(" +   +---\\");
		System.out.println("+     +---\\");
		callieWalls();
		System.out.println("|_____|___|");
		System.out.println("\n");
		callieRoad();
		callieTree();
		callieHouse();
		
	}
	//The walls to each house!
	public static void callieWalls() {
		System.out.println("|     |   |");
		System.out.println("|     |   |");
		System.out.println("|     |   |");
		
	}
	//The road connecting the houses!
	public static void callieRoad() {
		System.out.println(" |   |  ");
		System.out.println(" |   |  ");
		System.out.println(" |   |  ");
		
	}
	//The beautiful Washington evergreen on the side of the road!!
	public static void callieTree() {
		System.out.println(" |   | /|\\");
		System.out.println(" |   | /|\\");
		System.out.println(" |   | /|\\");
		System.out.println(" |   | /|\\");
		
	}
	//My house, and my other house because I'm rich.
	public static void callieHouse() {
		System.out.println("   +---\\");
		System.out.println("  + +---\\");
		System.out.println(" +   +---\\");
		System.out.println("+     +---\\");
		callieWalls();
		System.out.println("|_____|___|");
		
		
	}
	public static void main (String[] args) {
		CallieNeighborhood ();
	}

}
