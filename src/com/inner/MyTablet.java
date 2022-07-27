package com.inner;
// 4. anonymous class(무명 클래스)

abstract class Movie{
	abstract void play();
}

interface Game{
	void play();
}

class MyMovie extends Movie{

	@Override
	void play() {
		System.out.println("Mafia city2");
		
	}
	
}

public class MyTablet {
	
	public void start(Movie m ) {
		m.play();
	}
	
	public void start(Game g) {
		g.play();
	}
	
	public static void main(String[] args) {
		MyTablet tab = new MyTablet();
		tab.start(new MyMovie());
		// anonymous class : define class and construct object at the same time;
		tab.start(new Movie() { // define anonymous class extends Movie class and Construct
			
			@Override
			void play() {
				System.out.println("TOPGUN2");
			}
		});
		tab.start(new Movie() {
			
			@Override
			void play() {
				System.out.println("InterStellar");
				
			}
		});
		tab.start(new Movie() {
			
			@Override
			void play() {
				System.out.println("Conjuring");
				
			}
		});
		tab.start(new Game() {
			
			@Override
			public void play() {
				System.out.println("KartRider");
				
			}
		});
	}

}
