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
		RoomSeven rSeven = new RoomSeven(7);
		RoomEight rEight = new RoomEight(8);
		RoomNine rNine = new RoomNine(9);
		RoomTen rTen = new RoomTen(10);
		RoomEleven rEleven = new RoomEleven(11);
		RoomTwelve rTwelve = new RoomTwelve(12);
		RoomThirteen rThirteen = new RoomThirteen(13);
		RoomFourteen rFourteen = new RoomFourteen(14);
		RoomFifteen rFifteen = new RoomFifteen(15);
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(rOne);
		rooms.add(rTwo);
		rooms.add(rThree);
		rooms.add(rFour);
		rooms.add(rFive);
		rooms.add(rSix);
		rooms.add(rSeven);
		rooms.add(rEight);
		rooms.add(rNine);
		rooms.add(rTen);
		rooms.add(rEleven);
		rooms.add(rTwelve);
		rooms.add(rThirteen);
		rooms.add(rFourteen);
		rooms.add(rFifteen);
			
		System.out.println(pOne.getName() + " has entered the dungeon");
		Room selectedRoom = rooms.get(0);
		
		while(selectedRoom.roomNum != 15 || pOne.isAlive() == false){
			try{
				Player player = pOne;
				selectedRoom.roomInteraction(player, scan);
				Thread.sleep(1000);
				System.out.println();
				selectedRoom.showProblem();
				Thread.sleep(1000);
				System.out.println();
				int changeRoomNum = selectedRoom.changeRoom(scan) - 1;
				selectedRoom = rooms.get(changeRoomNum);
				selectedRoom.getRoomNum();
			}
			catch(InterruptedException e){
				System.err.println("Error, Thread.sleep was interrupted");
			}
		}
		scan.close();
		System.out.println("CONGRADULATIONS!!!");
		System.out.println("You have escaped the dungeon with all of your riches!");
	}
}

