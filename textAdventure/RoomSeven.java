//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomSeven extends Room{
    protected int roomNum;
    public RoomSeven(int roomNum){
        this.roomNum = roomNum;
    }
	public int changeRoom(Scanner scan){
        System.out.print("> ");
		int choice = scan.nextInt();
        int switchToRoom = 0;
        switch(choice){
            case 1:
                switchToRoom = 1;
                break; // Room to change to
            case 2:
                switchToRoom = 5;
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
        System.out.println("After fighting the hydra you come to three doors");
        System.out.println("The first door feels familiar");
        System.out.println("There are some bones on the ground in front of the second door");
        System.out.println("From the one you feel a foreboding presence");
        System.out.println("What will you do? \n\t1)return to familiarity (Door 1)\n\t2)Inspect the bones (Door 2)\n\t3)Inspect the presence(Door 3)");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("A giant squid reaches toward you");
        other.battle(new Monster(2, 30,"Giant squid", "An abomination from the water"));
        other.collect(new Item(10, -8, 20, "An adventurers sword", "From the stomach of the giant squid"));
        
    }
}
