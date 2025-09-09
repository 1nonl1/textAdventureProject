//package textAdventure;
//Toby
import java.util.Scanner;

class RoomThree extends Room{
	protected int roomNum;
	public RoomThree(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){
		int choice = getChoiceNum(3, scan);
		
		int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 4;
				break; // Room to change to
			case 2:
				switchToRoom = 7;
				break;
			case 3:
				switchToRoom = 8;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
	}
	public void showProblem(){
	//Custom problem for rooms (Define Here) 
        System.out.println("Upon answering the question, you see three different hallways.");
        System.out.println("The first hallway, you again hear the familiar sound of water.");
        System.out.println("The second hallway is completly dark.");
        System.out.println("The next hallway has a door (No lock) preventing you from going any farther.");
        System.out.println("What will you do? \n\t1)Go towards the water (Room 4)\n\t2)Explore the dark hallway (Room 7)\n\t3)Open the door to see what is on the other side (Room 8");
	}
	public void roomInteraction(Player other, Scanner scan){
        System.out.println("You decide to go to the light, you see another riddle written on the wall.");
        for(int i = 3; i >= 0; i--){
            System.out.print("It belongs to you, but other people use it more than you do. What is it?\n>"); //Question
            String answer = scan.nextLine();
            if(answer.toLowerCase().contains("name")){ // Answer
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