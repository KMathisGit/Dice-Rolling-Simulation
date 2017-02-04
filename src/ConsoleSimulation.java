import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ConsoleSimulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Dice> die_container = new ArrayList<Dice>();
		
		Random rand = new Random();
		int num_dice, num_sides, num_rolls, die_roll, total_value;
		
		System.out.println("How many die shall we roll at once?");
		num_dice = sc.nextInt();
		int[] result_percentages = new int[num_dice*6];
		System.out.println("How many sides on each die?");
		num_sides = sc.nextInt();
		for(int i = 0; i < num_dice; i++){
			die_container.add(new Dice(num_sides));
		}
		System.out.print("How many times shall we roll these die?");
		num_rolls = sc.nextInt();
		for(int i = 0; i < num_rolls; i++){
			total_value = 0;
			for(int j = 0; j < die_container.size(); j++){
				die_roll = Dice.rollDie(die_container.get(j));
				System.out.println("Die-"+(j+1)+": "+die_roll);
				total_value += die_roll;
			}
			System.out.println("Roll-"+(i+1)+": "+total_value);
			result_percentages[total_value-num_dice] += 1;
		}
		int j = 0;
		for(int i = 1*num_dice; i <= result_percentages.length; i++){
			double percent = (double) result_percentages[j]/num_rolls;
			System.out.println(i + " was rolled " + percent + "% of the time.");
			j++;
		}
				

	}

}
