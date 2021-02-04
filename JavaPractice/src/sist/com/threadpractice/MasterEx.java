package sist.com.threadpractice;

public class MasterEx implements Runnable{

	private Pokemon pokemon;

	public MasterEx(Pokemon pokemon) {
		super();
		this.pokemon = pokemon;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String pokemonName = null;
		for (int i = 0; i < 20; i++) {
			pokemonName = pokemon.pop();
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	
}
