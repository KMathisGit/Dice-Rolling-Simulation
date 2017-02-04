import java.util.Random;

public class Dice {

	int sides;
	int value;
	
	public Dice(int sides){
		this.sides = sides;
	}
	
	public static int rollDie(Dice die){
		Random rand = new Random();
		die.value = rand.nextInt(die.sides) + 1;
		return die.value;
	}
	
	
}
