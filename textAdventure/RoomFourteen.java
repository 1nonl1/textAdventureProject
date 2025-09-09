//Donovan
import java.util.Scanner;

class RoomFourteen extends Room{
    protected int roomNum;
    public RoomFourteen(int roomNum){
        this.roomNum = roomNum;
    }
	public int changeRoom(Scanner scan){
		int choice = getChoiceNum(3, scan);
		
        int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 1;
				break; // Room to change to
			case 2:
				switchToRoom = 13;
				break;
			case 3:
				switchToRoom = 15;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
}
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("After defeating the slime, you find new doors");
        System.out.println("The first door takes you back where you started");
        System.out.println("The second door has some wind coming from it");
        System.out.println("The last door, you can hear a grunting sound.");
	    System.out.println("What will you do? \n\t1)Backtrack (Room 2)\n\t2)Find where the breeze is coming from (Room 2)\n\t3)Be brave and fight whatever is making the grunting sound (Room 14)");
    }
    public void roomInteraction(Player other, Scanner scan){
        System.out.println("You go to the grunting sounds. The door suddenly shuts and you are greeted by a monster that attacks you.");
		Monster monster = new Monster(5, 15, "Skeleton", "skelly bob");
        other.battle(monster);//Fight function not working!!
    }
}
