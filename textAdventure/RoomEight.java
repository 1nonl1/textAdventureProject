//package textAdventure;
//Graydon Room

class RoomEight extends Room{
	public int changeRoom(int choice){
        switch(choice){
            case 1:
                return 9; // Room to change to
            case 2:
                return 6;
            case 3:
                return 8;
        }
        return 8;
    }
    public void showProblem(){
        //Custom problem for rooms (Define Here) 
        System.out.println("you see 3 doors.");
        System.out.println("The first has a weathered door");
        System.out.println("The second one has a smell coming from it");
        System.out.println("The last door...");
        System.out.println("What will you do? \n\t1)Go into the weathered door(Door 1)\n\t2)Look into the smell(Door 2)\n\t3)Go to Door 3");

    }
    public void roomInteraction(Player other){
        System.out.println("...");
    }
}
