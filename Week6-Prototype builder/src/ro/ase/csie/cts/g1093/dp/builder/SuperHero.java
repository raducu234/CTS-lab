package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {
	
 private String name;
 private int lifePoints;
 
 private boolean isVillain;
 private boolean isWounded;
 
 private WeaponInterface rightWeapon;
 private WeaponInterface leftWeapon;
 public SuperHero() {
	 
 }
public SuperHero(String name, int lifePoints, boolean isVillain, boolean isWounded, WeaponInterface rightWeapon,
		WeaponInterface leftWeapon) {
	super();
	this.name = name;
	this.lifePoints = lifePoints;
	this.isVillain = isVillain;
	this.isWounded = isWounded;
	this.rightWeapon = rightWeapon;
	this.leftWeapon = leftWeapon;
}
 public static class SuperHeroBuilder{
	 SuperHero superhero;
	 
	 public SuperHeroBuilder(String name ,int lifePoints) {
		 this.superhero=new SuperHero();
		 this.superhero.name=name;
		 this.superhero.lifePoints=lifePoints;
	 }
	 
	 
	 public SuperHeroBuilder isVillain() {
		 this.superhero.isVillain=true;
		 return this;
	 }
	 public SuperHeroBuilder isWounded() {
		 this.superhero.isWounded=true;
		 return this;
	 }
	 
	 public SuperHeroBuilder setRightWeapon(WeaponIntertface weapon) {
		 this.superhero.rightWeapon=weapon;
		 return this;
	 }
	 
	 public SuperHeroBuilder setLeftWeapon(WeaponIntertface weapon) {
		 this.superhero.leftWeapon=weapon;
		 return this;
	 }
	 
	 public SuperHeroBuilder setSuperPower(SuperPowerInterface power) {
		 this.superhero.superheroPower=power;
		 return this;
	 }
	 
	 public SuperHero build() {
		 return new s SuperHero(null,0,false,flase,null,null,null,null);
		 return this.superhero;
	 }
	 
	 
	 
 }
 
}
