package com.object;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ObjectTest {

	public static void main(String[] args) {
		Frame f = new Frame("frame test");
		f.setLayout(new FlowLayout());
		Button b = new Button("OK");
		Button c = new Button("CANCLE");
		Checkbox cb = new Checkbox("spring",true);
		Checkbox cb2 = new Checkbox("summer");
//		b.setSize(150,150);
		f.add(b);// 창에 버튼을 붙힘
		f.add(c);
		f.add(cb);
		f.add(cb2);
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
