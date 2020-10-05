package fr.edwinalkins.guiclasseditor.core.editor.data;

import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;

public class DataObjectField extends DataField<Object> {

	public DataObjectField(String name, TypeDataField type, Object father, int index) {
		super(name, type, father, index);
	}

	@Override
	public AbstractPanelFieldEditor<Object> buildPanel() {
		// TODO Auto-generated method stub
		return null;
	}
}
