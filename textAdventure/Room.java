package textAdventure;

import java.util.Scanner;

public class Room {
	//Attributes
	protected int roomNum;
	private int choice;


	//Constructor
	public Room(){
		this.roomNum = 0;
	}
	//Methods
	public int changeRoom(int choice){
		System.out.println("Placeholder");
		return 0;
	}
	public int getChoice(){
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		return choice;
	}
	public int getRoomNum(){
		return this.roomNum;
	}
	public void showProblem(){
		System.out.println("Something has happened");
		System.out.println("What will you do? \n\t1)Choice 1\n\t2)Choice 2\n\t3)Choice 3");
	}
	public void roomInteraction(Player other){
	//Boss Fight or question or a chest 
	System.out.println("PlaceHolder");
	}

}
