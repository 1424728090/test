package com.common;

/**
 * �û���
 * @author ������
 *1.��������
 *2.���幹�췽��
 *3.get,set����
 */
public class User {
	//���ɱ��
	private int id;
	//�û���
	private String userName;
	//����
	private String password;
	//����
	private String email;
	//����
	private int rank;

	//���幹�췽��
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	//ע�����Ĺ��췽��
	public User(String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	//��¼����Ĺ��췽��
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	//get,set����
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
