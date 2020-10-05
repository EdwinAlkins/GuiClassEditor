package fr.edwinalkins.guiclasseditor.gui.panel;

import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelFieldInteger extends AbstractPanelFieldEditor<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1983589161131421340L;
	private JTextField intField;

	/**
	 * Create the panel.
	 */
	public PanelFieldInteger() {
		super();
	}
	
	public PanelFieldInteger(DataField<Integer> data){
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
		
		intField = new JTextField();
		GridBagConstraints gbc_intField = new GridBagConstraints();
		gbc_intField.fill = GridBagConstraints.HORIZONTAL;
		gbc_intField.gridx = 2;
		gbc_intField.gridy = 0;
		add(intField, gbc_intField);
		intField.setColumns(10);
	}
	
	@Override
	public void setup(Integer obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer obj) {
		// TODO Auto-generated method stub
		
	}
}
