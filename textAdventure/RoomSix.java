//package textAdventure;
//Graydon Room
import java.util.Scanner;

class RoomSix extends Room{
    protected int roomNum;
	public RoomSix(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){    
        int choice = getChoiceNum(3, scan);
		
        int switchToRoom = 0;
        switch(choice){
            case 1:
                switchToRoom = 4;
                break;// Room to change to
            case 2:
                switchToRoom = 7;
                break;
            case 3:
                switchToRoom = 11;
                break;
            default:
                System.err.println("Not a choice!");
				break;
        }
        return switchToRoom;
    }
    public void showProblem(){
    //Custom problem for rooms (Define Here) 
    System.out.println("After killing the giant rat, you see 3 doors.");
    System.out.println("The first one has a trickling sound of water");
    System.out.println("The second door is dark");
    System.out.println("The third one is slightly bowed outward");
	System.out.println("What will you do? \n\t1)Follow the trickling sound of water (Room 4)\n\t2)Go toward the dark room (Room 7)\n\t3)Check out the third door (Room 11)");

    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("A giant rat lunges toward you from the wall");
        other.battle(new Monster(5, 8,"giant rat", "A huge snarling beast"));
        other.collect(new Item(0, -3, 2, "rotting flesh","Flesh from the giant rat"));
    }
}
