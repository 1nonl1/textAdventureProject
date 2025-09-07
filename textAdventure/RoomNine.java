//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomNine extends Room{
    protected int roomNum;
    public RoomNine(int roomNum){
        this.roomNum = roomNum;
    }
	public int changeRoom(Scanner scan){
        System.out.print("> ");
		int choice = scan.nextInt();
        int switchToRoom = 0;
        switch(choice){
            case 1:
                switchToRoom = 8;
                break; // Room to change to
            case 2:
                switchToRoom = 12;
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
        System.out.println("After answering the question you see 3 doors.");
        System.out.println("The first door feels eery");
        System.out.println("The second door is braced with metal");
        System.out.println("The last one is slightly falling apart");
        System.out.println("What will you do? \n\t1)Go to door 1\n\t2)Go to the metal door(Door 2)\n\t3)Enter the last door(Door 3)");

    }

    public void roomInteraction(Player other, Scanner scan){
        System.out.println("You try to figure out where the smell of ammonia is coming from, but you are met with a riddle.");
        System.out.println("You have three tries to get it correct, if you fail, you die!");
        String answer = scan.nextLine();
        for(int i = 3; i >= 0; i--){
            System.out.print("What word contains 26 letters but only has three syllables?\n>"); //Question
            
            answer = scan.nextLine();
            if(answer.toLowerCase().contains("alphabet")){ // Answer
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
