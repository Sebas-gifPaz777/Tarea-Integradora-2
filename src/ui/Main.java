package ui;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static Scanner sn= new Scanner(System.in);
	public static int counter=0;
	
	public static void main(String[]args) throws IOException {
		boolean exit=false;
		int answer=0;

		while(!exit) {
			System.out.println("Choose an option"+"\n1:Start Game"+"\n2:Exit");
			answer=sn.nextInt();

			switch(answer) {

			case 1:
				playGame();
				break;

			case 2:
				exit=true;
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	public static void playGame() {
		
	}
}
