package sist.com.obj.core4Practice;

public class NewsMain {
	public static void main(String[] args) {
		SportsNews sportsNews = new SportsNews(new Basketball());
		SportsNews sportsNews2 = new SportsNews(new Soccer());
		SportsNews sportsNews3 = new SportsNews(new Baseball());	
		sportsNews.write();
		System.out.println();
		sportsNews2.write();
		System.out.println();
		sportsNews3.modify();
	}
}
