package com.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UITest {

	public static void main(String[] args) {
		// 창 생성
		JFrame f = new JFrame("UI TEST");
//		f.setLayout(new FlowLayout()); // f안에 내용물들을 어떤 방식으로 배치할 건지 지정, 붙이는 순서대로 화면에 나타남
		f.setLayout(new BorderLayout());// f안에 내용물들을 어떤 방식으로 배치할 건지 지정, 전체 화면을 동서남북중앙 5개 영역으로 나눠 관리함
		
		Font font = new Font("맑은 고딕",Font.BOLD,25);
		JLabel la = new JLabel("Cute Chat",JLabel.CENTER);// 문자열
		la.setFont(font);
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("CANCEL");
		JTextField tf = new JTextField(20); // 한줄 입력칸
		JTextArea ta = new JTextArea(10,20);
		ta.setEditable(false);
		JScrollPane pane = new JScrollPane(ta); // scrollpane 위로 textarea가 올라가게 된다.
		/*	
		f.add(tf);
		f.add(ok);
		f.add(cancel);
		f.add(pane);
		 */	
		f.add(tf,"South");
		f.add(la,"North");
//		f.add(cancel,"East");
		f.add(pane,"Center");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 눌렀을 때 동작 지정.
		f.setSize(400, 500); // 사이즈
		f.setVisible(true); // 실해시에 창이 눈에 보이도록 지정
		
		tf.requestFocus();
	}

}
