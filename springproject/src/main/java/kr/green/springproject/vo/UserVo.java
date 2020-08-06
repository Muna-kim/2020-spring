package kr.green.springproject.vo;

public class UserVo {
	private String id;
	private String pw;
	private String pw2;
	private String gender;
	private String email;
	
	
	
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", pw=" + pw + ", pw2=" + pw2 + ", gender=" + gender + ", email=" + email + "]";
	}
	
	
	
}
