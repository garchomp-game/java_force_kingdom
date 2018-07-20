package src.app.main;

import src.app.lib.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Player player = new Palyer();
		Dealer dealer = new Dealer();
		Game game = new Game(player, dealer);
		game.start();
	}
}