package interfaces;

import java.util.Random;

interface Game1
{
	void print();
}
interface GameFactory1
{
	Game1 getGame();
}

class Coin implements Game1
{
	private static int seed = 37;
	public void print()
	{
		Random rand = new Random(seed++);
		int temp = rand.nextInt(2);
		if(rand.nextInt(2)==1)
			System.out.println("正面");
		else
			System.out.println("反面");
	}
}
class CoinFactory implements GameFactory1
{
	public Game1 getGame()
	{
		return new Coin();
	}
}

class Dice implements Game1
{
	private static int seed = 12;
	public void print()
	{
		Random rand = new Random(seed++);
		System.out.println(rand.nextInt(6) + 1);
	}
}

class DiceFactory implements GameFactory1
{
	public Game1 getGame()
	{
		return new Dice();
	}
}
public class GameTest 
{
	public static void playGame(GameFactory1 factory)
	{
		Game1 g = factory.getGame();
		g.print();
	}
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i ++)
			playGame(new DiceFactory());
		for(int i = 0; i < 10; i ++)
			playGame(new CoinFactory());
	}
}
