package com.takeo.dao.impl;
import java.util.Calendar;
import java.util.Date;
//Step 2: Impl: Scanner, methods
import java.util.Scanner;

import com.takeo.model.Ticket;

public class TicketDaoImpl {

	Scanner sc = new Scanner(System.in);

	static Ticket ticket[] = null;

	public void addTickets() {

		System.out.println("Welcome to AMC Theature!\nHow many movie tickets would you like to buy? ");
		int size = sc.nextInt();
		ticket = new Ticket[size];

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter Seat  Number ");
			int sno = sc.nextInt();
			System.out.println("Enter your Name ");
			String sname = sc.next();
			System.out.println("Enter Movie Name");
			String sadd = sc.next();

			Ticket pro = new Ticket(sno, sadd, sno,sno);
	//		Product pro = new Product(pid, pname, qty,price);

			ticket[i] = pro;
			System.out.println("You successfully purchased a movie ticket. ");

		} // end of for loop

	}// end of addTickets();

	public Ticket[] viewAllTickets() {

		return ticket;
	}// end of viewAll Tickets

	public Ticket viewProduct(int pid) {
		if (ticket != null) {
			for (Ticket pro : ticket) {

				if (pro.getSno() == pid) {
					return pro;
				}
			}
		}
		return null;
	}// end of viewTicket

	public void delete(int pid) {

		int j = 0;
		int k = 0;
		if (ticket != null) {
			for (Ticket pro : ticket) {
				if(pro!=null) {

				if (pro.getSno() == pid) {
					Calendar cal = Calendar.getInstance();
					Date cdate = cal.getTime();
					ticket[k] = null;
					System.out.println("You successfully canceled the movie ticket.\n"+cdate);
					k++;
					++j;
					break;
				}
				++k;
			}
			}

		} else {
			System.out.println("This ticket does not appear on our system.");
		}
		if (j == 0)
			System.out.println("The given ticket record is not found on our system.");

	}// end of delete Method

	public void update(int pid) {

		int j = 0;
		if (ticket != null) {
			for (Ticket pro : ticket) {
				if (pro.getSno() == pid) {
					++j;
					System.out.println("Do You Want to update 1)Person Name 2)Movie name");
					System.out.println("Enter The Choice : ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						Calendar cal = Calendar.getInstance();
						Date cdate = cal.getTime();
						System.out.println("Enter Person Name");
						String name = sc.next();
						pro.setPname(name);// updating a name
						System.out.println("Your name has been successfully updated."+cdate);
						break;
					case 2:
						System.out.println("Enter the Movie Name");
						int sqty = sc.nextInt();
						pro.setQty(sqty);
						System.out.println("Your movie name has been successfully updated.");
						break;
					default:
						System.out.println("Please choose between \"1\" and \"2\" only.");
					}// end of switch

				} // end of if

			}

		} // end of if
		else {
			System.out.println("Records are Not Exisit");
		}

		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of update

}