package com.mock;

import com.client.LogOnFrm;

/**
 * ����� main
 * 
 * @author ������
 * @Date 2020/1
 */
public class ServerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// LogOnFrm:�û���½���� ��������ȷ���˺�������� Jswing
				new LogOnFrm().setVisible(true);
			}
		});
	}

}
