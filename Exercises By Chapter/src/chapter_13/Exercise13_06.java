package chapter_13;

/* �������� �����϶�.
 * 		>> th1�� 0���� 9������ ���ڸ� 1�ʿ� �ѹ��� ���� ���� ����Ѵ�.
 * 		>> main()������ th1.sleep�� ����ϳ� th1 ��� main �����尡 sleep�Ѵ�.
 * 		>> main�����忡�� �ǵ������� ���ܸ� �߻���Ű�� suspend�ȴ�.
 * 		>> main������� ���� ó���� ���� �ʾұ⿡ ������ �ʰ�, th1�� ���󾲷��������� ���ѹݺ��� �ƴϱ⿡ ����ȴ�. 
 */

class Exercise13_06 {
	public static void main(String[] args) throws Exception	{
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try {
			th1.sleep(5*1000);
		} catch(Exception e) {}
		
		throw new Exception("��~!!!");
	} // main() ��.
} // Ŭ���� ��.

class Thread4 extends Thread {
	public void run() {
		for(int i=0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	} // run() ��.
} // Thread4 Ŭ���� ��.