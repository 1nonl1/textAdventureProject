//package textAdventure;
//Toby

import java.util.Scanner;

class RoomTwo extends Room{
	protected int roomNum;
	public RoomTwo(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(Scanner scan){
		System.out.print("> ");
		int choice = scan.nextInt();
		int switchToRoom = 0;
		switch(choice) {
			case 1:
				switchToRoom = 1;
				break; // Room to change to
			case 2:
				switchToRoom = 5;
				break;
			case 3:
				switchToRoom = 6;
				break;
			default:
				System.err.println("Not a choice!");
				break;
		}
		return switchToRoom;
	}

	public void showProblem(){
	//Custom problem for rooms (Define Here) 
	System.out.println("After defeating the boss, two rooms appear in front of you. And the door you came from unlocks.");
    System.out.println("You want to go back to room 1 and recouperate");
    System.out.println("But, you see the first room have a pile of bones.");
    System.out.println("And the next room have a chest, but you suspect there might be a trap.");
	System.out.println("What will you do? \n\t1)Go back to saftey (Room 1)\n\t2)Inspect the pile of bones (Room 5)\n\t3)Try your luck for the chest (Room 6");

	}
	public void roomInteraction(Player other, Scanner scan){
		System.out.println("You follow the breeze and you enter room two. The door suddenly shuts and you are greeted by a monster that attacks you.");
		Monster monster = new Monster(2, 5, "Slime", "eerily squishy");
        other.battle(monster);//Fight function not working!!
	}	
}