package com.mock;

import com.client.LogOnFrm;

public class LoginMockServer {
	/**
	 * 测试登陆功能
	 * 
	 * @author 李向阳
	 * @Remarks 通过调用登陆 jFrame窗口，进行功能测试
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LogOnFrm().setVisible(true);
			}
		});
	}
}
