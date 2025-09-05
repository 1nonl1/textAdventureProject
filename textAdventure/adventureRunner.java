//package textAdventure;

import java.util.ArrayList;
import java.util.Scanner;

public class adventureRunner{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		Player pOne = new Player();
		RoomOne rOne = new RoomOne(1);
		RoomTwo rTwo = new RoomTwo(2);
		RoomThree rThree = new RoomThree(3);
		RoomFour rFour = new RoomFour(4);
		RoomFive rFive = new RoomFive(5);
		RoomSix rSix = new RoomSix(6);
		//RoomSeven rSeven = new RoomSeven(1);
		//RoomEight rEight = new RoomEight(1);
		//RoomNine rNine = new RoomNine(1);
		//RoomTen rTen = new RoomTen(10);
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(rOne);
		rooms.add(rTwo);
		rooms.add(rThree);
		rooms.add(rFour);
		rooms.add(rFive);
		rooms.add(rSix);
			
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

