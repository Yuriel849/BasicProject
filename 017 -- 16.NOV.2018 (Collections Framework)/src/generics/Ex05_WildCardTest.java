package generics;

import java.util.ArrayList;
import java.util.Collections;

class Ex05_WildCardTest {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main() ��.
} // Ŭ���� ��.

class Fruit {
	public String toString() {
		return "Fruit";
	}
} // Fruit Ŭ���� ��.

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
} // Apple Ŭ���� ��.

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
} // Grape Ŭ���� ��.

class Juice {
	String name;
	
	Juice(String name) {
		this.name = name + "Juice";
	}
	
	public String toString() {
		return name;
	}
} // Juice Ŭ���� ��.

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f: box.getList())
			{ tmp += f + " "; }
		return new Juice(tmp);	
	}
} // Juicer Ŭ���� ��.

class FruitBox<T extends Fruit> extends Box<T> { } // FruitBox Ŭ���� ��.

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)
		{ list.add(item); }
	T get(int i)
		{ return list.get(i); }
	ArrayList<T> getList()
		{ return list; }
	int size()
		{ return list.size(); }
	public String toString()
		{ return list.toString(); }
}  // Box<T> Ŭ���� ��.