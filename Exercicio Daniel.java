/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main 
	{
		public static void main(String[] args) {
			String salaDesejada = "A219";
			String salaInformada = "";
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o numero da sala: ");
			salaInformada = scanner.next();

			if(salaDesejada.equals(salaInformada)) {
				System.out.println("Voce encontrou sua sala!");
			} else {
				System.out.println("Voce esta perdido! ");
			}
			scanner.close();




		}
	}