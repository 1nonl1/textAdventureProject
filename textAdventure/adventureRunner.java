//package textAdventure;

import java.util.ArrayList;
import java.util.Scanner;

public class adventureRunner{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		Player pOne = new Player();
		RoomOne rOne = new RoomOne(1);
		RoomTwo rTwo = new RoomTwo(1);
		RoomThree rThree = new RoomThree(1);
		RoomFour rFour = new RoomFour(1);
		RoomFive rFive = new RoomFive(1);
		RoomSix rSix = new RoomSix(1);
		RoomSeven rSeven = new RoomSeven(1);
		RoomEight rEight = new RoomEight(1);
		RoomNine rNine = new RoomNine(1);
		RoomTen rTen = new RoomTen(10);
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(rOne);
			
		pOne.setName();
		System.out.println(pOne.getName() + " has entered the dungeon");
		Room selectedRoom = rooms.get(0);
		
		while(pOne.isAlive() == true && selectedRoom.getRoomNum() != 15){
			selectedRoom.playerInteraction(pOne);
			selectedRoom.showProblem();
			selectedRoom = rooms.get(selectedRoom.changeRoom(selectedRoom.getChoice(3)));
		}
	scan.close();	
	}
}

