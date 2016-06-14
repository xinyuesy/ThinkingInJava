package interfaces;

interface CanFight
{
	void fight();
}

interface CanSwim
{
	void swim();
}

interface CanFly
{
	void fly();
}


interface CanClimb
{
	void climb();
}



interface CanSport
{
	void sport();
}

interface CanSwimming extends CanSport
{
	void swim();
}

interface CanFootball extends CanSport
{
	void football();
}
interface CanWaterPolo extends CanSwimming, CanFootball
{
	void WaterPolo();
}
class ActionCharacter
{
	public void fight() { System.out.println(this + ".fight(), ActionCharacter"); }
	public String toString()
	{
		return "ActionCharacter";
	}
}


class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb
{
	public void swim() { System.out.println(this + ".swim()"); }
	public void fly() { System.out.println(this + ".fly()"); }
	//public void fight() { System.out.println(this + ".fight(), Hero"); }
	public void climb() { System.out.println(this + ".climb()"); } 
	public String toString()
	{
		return "Hero";
	}
	
	
}
public class Adventure 
{
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	public static void x(CanClimb x) { x.climb(); }
	public static void main(String[] args)
	{
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		x(h);
	}
}
