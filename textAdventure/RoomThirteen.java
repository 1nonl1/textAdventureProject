//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomThirteen extends Room{
    protected int roomNum;
	public RoomThirteen(int roomNum) {
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
                switchToRoom = 1;
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
        System.out.println("The second one has a faint glowing sound.");
        System.out.println("The last door takes you to room 1");
        System.out.println("What will you do? \n\t1)Go into the weathered door (Room )\n\t2)Follow the faint glowing sound (Room 6)\n\t3)Go to Door 3 (Room 1)");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("As you walk through the door, you see another riddle engraved on one of the mirrors");
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
