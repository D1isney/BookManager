package com.model;

/**
 * 用户实体
 * @author 1
 *
 */
public class User {
	private int id;// 编号
	private String userName;// 用户名
	private String passWord;// 用户密码
	
	
	public User() {
		super();
	}
	
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
