import java.util.ArrayList;

/**
 * this class describes an invoice for a set of purchased products
 * @author veronicaL5
 *
 */
public class Invoice {
		private Customer TheCustomer;
		private ArrayList <LineItem> listOfItems = new ArrayList<>();
		
		/**
		 * uses this. method for customer
		 * @param TheCustomer
		 */
		public Invoice (Customer TheCustomer) {
			this.TheCustomer = TheCustomer;
		}
		
		/**
		 * this creates a new line item and adds the new line item to the items ArrayList
		 * @param theProduct
		 * @param qty
		 */
		public void addToOrder (Product theProduct, int qty) {
			LineItem items = new LineItem(qty, theProduct);
			listOfItems.add(items);
		}
		
		/**
		 * prints out all LineItems in the items ArrayList.  
		 */
		public void printInvoice () {
			
			for (int i = 0; i < listOfItems.size(); i++) {
				System.out.println(listOfItems.get(i));
				canAfford(TheCustomer);
			}
		}
		
		/**
		 * if customer can afford the purchase this returns true
		 * @param TheCustomer
		 * @return boolean values true or false
		 */
		public boolean canAfford (Customer TheCustomer) {
			if (amountDue() <= TheCustomer.getevilFunds()) {  // calculates if amount due is greater or equal to evil funds
				System.out.println("Evil funds enough!  Purchase approved.");
				return true;
			}
			else {
				System.out.println("Evil funds not enough!  Purchase denied.");
				System.out.println("You are short by " + (amountDue() - TheCustomer.getevilFunds())); // calculates hoe much customer is short by
			    return false;
			// amount due subtract to evil funds and see if true or not, if they can afford or not
		}
		}		
		
		/**
		 * calculates the whole price of the order
		 * @return totalPrice of order
		 */
		public double amountDue() {
		
			double totalPrice = 0.00;
			
			for (int i = 0; i < listOfItems.size(); i++) {
				totalPrice = totalPrice + listOfItems.get(i).getqty()*listOfItems.get(i).gettheProduct().getprice();
			}
			return totalPrice;
			
		}
		
		
	}

