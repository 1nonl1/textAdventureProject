//package textAdventure;
//Graydon Room

class RoomSix extends Room{
    protected int roomNum;
	public RoomSix(int roomNum) {
		this.roomNum = roomNum;
	}
	public int changeRoom(int choice){
        switch(choice){
            case 1:
                return 3; // Room to change to
            case 2:
                return 7;
            case 3:
                return 11;
        }
        return 6;
    }
    public void showProblem(){
    //Custom problem for rooms (Define Here) 
    System.out.println("The first one has a slight breeze coming from it");
    System.out.println("There is a small puddle coming underneath door 2");
    System.out.println("The third one is slightly bowed outward");
	System.out.println("What will you do? \n\t1)Follow the breeze (Door 1)\n\t2)Go toward the water(Door 2)\n\t3)Check out the third door(Door 3)");

    }
    public void roomInteraction(Player other){
        System.out.println("A giant rat lunges toward you from the wall");
        other.battle(new Monster(5, 8,"giant rat", "A huge snarling beast"));
        other.collect(new Item(0, -3, 2, "rotting flesh","Flesh from the giant rat"));
    }
}
