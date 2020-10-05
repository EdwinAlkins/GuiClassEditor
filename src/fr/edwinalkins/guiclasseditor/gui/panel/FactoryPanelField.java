package fr.edwinalkins.guiclasseditor.gui.panel;

import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;

public class FactoryPanelField {

	public static PanelFieldString buildFieldString(DataField<String> data) {
		return new PanelFieldString(data);
	}
	
	public static PanelFieldInteger buildFieldInteger(DataField<Integer> data) {
		return new PanelFieldInteger(data);
	}
}
