//package textAdventure;


public class Monster {
//Attributes
	private int health = 0;
	private int attackPower = 0;
	private String name = "";
	private String description = "";
	private boolean alive;
		
	//Constructor
	public Monster(int atk, int hp, String name, String description) {
		this.health = hp;
		this.attackPower = atk;
		this.name = name;
		this.description = description;
		this.alive = true;
	}
		
	//Methods
	public void takeDamage(int damage){
		this.health-=damage;
		if (this.health<=0) {
			this.alive=false;
		}
	}
		
	public String getName() {
		return name;
	}
		
	public boolean isAlive() {
		return this.alive;
	}

	public int getAttackPower() {
		return attackPower;
	}
	public void battleTurn(Player player) {
		System.out.println();
		player.takeDamage(this.attackPower);
		System.out.println(this.name + " deals " + this.attackPower + " damage");
		System.out.println();
	}
	
	public int getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		String output = name + "\n";
		output+=this.description + "\n\t";
		output+="Strength: "+ this.attackPower + "\n\t";
		output+="Health: " + this.health + "\n\t";
				
		return output;
	}



}




