package com.takeo.details;

import java.util.Scanner;

import com.takeo.client.ProductClient;
import com.takeo.dao.impl.ProductDaoImpl;
import com.takeo.model.Product;

public class ProductDetails {

	Scanner sc = new Scanner(System.in);

	ProductDaoImpl daoImpl = new ProductDaoImpl();

	public void stuMenu()

	{
		while (true) {
			System.out.println("************************************************");

			System.out.println("           1)Add Product                         ");
			System.out.println("           2)View AllProducts                    ");
			System.out.println("           3)View Product                        ");
			System.out.println("           4)Delete Product                      ");
			System.out.println("           5)UpdateProduct                      ");
			System.out.println("           6)Back                               ");

			System.out.println("************************************************");

			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addProducts();
				break;
			case 2:
				Product[] viewAllProducts = daoImpl.viewAllProducts();

				System.out.println("*************************************************");
				System.out.println("PID \t PNAME \t QTY \t PRICE");
				System.out.println("*************************************************");
				if (viewAllProducts != null) {
					for (Product pro : viewAllProducts) {
						if (pro != null)
							System.out.println(pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getQty()+ "\t" + pro.getPrice());
					}
				} // end of if
				else
					System.out.println("Records Not found");
				break;
			case 3:
				System.out.println("Enter Product Number");
				Product pro = daoImpl.viewProduct(sc.nextInt());
				System.out.println("*************************************************");
				System.out.println("PID \t PNAME \t QTY \t PRICE");
				System.out.println("*************************************************");

				if (pro != null)
					System.out.println(pro.getPid() + "\t" + pro.getPname() + "\t" + pro.getQty()+ "\t" + pro.getPrice());
				else
					System.out.println("Given Record Not Found");
				break;
			case 4:
				System.out.println("Enter Product Number");
				daoImpl.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Product Number");
				daoImpl.update(sc.nextInt());
				break;

			case 6:

				ProductClient.main(null);
				break;

			default:
				System.out.println("Choose 1 to 4 Between");

			}// end of switch

		} // end of while
	}
}
