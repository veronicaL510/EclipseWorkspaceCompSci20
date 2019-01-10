/**
 * this class describes the customer's information
 * @author veronicaL5
 *
 */
	public class Customer {
		private String secretLairLocation;
		private String name;
		private double evilFunds;
		
		// stores values to variables (values are nothing really)
		public Customer () {
			secretLairLocation = "BMHS";
			name = "Med";
			evilFunds = 10000;
			
		}
		/**
		 * uses this. method
		 * @param secretLairLocation
		 * @param name
		 * @param evilFunds
		 */
		public Customer (String secretLairLocation, String name, double evilFunds) {
			this.secretLairLocation = secretLairLocation;
			this.name = name;
			this.evilFunds = evilFunds;
		}
		
		/**
		 * returns the secret lair location, name, and how much evil funds are
		 */
		public String toString() {
			return "Secret lair location: " + secretLairLocation + "   " + "Name: " + name + "   " + "Evil Funds: " + evilFunds; 
		}
		
		/**
		 * uses this.method, adds funds to customer's evilFunds
		 * @param evilFunds
		 */
		public void addFunds (double evilFunds) {
			this.evilFunds = evilFunds;
		}
		
		public String getsecretLairLocation() { // accessor
			return secretLairLocation;
		}
		
		/** 
		 * uses this. method
		 * @param secretlairLocation
		 */
		public void setsecretLairLocation(String secretlairLocation) {
			this.secretLairLocation = secretLairLocation;
		}
		
		public String getname() { //accessor
			return name;
		}
		/**
		 * uses this. method
		 * @param name
		 */
		
		public void setname(String name) {
			this.name = name;
		}
		
		public double getevilFunds() { //accessor
			return evilFunds;
			
		}
		
		/**
		 * uses this. method
		 * @param evilFunds
		 */
		public void setevilFunds(double evilFunds) {
			this.evilFunds = evilFunds;
		}
		
	}
	
	
	
	
	
	

