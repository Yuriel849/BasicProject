package AWT;

import java.awt.*;

//GridLayout�� ��ư�� ũ�Ⱑ �����ϴ�

class Ex13_GridLayoutTest {
	public static void main(String args[]) {
		Frame f = new Frame("GridLayoutTest");
		f.setSize(150, 150);
		f.setLayout(new GridLayout(3, 2)); // 3�� 2���� ���̺��� �����.
		f.add(new Button("1")); 		   // �߰��Ǵ� ������� Button�� ��ȣ�� �ٿ���.
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setVisible(true);
	} // main() ��.
} // Ŭ���� ��.