import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.AbstractDocument;

@SuppressWarnings({ "serial", "unused" })
public class ReplaceGui extends JFrame{
	
	JLabel Interface;
	JLabel replaceAll;
	static JTextArea x;
	JScrollPane Scrollex;
	JLabel with;
	static JTextArea y;
	JScrollPane Scrolly;
	static JTextArea inp;
	JScrollPane scrollInp;
	static JButton createAndCopy;
	GridBagConstraints c;
	
	ReplaceGui(){
		
		c = new GridBagConstraints();
		c.gridy = 1;
		c.gridx = 1;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		c.weightx = 1;
		c.weighty = 1;
		
		
		
		Interface = new JLabel();
		Interface.setLayout(new GridBagLayout());
		Interface.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		

		
		
		replaceAll = new JLabel();
		replaceAll.setOpaque(true);
//		replaceAll.setForeground(Color.red);
		replaceAll.setBackground(Color.lightGray);
		replaceAll.setHorizontalAlignment(JLabel.CENTER);
		replaceAll.setFont(new Font("TimesRoman", Font.BOLD, 30));
		replaceAll.setText("Replace all:");
		
		
		c.weighty = 0.01;
		c.gridx = 1;
		c.weightx = 1;
		c.gridwidth = 3;

		
		Interface.add(replaceAll, c);
		
		
		
		x = new JTextArea();
		x.setBackground(Color.white);
		x.setFont(new Font("TimesRoman", Font.PLAIN, 25));
		x.setEditable(true);
		x.addKeyListener(new TheKeyListener());
		
		Scrollex = new JScrollPane(x);
		Scrollex.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		Scrollex.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		c.gridy ++;
		c.gridwidth = 1;
		c.gridx = 1;
		c.weighty = 0.03;
		
		Interface.add(Scrollex, c);
		
		
		
		
		with = new JLabel();
		with.setOpaque(true);
		with.setBackground(Color.lightGray);
		with.setFont(new Font("TimesRoman", Font.PLAIN, 25));
		with.setText("with");
		
		
		c.gridx = 2;
		c.gridwidth = 1;
		c.weightx = 0.0001;
		
	    Interface.add(with, c);
		
		
		y = new JTextArea();
		y.setBackground(Color.white);
		y.setFont(new Font("TimesRoman", Font.PLAIN, 25));
		y.setEditable(true);
		y.addKeyListener(new TheKeyListener());
		
		Scrolly = new JScrollPane(y);
		Scrolly.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		c.gridx = 3;
		c.gridwidth = 1;
		c.weightx = 1;
		
		Interface.add(Scrolly, c);
		
		
		
		inp = new JTextArea();
		inp.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		inp.setToolTipText("Input");
		inp.setEditable(true);
		inp.setLineWrap(true);
		inp.setWrapStyleWord(true);
		inp.addKeyListener(new TheKeyListener());
		inp.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {if(e.getClickCount() == 2){inp.selectAll();}}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}


		});

        scrollInp = new JScrollPane(inp);
		scrollInp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollInp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		c.weighty = 1;
		c.gridy ++;
		c.gridx = 1;
		c.gridwidth = 3;
		
		
		Interface.add(scrollInp, c);
		
		
		
		
		createAndCopy = new JButton();
		createAndCopy.setBackground(Color.lightGray);
		createAndCopy.setFont(new Font("TimesRoman", Font.BOLD, 19));
		createAndCopy.setFocusable(false);
		createAndCopy.setText("Create");
		
		c.gridy ++;
		c.weighty = 0.04;
		
		Interface.add(createAndCopy, c);
		
		createAndCopy.addActionListener(new TheActionListener());
		
		
		
		this.add(Interface);
		
		
		this.setTitle("Replacer");
	}
	

	public static void main(String[] args) {
		ReplaceGui Gui = new ReplaceGui();
		Gui.setSize(400, 600);
		Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gui.setVisible(true);

	}

}
