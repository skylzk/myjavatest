package com.lzk;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyTest extends JFrame{
	public void creatjframe(String title ){
		/**
		 * SWING�������ӣ�������������ʹ��
		 * ����JFrame����
		 */
		JFrame test=new JFrame(title);
		Container cont=test.getContentPane();
		JLabel lab=new JLabel();
		lab.setHorizontalAlignment(SwingConstants.CENTER);
		cont.add(lab);
		cont.setBackground(Color.white);
		test.setLayout(new GridLayout(7,3,5,5)); //���ò��ַ�ʽ
		for(int  i=0;i<20;i++){
			cont.add(new JButton("button"+i+1));
			
		}
		test.setVisible(true);
		test.setBounds(0,0,500,300);
		test.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[]){
		/**
		 * ������
		 */
		new MyTest().creatjframe("�ҵĳ���");
	} 
}
