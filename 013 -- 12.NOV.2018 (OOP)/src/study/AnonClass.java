package study;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �ƹ��͵� ��µ��� �ʴ� ���� ����!
class AnonClass {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}

//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}