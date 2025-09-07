//Toby
import java.util.Scanner;

class RoomFifteen extends Room{
    protected int roomNum;
    public RoomFifteen(int roomNum){
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
				switchToRoom = 2;
				break;
			case 3:
				switchToRoom = 14;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
}
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("After opening the chest, you find new doors.");
        System.out.println("The first door takes you back where you came from");
        System.out.println("The second door has some wind coming from it");
        System.out.println("The last door, you can hear a grunting sound.");
	    System.out.println("What will you do? \n\t1)Backtrack (Room 2)\n\t2)Find where the breeze is coming from (Room 2)\n\t3)Be brave and fight whatever is making the grunting sound (Room 14)");
    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("You decide to examine the pile of bones, you find a chest hidden inside!");
        other.collect(new Item(8, -10, 15, "A powerful crossbow", "From the adventurers past"));
    }
}
