//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomEight extends Room{
    protected int roomNum;
	public RoomEight(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){
        System.out.print("> ");
		int choice = scan.nextInt();
        int switchToRoom = 0;
        switch(choice){
            case 1:
                switchToRoom = 9;
                break; // Room to change to
            case 2:
                switchToRoom = 6;
                break;
            case 3:
                switchToRoom = 13;
                break;
            default:
                System.err.println("Not a choice!");
				break;
        }
        return switchToRoom;
    }
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("you see 3 doors.");
        System.out.println("The first has a weathered door");
        System.out.println("The second one has a smell coming from it");
        System.out.println("The last door you see a room full of mirors");
        System.out.println("What will you do? \n\t1)Go into the weathered door (Room 9)\n\t2)Look into the smell (Room 6)\n\t3)Go to Door 3 (Room 13)");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("As you walk through the door, you see another riddle engraved on the wall.");
			for(int i = 3; i >= 0; i--){
				System.out.print("What has hands, but can't clap?\n>"); //Question
				String answer = scan.next();
				if(answer.toLowerCase().contains("clock")){ // Answer
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
