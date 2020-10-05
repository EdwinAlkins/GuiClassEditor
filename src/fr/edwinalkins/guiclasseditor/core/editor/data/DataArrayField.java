package fr.edwinalkins.guiclasseditor.core.editor.data;

import fr.edwinalkins.guiclasseditor.core.editor.data.exception.IsNotArray;
import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;

public class DataArrayField<T> extends DataField<T> {

	public DataArrayField(String name, TypeDataField type, Object father, int index) {
		super(name, type, father, index);
	}

	@SuppressWarnings("unchecked")
	public Object[] getDataArray() throws IsNotArray{
		Object data = getData();
		if(data.getClass().isArray()) return (T[]) data;
		else throw new IsNotArray();
		
	}

	@Override
	public AbstractPanelFieldEditor<T> buildPanel() {
		// TODO Auto-generated method stub
		return null;
	}
}
