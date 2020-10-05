package fr.edwinalkins.guiclasseditor.core.editor.data;

import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;
import fr.edwinalkins.guiclasseditor.gui.panel.PanelFieldInteger;

public class DataIntegerField extends DataField<Integer> {

	public DataIntegerField(String name, TypeDataField type, Object father, int index) {
		super(name, type, father, index);
	}

	@Override
	public AbstractPanelFieldEditor<Integer> buildPanel() {
		return new PanelFieldInteger(this);
	}
}
