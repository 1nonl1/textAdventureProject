//package textAdventure;
//Donovan
import java.util.Scanner;

class RoomEleven extends Room{
	protected int roomNum;
	public RoomEleven(int roomNum) {
		this.roomNum = roomNum;
	}
	
	public int changeRoom(Scanner scan){
		int choice = getChoiceNum(3, scan);
		
		int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 1;
				break;
			case 2:
				switchToRoom = 12;
				break;
			case 3:
				switchToRoom = 9;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
	}

	public void showProblem(){
	//Custom problem for rooms (Define Here) 
		System.out.println("After answering the question you see 3 doors.");
		System.out.println("The first one takes you back to the first room");
		System.out.println("The second one is pitch black");
		System.out.println("The last one has a bad smell coming from it.");
		System.out.println("What will you do? \n\t1)Go back to the first room (Room 1)\n\t2)Go into the pitch black room (Room 12)\n\t3)Follow the bad smell (Room 9");

	}

	public void roomInteraction(Player other, Scanner scan){
		System.out.println("You wallk throught third door that was slightly bowed.");
		System.out.println("You have three tries to get it correct, if you fail, you die!");
			for(int i = 3; i >= 0; i--){
				System.out.print("What is always in front of you but can't be seen?\n>"); //Question
				String answer = scan.next();
				if(answer.toLowerCase().contains("future")){ // Answer
					System.out.println("You have solved the riddle!");
					break;
			}
			else{
				System.out.println("You have " + i + " tries left.");
                if (i == 0) {
					other.killPlayer();
					System.out.println("You died!");
				}
			}
			
		} 
		
	}
}