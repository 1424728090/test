package com.mock;

import com.client.LogOnFrm;

public class LoginMockServer {
	/**
	 * ���Ե�½����
	 * 
	 * @author ������
	 * @Remarks ͨ�����õ�½ jFrame���ڣ����й��ܲ���
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LogOnFrm().setVisible(true);
			}
		});
	}
}
