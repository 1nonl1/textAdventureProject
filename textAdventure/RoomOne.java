//package textAdventure;
//Toby
import java.util.Scanner;

class RoomOne extends Room{
	protected int roomNum;
	public RoomOne(int roomNum) {
		this.roomNum = roomNum;
	}
	
	public int changeRoom(Scanner scan){
		int switchToRoom = 0;
		int choice = getChoiceNum(3, scan);
		switch(choice) {
			case 1:
				switchToRoom = 2;
				break;
			case 2:
				switchToRoom = 3;
				break;
			case 3:
				switchToRoom = 4;
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
		System.out.println("The first one has a slight breeze coming from it");
		System.out.println("The second one has a flickering light");
		System.out.println("The last one you hear a stream of water");
		System.out.println("What will you do? \n\t1)Follow the breeze (Room 2)\n\t2)Follow the light (Room 3)\n\t3)Try to get some water (Room 4");

	}

	public void roomInteraction(Player other, Scanner scan){
		System.out.println("After you walk for a bit you are in the first room. You see a riddle written on the wall...");
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
					System.out.println("You died");
				}
			}
			
		} 
		
	}
}