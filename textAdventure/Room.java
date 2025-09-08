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
	
	public int getChoice(int maxNum){
		Scanner scan = new Scanner(System.in);

		String choice = "";
		boolean choiceIsGood = false;
		int output = 0;
		while (!choiceIsGood) {
			System.out.print("Choose choice: ");
			choice = scan.nextLine();
			choiceIsGood = true;
			try {
				output = Integer.valueOf(choice);
				if (output>maxNum || output<=0) {
					System.out.println("choice must in values");
					choiceIsGood=false;
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("choice must be a number");
				choiceIsGood=false;
			}
		}
		return output;
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
