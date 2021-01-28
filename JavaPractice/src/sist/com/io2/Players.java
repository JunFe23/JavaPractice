package sist.com.io2;

public class Players {
	private String team;
	private String name;
	private String position;
	private int number;
	
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Players(String team, String name, String position, int number) {
		super();
		this.team = team;
		this.name = name;
		this.position = position;
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Players [team=" + team + ", name=" + name + ", position=" + position + ", number=" + number + "]";
	}
	
	
	
	
}
