import java.util.Date;

public class Students {

	private int sid;
	private String name;
	private String gender;
	private Date birthday;
	private String address;

	public Students() {
	}

	public Students(int sid, String name, String gender, Date birthday,
			String address) {
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", name=" + name + ", gender=" + gender
				+ ", birthday=" + birthday + ", address=" + address + "]";
	}

}
