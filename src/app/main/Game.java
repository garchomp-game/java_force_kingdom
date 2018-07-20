package src.app.main;

public class Game {
	Player player;
	Dealer dealer;
	Boolean switch = true;
	public Game(Player player, Dealer dealer)
	{
		this.player = player;
		this.dealer = dealer;
	}

	public void start()
	{
		Deck deck = new Deck;
		while(this.switch)
		{
			this.switch = this.player.drow(deck);
			this.switch = this.dealer.drow(deck);
		}
	}

}
