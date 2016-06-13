import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome! What is your name? (enter your name): ");
		String name = scan.nextLine();
		
		System.out.print("Would you like to play a game? (enter yes or no): ");
		
		String Choice = scan.nextLine();
		String answer = "";
		
		
		if (Choice.equalsIgnoreCase ("yes"))
		{
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What would you like to do? (enter 'face the beast' or 'run away' ");
				 answer = scan.nextLine();
				 
		
		 if (answer.equalsIgnoreCase("face the beast")) {
			 System.out.println( "You approach the dragon. You see that he has _ heads. (enter '1', '2', '3' ");
		 		  answer = scan.nextLine();
		 
		 if (answer.equalsIgnoreCase("1") || answer.equalsIgnoreCase ("2") || answer.equalsIgnoreCase("3"))
		 	System.out.println("No one has ever face a " + answer + " headed dragin befroe (enter 'slingshit' or 'sword' or 'bow & arrow')");
		 		answer = scan.nextLine();
		 	
		 	System.out.println( "Armed with your " + answer + ", you approach the dragon. You can feel its firery breath as you get closer. It stares at you with _ eyes (enter 'red' or blue') ");
		 		answer = scan.nextLine();
		 		
		 		System.out.println("Oh thank goodness! " + answer +"-eyed dragons are friendly. You pet it and become friends. You name the dragon _ (enter name)" );
		 			answer = scan.nextLine();
		 			
		 		System.out.println( name + " and " +  answer + " lived happily ever after");	
		 		
		 		
		 }
			 
		 else if (answer.equalsIgnoreCase("run away")) 
		 	System.out.println("coward");
		
		 
		 }
		 			
		 
		else
			System.out.println("Than you for playing!");
		
		}
		
	
	}

 