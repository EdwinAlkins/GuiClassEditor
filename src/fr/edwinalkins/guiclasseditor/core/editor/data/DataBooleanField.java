package fr.edwinalkins.guiclasseditor.core.editor.data;

import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;

public class DataBooleanField extends DataField<Boolean> {

	public DataBooleanField(String name, TypeDataField type, Object father, int index) {
		super(name, type, father, index);
	}

	@Override
	public AbstractPanelFieldEditor<Boolean> buildPanel() {
		// TODO Auto-generated method stub
		return null;
	}
}
