package log4j2;

public class User {

	private String name;
	private String birthday;
	
	public User(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
