package com.mock;

import com.client.LogOnFrm;

/**
 * 主入口 main
 * 
 * @author 李向阳
 * @Date 2020/1
 */
public class ServerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// LogOnFrm:用户登陆窗口 需输入正确的账号密码进入 Jswing
				new LogOnFrm().setVisible(true);
			}
		});
	}

}
