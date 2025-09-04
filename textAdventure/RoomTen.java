//package textAdventure;
//Graydon Room

class RoomTen extends Room{
	public int changeRoom(int choice){
        switch(choice){
            case 1:
                return 5; // Room to change to
            case 2:
                return 11;
            case 3:
                return 13;
        }
        return 10;
    }
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("After answering the question you see 3 doors.");
        System.out.println("The first one has a slight breeze coming from it");
        System.out.println("The second one has a flickering light");
        System.out.println("The last one you hear a stream of water");
        System.out.println("What will you do? \n\t1)Follow the breeze (Room 2)\n\t2)Follow the light (Room 3)\n\t3)Try to get some water (Room 4");

    }
    public void roomInteraction(Player other){
        System.out.println("A mischief of rats swarm at you");
        for(int i = 13; i > 0; i--){
            other.battle(new Monster(2, 4,"rat", "a sewer rat"));
        }
        other.collect(new Item(0, 10, 7, "Cooked rat", "some rat flesh you cooked over a makeshift fire"));

    }
}
