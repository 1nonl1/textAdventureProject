//package textAdventure;

import java.util.ArrayList;
import java.util.Scanner;

public class adventureRunner{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		Player pOne = new Player();
		
		ArrayList<Room> rooms = new ArrayList<Room>();
			
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

