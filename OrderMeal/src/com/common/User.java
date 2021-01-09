package com.common;

/**
 * 用户表
 * @author 李向阳
 *1.设置属性
 *2.定义构造方法
 *3.get,set方法
 */
public class User {
	//生成编号
	private int id;
	//用户名
	private String userName;
	//密码
	private String password;
	//邮箱
	private String email;
	//主键
	private int rank;

	//定义构造方法
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	//注册界面的构造方法
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	//登录界面的构造方法
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	//get,set方法
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
