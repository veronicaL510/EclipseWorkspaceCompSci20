/**
 * describes a quantity of a product to be purchased
 * @author veronicaL5
 *
 */
public class LineItem {
		private int qty;
		private Product theProduct;
		
		/**
		 * uses this. method
		 * @param qty
		 * @param theProduct
		 */
		public LineItem (int qty, Product theProduct) {
			this.qty = qty;
			this.theProduct = theProduct;
		}
		
		/**
		 * uses this. method
		 * @param qty
		 */
		public void setqty(int qty) {
			this.qty = qty;
		}
		
		public int getqty() { // accessor
			return qty;
		}
		
		/**
		 * uses this. method
		 * @param theProduct
		 */
		public void settheProduct(Product theProduct) {
			this.theProduct = theProduct;
		}
		
		public Product gettheProduct() { // accessor
			return theProduct;
		}
		
		/**
		 * returns the quantity or product bought and the product
		 */
		public String toString() {
			return "Quantity: " + qty + "   " + "Product: " + theProduct; 
		}
	}
