package fr.edwinalkins.guiclasseditor.test;

import java.awt.EventQueue;
import java.awt.Panel;
import java.util.Objects;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;
import fr.edwinalkins.guiclasseditor.core.editor.utils.DataExtractor;
import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;
import fr.edwinalkins.guiclasseditor.gui.panel.PanelFieldInteger;
import fr.edwinalkins.guiclasseditor.gui.panel.PanelFieldString;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class WindowTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					WindowTest window = new WindowTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ObjTest o = new ObjTest();
		Panel panel = new Panel();
		
		frame.getContentPane().add(panel , BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JButton btnTest = new JButton("test");
		horizontalBox.add(btnTest);
		btnTest.addActionListener(e -> {
			System.out.println(o.toString());
		});
		
		try {
			DataField[] data = DataExtractor.getField(o);
			for (DataField dataField : data) {
				Box hbox = Box.createHorizontalBox();
				verticalBox.add(hbox);
				AbstractPanelFieldEditor tmp = dataField.buildPanel();
				if(Objects.nonNull(tmp)) hbox.add(tmp);
			}
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

