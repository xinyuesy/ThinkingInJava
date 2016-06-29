package innerclasses;


interface Game1
{
	void play();
}

interface GameFactory1
{
	Game1 getGame();
}
class Dice implements Game1
{
	public static GameFactory1 fact = new GameFactory1()
			{
				public Game1 getGame()
				{
					return new Dice();
				}
			};
	public void play()
	{
		System.out.println("Play Dice");
	}
}

class Coin implements Game1
{
	public static GameFactory1 fact = new GameFactory1()
	{
		public Game1 getGame()
		{
			return new Coin();
		}
	};
	public void play()
	{
		System.out.println("Play Coin");
	}
}

public class TestGame 
{
	public static void playGame(GameFactory1 fact)
	{
		fact.getGame().play();
	}
	
	public static void main(String[] args)
	{
		playGame(Coin.fact);
		playGame(Dice.fact);
	}
}
