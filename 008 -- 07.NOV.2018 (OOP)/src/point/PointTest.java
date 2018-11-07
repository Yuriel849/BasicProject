package point;

public class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point(); // (x,y) == (1,1)
		Point p2 = new Point(3, 5);
		System.out.println(p1); // Q1-3 ����
		System.out.println(p2.toString());
		/* println(��ü��) == println(��ü.toString())
		 * 	>> toString ����ص� �Ȱ��� ������ ���� println�� ���
		 * 	>> println�� signature --> println(Object o) --> ������!!!
		 * 		>> �ְ��� parent�� Object Ÿ�� ���������� ���� �� toString �Լ��� ���ڿ��� ���� �� ����ϴ� ��
		 */
		
		double d = Point.getDistance(p1, p2);
		double d2 = p2.getDistance(p2);
		System.out.println("�� p1 & p2 �� �Ÿ� : " + d); // Q1-7 ����
		System.out.println("�� p2 & p2 �� �Ÿ� : " + d2); // Q1-6 ����
		/* static �޼���� �׻� Ŭ���������� ȣ�� (��ü�� ������� �� ��)
		 * 	>> ������ ������ ������, ���� �ʴ�
		 */
		
		p1 = new Point(1,2);
		p2 = new Point(1,2);
		System.out.println(p1.equals(p2));
		
		Point3D p3 = new Point3D(1,2,5);
		Point3D p4 = new Point3D(1,2,5);
		System.out.println(p3); // Q1-11 ����
		System.out.println(p3.equals(p4));
		
		Point4D p5 = new Point4D(1,2,5,8);
		Point4D p6 = new Point4D(1,2,5,8);
		System.out.println(p5); // Q1-11 ����
		System.out.println(p5.equals(p6));
	}

}
