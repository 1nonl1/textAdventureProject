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
        System.out.println("you see 3 doors.");
        System.out.println("The first has a weathered door");
        System.out.println("The second one has a smell coming from it");
        System.out.println("The last door...");
        System.out.println("What will you do? \n\t1)Go into the weathered door(Door 1)\n\t2)Look into the smell(Door 2)\n\t3)Go to Door 3");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("...");//Finish this please
        //Make this a question
    }
}
