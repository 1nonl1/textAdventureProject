//package textAdventure;
//Toby
import java.util.Scanner;

class RoomTwelve extends Room{
	protected int roomNum;
	public RoomTwelve(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){
		int choice = getChoiceNum(3, scan);
		
		int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 3;
				break; // Room to change to
			case 2:
				switchToRoom = 7;
				break;
			case 3:
				switchToRoom = 15;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
	}
	public void showProblem(){
	//Custom problem for rooms (Define Here) 
        System.out.println("Upon answering the question, you see three different doors.");
        System.out.println("The first door, has a flickering light.");
        System.out.println("The second door is also dark.");
        System.out.println("The last door, you can see a gold glow.");
	    System.out.println("What will you do? \n\t1)Head to the flickering light (Room 3)\n\t2)Follow the dark room (Room 7)\n\t3)Investigate the golden glow (Room 15)");
	}
	public void roomInteraction(Player other, Scanner scan){
        System.out.println("You decide to follow the water sound. You are faced with a riddle.");
        for(int i = 3; i >= 0; i--){
            System.out.print("What can you catch but never throw?\n>"); //Question
            String answer = scan.nextLine();
            if(answer.toLowerCase().contains("cold")){ // Answer
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