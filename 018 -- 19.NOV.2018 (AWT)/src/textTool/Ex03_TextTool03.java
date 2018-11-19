package textTool;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 

// INCOMPLETE!

// TextArea ������ �߿��� tfParam1�� �Էµ� ���� �Ǵ� ���ڵ��� �����ϴ� ����� '���ڻ���'��ư�� �ϼ��϶�.

class Ex03_TextTool03 extends Frame implements WindowListener { 
	TextArea ta;
    TextField tfParam1, tfParam2;
    Panel pNorth, pSouth;
    Label lb1, lb2;

    // btnName[0] --> Undo ���
    // btnName[1] --> ¦���� �����ϴ� ���
    // btnName[2] --> ���� �����ϴ� ���
    // 	>> �����ڿ��� btnName�� �����͸� btn���� �ű��.
    String[] btnName = {
    		"Undo",         // �۾����� ���·� �ǵ���
            "¦���ٻ���", // ¦������ �����ϴ� ���
            "���ڻ���",    // param1�� ������ ���ڵ��� �����ϴ� ���
	};

    Button[] btn = new Button[btnName.length];

    private final String CR_LF = System.getProperty("line.separator"); // ���๮��(�ٹٲ޹���)

    private String prevText = "";

    private void registerEventHandler() {
    	addWindowListener(this);

        int n = 0; // ��ư����

        btn[n++].addActionListener(new ActionListener() { // Undo - �۾����� ���·� �ǵ���
        	public void actionPerformed(ActionEvent ae) {
        		String curText = ta.getText();

        		if(!prevText.equals("")) {
        			ta.setText(prevText);
        		}

                prevText = curText;

                // �̹� "¦���� ����" ����� ���� prevText�� ����� ���ڿ���  ���๮�ڱ��� �����Ͽ� �ϼ��Ǿ� �ִ� ����! ���� �Ʒ��� ���� �ٽ� ó���� �ʿ䰡 ����!
//    			String curText = ta.getText();
//    			StringBuffer sb = new StringBuffer(prevText.length());
//
//    			Scanner scan = new Scanner(prevText);
//    		
//    			for(int i = 0; scan.hasNextLine(); i++) {
//    				String line = scan.nextLine();
//    				sb.append(line + CR_LF);
//    			}
//    			ta.setText(sb.toString());
//    			prevText = curText;
        	}
        	
        });

        btn[n++].addActionListener(new ActionListener() { // ¦���ٻ��� - ¦������ �����ϴ� ���
        	public void actionPerformed(ActionEvent ae) {
        		String curText = ta.getText();
                StringBuffer sb = new StringBuffer(curText.length());

                prevText = curText;

                Scanner scan = new Scanner(curText);

                for(int i = 0; scan.hasNextLine(); i++) {
                	String line = scan.nextLine();

                    if(i%2==0) {
                    	sb.append(line).append(CR_LF);
                    }
                }

                ta.setText(sb.toString());
        	}
        });

        btn[n++].addActionListener(new ActionListener() { // ���ڻ��� - Param1�� ������ ���ڸ� �����ϴ� ���
        	public void actionPerformed(ActionEvent ae) {
        		String curText = ta.getText();
        		StringBuffer sb = new StringBuffer(curText.length());
        		
        		prevText = curText;
        		
        		// 1. TextField tfParam1�� ���� �����´�.(getText()���)
        		String para = tfParam1.getText();
        		
        		// 2. �ݺ����� �̿��ؼ� curText�� �ѱ��ھ� �о Param1���� ������ ���ڿ��� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
        		boolean flag = false;
        		for(int i = 0; i < curText.length(); i++) {
        			for(int j = 0; j < para.length(); j++) {
        				// 2.1 ���� ���ԵǾ� ���� ������ sb�� �����ϰ� ���ԵǾ� ������ sb�� �������� �ʴ´�.
        				if(curText.charAt(i) == para.charAt(j)) {
        					flag = true;
        				};
        			}
        			if(!flag) {
        				sb.append(curText.charAt(i));
        				System.out.println("appending");
        			}
        		}

        		// 3. �۾��� ���� �Ŀ� sb�� ��� ������ ta�� �����ش�.(setText()���)
        		ta.setText(sb.toString());
        	}
        });
	} // registerEventHandler() ��.

    // main()!!
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	Ex03_TextTool03 win = new Ex03_TextTool03("Text Tool");
        win.show();
	} // main() ��.

    // ������!!
    public Ex03_TextTool03(String title) {
    	super(title);
        lb1 = new Label("param1:", Label.RIGHT);
        lb2 = new Label("param2:", Label.RIGHT);
        tfParam1 = new TextField(15);
        tfParam2 = new TextField(15);

        ta = new TextArea();
        pNorth = new Panel();
        pSouth = new Panel();

        for(int i=0;i < btn.length;i++) {
        	btn[i] = new Button(btnName[i]);
        }

        pNorth.setLayout(new FlowLayout());
        pNorth.add(lb1);
        pNorth.add(tfParam1);
        pNorth.add(lb2);
        pNorth.add(tfParam2);

        pSouth.setLayout(new GridLayout(2,10));

        for(int i=0; i < btn.length;i++) {             // ��ư�迭�� �ϴ� Panel�� �ִ´�.
        	pSouth.add(btn[i]);
        }

        add(pNorth,"North");
        add(ta,"Center");
        add(pSouth,"South");

        setBounds(100, 100, 600, 300);
        ta.requestFocus();
        registerEventHandler();
        setVisible(true);
    } // ������ public TextToolEx1(String title) ��.

	// WindowsListener�� �߻�޼���� ����
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
    	e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
	}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
} // Ŭ���� ��.