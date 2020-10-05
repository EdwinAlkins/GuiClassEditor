package fr.edwinalkins.guiclasseditor.gui.panel;

import javax.swing.JPanel;

import fr.edwinalkins.guiclasseditor.core.editor.ObjectUpdate;
import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;

public abstract class AbstractPanelFieldEditor<T> extends JPanel implements ObjectUpdate<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8853306730775629279L;
	protected DataField<T> data;

	/**
	 * Create the panel.
	 */
	public AbstractPanelFieldEditor() {
		init();
	}
	
	public AbstractPanelFieldEditor(DataField<T> data) {
		this.data = data;
		init();
	}
	
	protected abstract void init();
}