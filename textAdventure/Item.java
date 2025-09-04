package textAdventure;


public class Item{
	//Attributes
	private boolean equipped = false;
	
	//every item has every stat, but an axe might have -5 healing power if you 
	//try to heal with it
	private int attackPower;
	private int healingPower;
	private int uses;
	private String name;
	private String description ;

	//Constructor
	public Item(int atk, int healing, int uses, String name, String description) {
		this.attackPower=atk;
		this.healingPower=healing;
		this.uses=uses;
		this.name=name;
		this.description=description;
	}

	//Methods
	public void setEquipped(boolean equipStatus) {
		this.equipped = equipStatus;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealPower() {
		return this.healingPower;
	}
	public void use() {
		this.uses-=1;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	@Override
	public String toString() {
		String output = name + "\n";
		output+=this.description + "\n\t";
		output+="Attack Power: "+ this.attackPower + "\n\t";
		output+="Healing Power: " + this.healingPower + "\n\t";
		output+="Uses Left: " + this.uses+"\n\t";
				
		return output;
	}
}



