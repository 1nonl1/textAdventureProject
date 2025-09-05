//package textAdventure;

import java.util.Scanner;

public class Room {
	//Attributes
	protected int roomNum;

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
		System.out.print("> ");

		int choice = scan.nextInt();
		scan.close();
		return choice;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public void playerInteraction(Player player){
		System.out.println("ISSUE IN ROOM CLASS");
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
