package domain;

public class Admin {
	
	protected String FirstName;
	protected String LastName;
	private String UserName;
	private String Email;
	protected String Pa$$word;
	
	public Admin(String FirstName, String LastName, String UserName, String Email, String Pa$$word) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.UserName = UserName;
		this.Email = Email;
		this.Pa$$word = Pa$$word;
	}
	public Admin() {
		super();
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPa$$word() {
		return Pa$$word;
	}
	public void setPa$$word(String pa$$word) {
		Pa$$word = pa$$word;
	}
	@Override
	public String toString() {
		return "Admin [FirstName=" + FirstName + ", LastName=" + LastName + ", UserName=" + UserName + ", Email="
				+ Email + ", Pa$$word=" + Pa$$word + "]";
	}

}
