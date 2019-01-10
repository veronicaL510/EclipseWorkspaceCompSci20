
public class TestInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
				
				//invoice run 1
				Customer c = new Customer("island", "Dr evil", 1230.0);
				Invoice in = new Invoice(c);
				in.addToOrder(new Product("flame Thower",123.80), 3);
				in.addToOrder(new Product("sharks", 105.2),2);
				in.addToOrder(new Product("lasers",50.5),20);
				
				runInvoice(c,in); //runs invoice
				
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				
				//invoice run 2
				Customer c2 = new Customer ("BMHS", "logan", 222.00);
				Invoice in2 = new Invoice(c2);
				in2.addToOrder(new Product("dogs", 3333.00), 4);
				in2.addToOrder(new Product("cats", 3433.00), 1);
				in2.addToOrder(new Product("birds", 3353.00), 94);
				in2.addToOrder(new Product("frogs", 33.00), 8);
				in2.addToOrder(new Product("elephants", 3.00), 3);
				
				runInvoice(c2, in2);
				
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				
				//invoice run 3
				Customer c3 = new Customer ("Philippines", "hulk", 100.00);
				Invoice in3 = new Invoice(c3);
				in3.addToOrder(new Product("cake", 33.00), 4);
				in3.addToOrder(new Product("oranges", 34.00), 1);
				in3.addToOrder(new Product("muffins", 53.00), 4);
				in3.addToOrder(new Product("chips", 43.00), 6);
				in3.addToOrder(new Product("rice", 3.00), 1);
				
				runInvoice(c3, in3);
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				
				//invoice run 4
				Customer c4 = new Customer ("Disneyland", "scarlet", 222.00);
				Invoice in4 = new Invoice(c4);
				in4.addToOrder(new Product("hat", 33.00), 4);
				in4.addToOrder(new Product("shirt", 3.00), 1);
				in4.addToOrder(new Product("book", 5.00), 1);
				in4.addToOrder(new Product("magic wand", 3.00), 1);
				in4.addToOrder(new Product("robe", 3.00), 1);
				
				runInvoice(c4, in4);
				
			}//end main
			
			//do not modify code below
			public static void runInvoice(Customer c, Invoice i) {
				i.printInvoice();

				if(c.getevilFunds()- i.amountDue() < 0) {
					System.out.println("Evil villian credit union to the rescue!!");	
					c.addFunds(i.amountDue() - c.getevilFunds());
					System.out.println("New funds total: " + c.getevilFunds());
		i.printInvoice();
				}
						
			}//end runInvoice

		}//end TestInvoice

