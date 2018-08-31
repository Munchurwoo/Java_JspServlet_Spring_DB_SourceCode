package step7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

import step4.IP;

public class ChattingGUIClient {

 private JFrame frame;
 private JTextArea textArea;
 private JPanel panel;
 private JTextField textField;
 private JButton button;
 // ����� ���� ���� ����
 private Socket socket;
 private PrintWriter pw;
 private BufferedReader br;

 public void closeAll() throws IOException {
  if (br != null)
   br.close();
  if (pw != null)
   pw.close();
  if (socket != null)
   socket.close();
 }

 public void startUI() {
  frame = new JFrame("chatting");
  frame.addWindowListener(new WindowAdapter() {
   @Override
   public void windowClosing(WindowEvent e) {
    pw.println("����");
    try {
     closeAll();
    } catch (IOException e1) {   
     e1.printStackTrace();     
    }
    System.exit(0);//�ý��� ����
   }
  });
  textArea = new JTextArea();
  textArea.setBackground(Color.YELLOW);
  frame.add(textArea, BorderLayout.CENTER);
  
  // ��ũ�ѹ� - ������Ʈ
    DefaultCaret caret = (DefaultCaret) textArea.getCaret();
    caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    JScrollPane sp = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
      JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    frame.add(sp, BorderLayout.CENTER);// ��ũ������ JTextArea ����
  
  
  // textField�� button �� ������ �� panel�� �� ��Ҹ� �߰��ϰ�
  // �� panel�� frame�� south ��ġ�� �߰��Ѵ�
  textField = new JTextField(25);
  textField.addKeyListener(new KeyHandler());
  button = new JButton("����");
  button.addActionListener(new ButtonHandler());
  
  panel = new JPanel();
  panel.add(textField);
  panel.add(button);
  frame.getContentPane().add(panel, BorderLayout.SOUTH);
  frame.setSize(400, 400);
  frame.setLocation(500, 200);
  frame.setVisible(true);
  // textField�� ��Ŀ���� �ش�
  textField.requestFocus();
 }

 public class ButtonHandler implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
   // textField �� getText() �� textArea�� setText() �� �̿���
   // �޼��� �Է� �� ���� ��ư ������ textArea�� ������ �߰�
   // �ǵ��� �����غ���
   sendMessage();
  }
 }

 public void sendMessage() {
  String message = textField.getText();
  pw.println(message);
  textField.setText("");
  textField.requestFocus();
 }

 public class KeyHandler extends KeyAdapter {
  @Override
  public void keyPressed(KeyEvent e) {
   // Enter key �� ������ �� �̺�Ʈ ó��
   if (e.getKeyCode() == KeyEvent.VK_ENTER) {
    sendMessage();
   }
  }
 }

 public void go() throws UnknownHostException, IOException {
  socket = new Socket(IP.INST, 5432);
  br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  pw = new PrintWriter(socket.getOutputStream(), true);
  Thread t = new Thread(new ReceiverWorker());
  t.setDaemon(true);
  startUI();
  t.start();
 }

 class ReceiverWorker implements Runnable {
  @Override
  public void run() {
   try {
    while (true) {
     String message = br.readLine();
     if(message==null)
      break;
     textArea.append(message+"\n");
    }
   } catch (IOException e) {    
    //e.printStackTrace();
    System.out.println("client ����");
   }//catch
  }//run
 }//ReceiverWorker

 public static void main(String[] args) {
  ChattingGUIClient client = new ChattingGUIClient();
  try {
   client.go();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}

