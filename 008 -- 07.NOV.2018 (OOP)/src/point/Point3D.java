package point;

public class Point3D extends Point {
	int z;
	
	Point3D() {
		this(1,1,1);
	}

	Point3D(int x, int y, int z) {
		super(x,y); // ���⼭ �ٽ� x, y ���� �ڵ带 �ۼ��ϴ� ��� parent�� ����� x, y ������ parent �����ڿ��� �ñ��.
		this.z = z;
	}
	
	// System.out.println(p3.equals(p4)); --> true ���;� �Ѵ�.
	// Object�κ��� ��ӹ޾� Point���� �������̵� �� equals�� ���⼭ �ٽ� �������̵� �ϼ���.
	public boolean equals(Object obj) {
		// �� ���� x, y�� ���ؼ� ������ true.
		// �ƴϸ� false�� ��ȯ�Ͻÿ�.
		if (obj instanceof Point3D) {
			Point3D point = (Point3D) obj; // parent Ÿ�Կ��� child�� child Ÿ�� ���������� �ܹ��� ����ȯ
			if (this.x == point.x && this.y == point.y && this.z == point.z) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + ", z : " + z;
	}
}
