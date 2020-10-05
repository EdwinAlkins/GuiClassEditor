package fr.edwinalkins.guiclasseditor.gui.panel;

import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelFieldString extends AbstractPanelFieldEditor<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1983589161131421340L;
	private JTextField stringField;

	/**
	 * Create the panel.
	 */
	public PanelFieldString() {
		super();
	}
	
	public PanelFieldString(DataField<String> data){
		super(data);
	}

	protected void init() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{125, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblLable = new JLabel("Lable :");
		GridBagConstraints gbc_lblLable = new GridBagConstraints();
		gbc_lblLable.anchor = GridBagConstraints.WEST;
		gbc_lblLable.insets = new Insets(0, 0, 0, 5);
		gbc_lblLable.gridx = 0;
		gbc_lblLable.gridy = 0;
		add(lblLable, gbc_lblLable);
		
		stringField = new JTextField(data.getData().toString());
		stringField.getDocument().addDocumentListener(new DocumentListener() {
			public void removeUpdate(DocumentEvent e) {
				warn();
			}
			public void insertUpdate(DocumentEvent e) {
				warn();
			}
			public void changedUpdate(DocumentEvent e) {
				warn();
			}
			private void warn() {
				try {
					data.setData(stringField.getText());
				} catch (IllegalArgumentException | IllegalAccessException e1) {
					e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_stringField = new GridBagConstraints();
		gbc_stringField.fill = GridBagConstraints.HORIZONTAL;
		gbc_stringField.gridx = 2;
		gbc_stringField.gridy = 0;
		add(stringField, gbc_stringField);
		stringField.setColumns(10);
	}
	
	@Override
	public void setup(String obj) {
		
	}

	@Override
	public void update(String obj) {
		
	}
}
