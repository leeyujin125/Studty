package ObjectCore;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}//Animal

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}//Human

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}//Tiger

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}//Eagle

public class AimalTest {
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		ArrayList<Animal> animallist = new ArrayList<Animal>();
		animallist.add(hAnimal);
		animallist.add(tAnimal);
		animallist.add(eAnimal);
		
		for(Animal ani : animallist) {
			ani.move();	//다형성 구현
		}
		
	}
	
	public static void animalMove(Animal animal) {
		animal.move();
	}
}
