package com.sist.threadpractice;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	private List<String> pokemonList;
	 
	public void Pocketmon() {
		pokemonList = new ArrayList<String>();
	}
	
	public String getPokemon() {
		String pokemonName = null;
		switch((int)(Math.random()*10)) {
			case 1:
				pokemonName = "피카츄";
				break;
			case 2:
				pokemonName = "라이츄";
				break;
			case 3:
				pokemonName = "파이리";
				break;
			case 4:
				pokemonName = "꼬부기";
				break;
			case 5:
				pokemonName = "버터플";
				break;
			case 6:
				pokemonName = "야도란";
				break;
			case 7:
				pokemonName = "피죤투";
				break;
			case 8:
				pokemonName = "또가스";
				break;
			case 9:
				pokemonName = "토게피";
				break;
			case 10:
				pokemonName = "뮤";
				break;
		}
		return pokemonName;
	} 
	
	public synchronized String pop() {
		String pokemonName = null;
		if(pokemonList.size()==0) {
			try {
				System.out.println("포켓몬이 없습니다. 기다려주세요.");
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		pokemonName = (String)pokemonList.remove(pokemonList.size()-1);
		return pokemonName;
	}
	
	public synchronized void push(String pokemon) {
		pokemonList.add(pokemon);
		System.out.println(pokemon+"이 생성되었습니다.");
		if((pokemonList.size())==10) {
			this.notify();
		}
	}
	
}
