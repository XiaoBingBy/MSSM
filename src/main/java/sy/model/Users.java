package sy.model;

import java.util.Date;

public class Users {
	private Long id;

	private String username;

	private String userPass;

	private String userNicename;

	private String userEmail;

	private Date userRegistered;

	private Integer userStatus;

	private Integer userRight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass == null ? null : userPass.trim();
	}

	public String getUserNicename() {
		return userNicename;
	}

	public void setUserNicename(String userNicename) {
		this.userNicename = userNicename == null ? null : userNicename.trim();
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	public Date getUserRegistered() {
		return userRegistered;
	}

	public void setUserRegistered(Date userRegistered) {
		this.userRegistered = userRegistered;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserRight() {
		return userRight;
	}

	public void setUserRight(Integer userRight) {
		this.userRight = userRight;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", userPass=" + userPass + ", userNicename="
				+ userNicename + ", userEmail=" + userEmail + ", userRegistered=" + userRegistered + ", userStatus="
				+ userStatus + ", userRight=" + userRight + "]";
	}

}