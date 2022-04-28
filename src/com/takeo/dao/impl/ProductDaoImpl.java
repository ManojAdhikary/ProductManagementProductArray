package com.takeo.dao.impl;

import java.util.Scanner;

import com.takeo.model.Product;

public class ProductDaoImpl {

	Scanner sc = new Scanner(System.in);

	static Product product[] = null;

	public void addProducts() {

		System.out.println("How Many Product would you like to buy?");
		int size = sc.nextInt();// 3
		product = new Product[size];

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter Product Number ");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name ");
			String sname = sc.next();
			System.out.println("Enter Product Details");
			String sadd = sc.next();

			Product pro = new Product(pid, sadd, pid,pid);
	//		Product pro = new Product(pid, pname, qty,price);

			product[i] = pro;
			System.out.println("Product Record Added Success Fully");

		} // end of for loop

	}// end of addStudents();

	public Product[] viewAllProducts() {

		return product;
	}// end of viewAll Students

	public Product viewProduct(int pid) {
		if (product != null) {
			for (Product pro : product) {

				if (pro.getPid() == pid) {
					return pro;
				}
			}
		}
		return null;
	}// end of viewStudent

	public void delete(int pid) {

		int j = 0;
		int k = 0;
		if (product != null) {
			for (Product stu : product) {

				if (stu.getPid() == pid) {

					product[k] = null;
					System.out.println("Record is deleted SuccessFully");
					++j;
					break;
				}
				++k;
			}

		} else {
			System.out.println("Records not exist");
		}
		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of delete Method

	public void update(int pid) {

		int j = 0;
		if (product != null) {
			for (Product pro : product) {
				if (pro.getPid() == pid) {
					++j;
					System.out.println("Do You Want to update 1)Product Name 2)Product details");
					System.out.println("Enter The Choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter Product Name");
						String name = sc.next();
						pro.setPname(name);// updating a name
						System.out.println("Product Name updated SuccessFully");
						break;
					case 2:
						System.out.println("Enter Product Details");
						int sqty = sc.nextInt();
						pro.setQty(sqty);
						System.out.println("Product Details is updated SuccessFully");
						break;
					default:
						System.out.println("Choose 1 to 2 between ");
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