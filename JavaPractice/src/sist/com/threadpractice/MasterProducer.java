package sist.com.threadpractice;

public class MasterProducer {
	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		ProduceEx pEx = new ProduceEx(pokemon);
		Thread pt = new Thread(pEx);
		MasterEx mEx = new MasterEx(pokemon);
		Thread mt = new Thread(mEx);
		pt.start();
		mt.start();
	}
}
