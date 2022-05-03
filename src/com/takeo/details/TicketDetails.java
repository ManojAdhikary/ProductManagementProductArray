package com.takeo.details;

import java.util.Scanner;

import com.takeo.client.TicketAMC;
import com.takeo.dao.impl.TicketDaoImpl;
import com.takeo.model.Ticket;

public class TicketDetails {

	Scanner sc = new Scanner(System.in);

	TicketDaoImpl daoImpl = new TicketDaoImpl();

	public void stuMenu()

	{
		while (true) {
			System.out.println("************************************************");

			System.out.println("           1)Buy Ticket                          ");
			System.out.println("           2)View All Ticket                      ");
			System.out.println("           3)View My Ticket                      ");
			System.out.println("           4)Cancel Ticket                      ");
			System.out.println("           5)Update Ticket                        ");
			System.out.println("           6)Back                               ");

			System.out.println("************************************************");

			System.out.println("Enter The Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addTickets();
				break;
			case 2:
				Ticket[] viewAllTickets = daoImpl.viewAllTickets();

				System.out.println("*************************************************");
				System.out.println("Seat No\tMovie Name\tQTY\tPrice $");
				System.out.println("*************************************************");
				if (viewAllTickets != null) {
					for (Ticket tic : viewAllTickets) {
						if (tic != null)
							System.out.println(tic.getSno() + "\t" + tic.getPname() + "\t" + tic.getQty()+ "\t" + tic.getPrice());
					}
				} // end of if
				else
					System.out.println("Records Not found");
				break;
			case 3:
				System.out.println("Enter Seat Number");
				Ticket pro = daoImpl.viewProduct(sc.nextInt());
				System.out.println("*************************************************");
				System.out.println("Seat No\tMovie Name\tQTY\tPrice $");
				System.out.println("*************************************************");

				if (pro != null)
					System.out.println(pro.getSno() + "\t" + pro.getPname() + "\t" + pro.getQty()+ "\t" + pro.getPrice());
				else
					System.out.println("Given Record Not Found");
				break;
			case 4:
				System.out.println("Enter Seat Number");
				daoImpl.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Seat Number");
				daoImpl.update(sc.nextInt());
				break;

			case 6:

				TicketAMC.main(null);
				break;

			default:
				System.out.println("Please choose between \"1\" and \"4\" only.");

			}// end of switch

		} // end of while
	}
}
