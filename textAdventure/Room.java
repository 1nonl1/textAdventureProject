//package textAdventure;

import java.util.Scanner;

public class Room {
	//Attributes
	protected int roomNum;

	//Constructor
	public Room(){
		this.roomNum = 0;
	}
	
	public int getChoiceNum(int maxNum,Scanner scan){
		String choice = "";
		boolean choiceIsGood = false;
		int output = 0;
		while (!choiceIsGood) {
			System.out.print("> ");
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
	//Methods
	public int changeRoom(Scanner scan){
		System.out.println("Placeholder");
		return 0;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getRoomNum(){
		return this.roomNum;
	}
	public void showProblem(){
		System.out.println("Something has happened");
		System.out.println("What will you do? \n\t1)Choice 1\n\t2)Choice 2\n\t3)Choice 3");
	}
	public void roomInteraction(Player other, Scanner scan){
	//Boss Fight or question or a chest 
		System.out.println("PlaceHolder");
		
	}

}
