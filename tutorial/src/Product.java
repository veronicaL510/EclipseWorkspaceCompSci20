/**
 * describes a product with description and price
 * @author veronicaL5
 *
 */
public class Product {
		private String name;
		private double price;
		
		/** 
		 * stores values to variables (values are nothing really)
		 */
		public Product() {
			name = "dogs";
			price = 25;
		}
		
		/**
		 * uses this. method
		 * @param name
		 * @param price
		 */
		public Product (String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		/**
		 * uses this. method
		 * @param name
		 */
		public void setname(String name) {
			this.name = name;
		}
		
		public String getname () { // accessor
			return name;
		}
		
		public double getprice () { // accessor
			return price;
		}
		
		/**
		 * uses this. method
		 * @param price
		 */
		public void setprice(double price) {
			this.price = price;
		}
		
		/**
		 * returns the name of product and price
		 */
		public String toString() {
			return "Name: " + name + "   " + "Price: " + price; 
		}
		
			
		
	
}