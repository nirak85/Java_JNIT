
class Customer {
	private String firstName;
	private String secondName;
	private String creditCard;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}
class Encapsulation {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Niraj");
		c.setSecondName("Shakya");
		c.setCreditCard("214234200232");

		System.out.println("First name: " + c.getFirstName());
		System.out.println("Second name: " + c.getSecondName());
		System.out.println("Credit Card: " + c.getCreditCard());

	}
}

