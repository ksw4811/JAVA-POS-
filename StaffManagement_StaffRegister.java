import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class StaffManagement_StaffRegister extends JFrame 
{
	JButton[] SBtn = new JButton[2];
	String[] Str = {"저장","뒤로가기"};
	int count =1;
	
	class MainScreen extends JPanel
	{
		MainScreen()
		{
			setLayout(new GridLayout(4,1));
			JPanel StaffNamePanel = new JPanel();
			JPanel StaffAgePanel = new JPanel();
			JPanel StaffTimePanel = new JPanel();
			JPanel StaffSexPanel = new JPanel();
			StaffNamePanel.add(new JLabel("이름"));
			StaffNamePanel.add(new JTextField(20));
			StaffAgePanel.add(new JLabel("나이"));
			StaffAgePanel.add(new JTextField(20));
			StaffSexPanel.add(new JLabel("성별"));
			StaffSexPanel.add(new JTextField(20));
			StaffTimePanel.add(new JLabel("시간대"));
			StaffTimePanel.add(new JTextField(20));
			
			add(StaffNamePanel);
			add(StaffAgePanel);
			add(StaffSexPanel);
			add(StaffTimePanel);
		}
	}
	
	
	class SelectButton extends JPanel
	{
		SelectButton(){
			setLayout(new GridLayout(1, 2));
			
			for(int i = 0; i < 2; i++) 
			{
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
			}
		}
	}
	
	public StaffManagement_StaffRegister()
	{
		setTitle("근무자 관리");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 안정적인 종료를 위함
		setResizable(false); // 정해진 사이즈에서 변경 X
		setBounds(400, 100, 1000, 600); // 프레임의 위치와 크기
		setVisible(true);
		MainScreen mbtn = new MainScreen();
		SelectButton sc = new SelectButton();

		// 입력창
		mbtn.setSize(700, 450);
		mbtn.setLocation(150, 20);
		add(mbtn);
		
		sc.setSize(400, 70);
		sc.setLocation(300, 480);
		add(sc);
		//저장
		SBtn[0].addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new POS_MainMenu();
			}
		});
		
			//뒤로가기
		SBtn[1].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new POS_StaffManagement();
			}
		});
	}
}