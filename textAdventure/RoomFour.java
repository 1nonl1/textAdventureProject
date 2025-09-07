//package textAdventure;
//Toby
import java.util.Scanner;

class RoomFour extends Room{
	protected int roomNum;
	public RoomFour(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){
		System.out.print("> ");
		int choice = scan.nextInt();
		int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 6;
				break; // Room to change to
			case 2:
				switchToRoom = 9;
				break;
			case 3:
				switchToRoom = 10;
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
        System.out.println("The first door, you hear a faint glowing sound, could be a chest.");
        System.out.println("The second door is emitting a faint smell of ammonia.");
        System.out.println("The last door, you can see a statue.");
	    System.out.println("What will you do? \n\t1)Head to the glowing sound (Room 6)\n\t2)Investigate the ammonia smell (Room 9)\n\t3)Investigate the statue (Room 10)");
	}
	public void roomInteraction(Player other, Scanner scan){
        System.out.println("You decide to follow the water sound. You are faced with a riddle.");
        for(int i = 3; i >= 0; i--){
            System.out.println("What has to be broken before you can use it?\n>"); //Question
            String answer = scan.nextLine();
            if(answer.toLowerCase().contains("egg")){ // Answer
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