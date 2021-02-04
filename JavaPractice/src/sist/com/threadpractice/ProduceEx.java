package sist.com.threadpractice;

public class ProduceEx implements Runnable{
	private Pokemon pokemon;

	public ProduceEx(Pokemon pokemon) {
		super();
		this.pokemon = pokemon;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String pokemonName = null;
		pokemonName = pokemon.getPokemon();
		pokemon.push(pokemonName);
		try {
			Thread.sleep((int)(Math.random()*500));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
