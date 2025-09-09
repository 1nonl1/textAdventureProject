//package textAdventure;
//Graydon Room

import java.util.Scanner;

class RoomTen extends Room{
    protected int roomNum;
    public RoomTen(int roomNum){
        this.roomNum = roomNum;
    }
	public int changeRoom(Scanner scan){
        int choice = getChoiceNum(3, scan);
		
        int switchToRoom = 0;
        switch(choice){
            case 1:
                switchToRoom = 5;
                break; // Room to change to
            case 2:
                switchToRoom = 11;
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
        System.out.println("After answering the question you see 3 doors.");
        System.out.println("The first one has a pile of bones");
        System.out.println("The second is has uneven floorboards.");
        System.out.println("The last one you see lots of mirrors");
        System.out.println("What will you do? \n\t1)Follow the breeze (Room 5)\n\t2)Go to the uneven floorboards (Room 11)\n\t3)Go investigate the mirrors (Room 13");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("As you walk through the door in examine the statue...");
        System.out.println("A mischief of rats swarm at you");
        for(int i = 5; i > 0; i--){
            other.battle(new Monster(2, 4,"rat", "a sewer rat"));
        }
        other.collect(new Item(0, 10, 7, "Cooked rat", "some rat flesh you cooked over a makeshift fire"));

    }
}
