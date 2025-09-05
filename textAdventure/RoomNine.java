//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomNine extends Room{
	public int changeRoom(int choice){
        switch(choice){
            case 1:
                return 8; // Room to change to
            case 2:
                return 12;
            case 3:
                return 10;
            default:
                System.err.println("Not a choice!");
				break;
        }
        return 9;
    }
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("After answering the question you see 3 doors.");
        System.out.println("The first door feels eery");
        System.out.println("The second door is braced with metal");
        System.out.println("The last one is slightly falling apart");
        System.out.println("What will you do? \n\t1)Go to door 1\n\t2)Go to the metal door(Door 2)\n\t3)Enter the last door(Door 3)");

    }

    public void roomInteraction(Player other){
        System.out.println("You see another riddle on the wall");
        System.out.println("You have three tries to get it correct, if you fail, you die!");
        Scanner scan = new Scanner(System.in);
        String answer = "";
        for(int i = 3; i >= 0; i--){
            System.out.println("What word contains 26 letters but only has three syllables?"); //Question
            
            answer = scan.nextLine();
            if(answer.toLowerCase().contains("alphabet")){ // Answer
                System.out.println("You have solved the riddle!");
                break;
            }
            else{
                System.out.println("You have " + i + " tries left.");
            }
        } 
        other.killPlayer();
        System.out.println("You died!");
        scan.close();
    }
}
