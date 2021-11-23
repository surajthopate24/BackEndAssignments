package Que1;

public class Address {
	
		private String street;
		private String city;
		private String country;
		private int zip;
		private String state;
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(String street, String city, String country, int zip, String state) {
			super();
			this.street = street;
			this.city = city;
			this.country = country;
			this.zip = zip;
			this.state = state;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", country=" + country + ", zip=" + zip + ", state="
					+ state + "]";
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		

	
}
