package com.takeo.client;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.takeo.details.TicketDetails;

public class TicketAMC {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome to the AMC Theatre Online Portal*********");

		System.out.println("           1 Tickets                      ");
		System.out.println("           2)Exit                        ");

		System.out.println("*************************************************");
		System.out.println("Enter the Choice : ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("LOGIN\nEnter User Name: ");
			String unmae = sc1.next();
			System.out.println("Enter Password: ");

			String pass = sc1.next();
			
			if(unmae.equalsIgnoreCase("admin")&&pass.equals("pass")) {
				Calendar cal = Calendar.getInstance();
				Date cdate = cal.getTime();
				System.out.println("Login Successfully!!\n"+cdate);
			}
				else {
					System.out.println("Invalid Password, Try again");
					System.exit(0);
				}
			
			TicketDetails details=new TicketDetails();
			details.stuMenu();
			
			break;
		case 2:
			Calendar cal = Calendar.getInstance();
			Date cdate = cal.getTime();
			System.out.println("Thx for Using AMC Online App!\n"+cdate);
		System.exit(0);
		default:
			System.out.println("Please choose between \"1\" and \"2\" only.");
		
		}//choice
	}

}
