package fr.edwinalkins.guiclasseditor.core.editor.data;

import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;
import fr.edwinalkins.guiclasseditor.gui.panel.PanelFieldString;

public class DataStringField extends DataField<String> {

	public DataStringField(String name, TypeDataField type, Object father, int index) {
		super(name, type, father, index);
	}

	@Override
	public AbstractPanelFieldEditor<String> buildPanel() {
		return new PanelFieldString(this);
	}
}
