package com.training.domains;

import java.util.Scanner;


import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom showRoom = new ShowRoom();
		NewShowRoom nShowRoom=new NewShowRoom();
		Automobile polyAuto = null;
		int key = 1;
		
		polyAuto = showRoom.getItem(key);
				
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter \n 1 for Passanger Car \n 2 for Luxury Car  \n 3. for Sports Car \n 4. for SportsBike \n 5. to Terminate");
			key=sc.nextInt();
			
			switch(key){
			
			case 1:
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 2:	
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 3:	
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;	
			case 4:
				polyAuto = nShowRoom.getItem(key);
				showRoom.printQuote(polyAuto);
				break;
			case 5:	
				System.out.println("Byee..Byee...");
				return;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
		

	}

}
