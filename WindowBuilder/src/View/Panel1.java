package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;

public class Panel1 extends JPanel {
	
	private JButton btnNewButton_1;

	public Panel1() {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton_1 = new JButton("Browse");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyFrame.setMode(3);
			}
		});
		GroupLayout gl_panel1 = new GroupLayout(this);
		gl_panel1.setHorizontalGroup(
			gl_panel1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addContainerGap(259, Short.MAX_VALUE)
					.addGroup(gl_panel1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(23))
		);
		gl_panel1.setVerticalGroup(
			gl_panel1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		setLayout(gl_panel1);
	}

}
