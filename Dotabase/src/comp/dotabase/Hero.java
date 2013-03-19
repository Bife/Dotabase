package comp.dotabase;

public class Hero {
	
	private int name;
	private int level;
	private int hp;
	private int mana;
	private int manar;
	private int hpr;
	private int damage;
	private int armor;
	private int ms;
	private int str;
	private int agi;
	private int inte;
	private int strperlevel;
	private int agiperlevel;
	private int intperlevel;
	
	private Item vetor[] = new Item[6];

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getManar() {
		return manar;
	}

	public void setManar(int manar) {
		this.manar = manar;
	}

	public int getHpr() {
		return hpr;
	}

	public void setHpr(int hpr) {
		this.hpr = hpr;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getMs() {
		return ms;
	}

	public void setMs(int ms) {
		this.ms = ms;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getAgi() {
		return agi;
	}

	public void setAgi(int agi) {
		this.agi = agi;
	}

	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	}

	public Item[] getVetor() {
		return vetor;
	}

	public void setVetor(Item[] vetor) {
		this.vetor = vetor;
	}
	
	
	

}
