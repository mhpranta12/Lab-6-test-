
public class Customer extends User{
			String firstname;
			String lastname;
			String address;
			public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public Customer(String firstname, String lastname, String address) {
				super();
				this.firstname = firstname;
				this.lastname = lastname;
				this.address = address;
			}
			public Customer() {
				super();
			}
			public void customer()
			{
				System.out.println(firstname+" : "+lastname+" : "+address);
			}

}
