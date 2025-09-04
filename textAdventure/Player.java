//package textAdventure;


import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	
	//attributes
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	private Item equippedWeapon = new Item(1, -1, 99, "Fists", "your own two hands");
	
	private int health = 100;
	private String name = "";
	private boolean alive;
	
	
	//Constructor
	public Player() {
		this.setName();
		this.inventory.add(this.equippedWeapon);
		this.alive = true;
	}
	
	//Methods
	public void setName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your name: ");
		this.name = scan.nextLine();
		scan.close();
	}

	public String getName(){
		return this.name;
	}
	
	public int getChoice(int maxNum){
		Scanner scan = new Scanner(System.in);

		String choice = "";
		boolean choiceIsGood = false;
		int output = 0;
		while (!choiceIsGood) {
			System.out.print("Choose choice: ");
			choice = scan.nextLine();
			choiceIsGood = true;
			try {
				output = Integer.valueOf(choice);
				if (output>maxNum || output<=0) {
					System.out.println("choice must in values");
					choiceIsGood=false;
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("choice must be a number");
				choiceIsGood=false;
			}
		}
		scan.close();
		return output;
	}


	public void collect(Item item) {
		System.out.println("You pick up a " + item.getName());
		this.inventory.add(item);
	}

	public void equip(int itemIndex) {
		if (this.inventory.size()>itemIndex) {
			this.equippedWeapon = this.inventory.get(itemIndex);
		}
	}
	
	public void heal() {
		int healingPower = this.equippedWeapon.getHealPower();
		this.health+=healingPower;
		if(healingPower<=0) {
			System.out.println("What did you think healing yourself with your "
					+ this.equippedWeapon.getName() +
					" was going to do?"
					);
		}
		System.out.println("you heal" + healingPower + " health");
		this.equippedWeapon.use();
	}


	public void printInventory(){
		System.out.println("Player Inventory: ");
		System.out.println("\tEquiped: "+this.equippedWeapon.getName());
				for(int i = 0; i < this.inventory.size(); i++){
					System.out.println("\t"+(i + 1) + ". " + inventory.get(i).getName());
				}
	}


	public boolean isAlive(){
		return this.alive;
	}
	public void killPlayer(){
		this.alive = false;
	}
	public void attack(Monster monster) {
		int damage = this.equippedWeapon.getAttackPower();
		monster.takeDamage(damage);
		if(damage<0) {
			System.out.println("Why'd you attack with your "
					+ this.equippedWeapon.getName()+"?");
		}
		System.out.println(monster.getName()+ " took "+ damage+ " damage");
	}
	
	public void openInventory() {
		int i;
		for(;;) {
			this.printInventory();
			System.out.println("What do you want to do?\n\t"+
					"1) Inspect item\n\t" +
					"2) Switch equipped item\n\t" +
					"3) Exit");
			switch(this.getChoice(3)){
				case 1:
					System.out.println("what item do you want to inspect?");
					i = this.getChoice(this.inventory.size());
					System.out.println(this.inventory.get(i-1));
					break;
				case 2: 
					System.out.println("what item do you want to equip?");
					i = this.getChoice(this.inventory.size());
					this.equip(i-1);
					break;
				case 3: return;
			}
		}
	}
	
	public void takeDamage(int damage) {
		this.health-=damage;
		if(this.health<=0) {
			this.alive=false;
		}
	}
	
	public void battleTurn(Monster monster) {
		
		System.out.println("you have "+ this.health + " health");
		System.out.println(monster.getName() + " has "+ monster.getHealth()+ " health");
		System.out.println("What do you want to do?\n\t"+
				"1) Open Inventory\n\t" +
				"2) Attack\n\t" +
				"3) Heal\n\t"+
				"4) Inspect monster");
		switch(this.getChoice(4)){
		case 1: 
			this.openInventory();
			break;
		case 2: 
			this.attack(monster);
			break;
		case 3: 
			this.heal();
			break;
		case 4: 
			System.out.println(monster);
			break;
		}
	}
	
	public void battle(Monster monster) { 
		System.out.println(this.name + " has entered into battle with " + monster.getName());
		while(this.alive && monster.isAlive()) {
			this.battleTurn(monster);
			monster.battleTurn(this);
		}
		if(this.alive) {
			System.out.println("YOU WON");
		}
		else {
			System.out.println("you died");
		}
		
	}
	



}





