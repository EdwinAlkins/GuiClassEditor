package fr.edwinalkins.guiclasseditor.core.editor.data;

import java.lang.reflect.Field;
import java.util.Objects;

import fr.edwinalkins.guiclasseditor.gui.panel.AbstractPanelFieldEditor;

public abstract class DataField<T> {
	
	public final String name;
	public final TypeDataField type;
	private final Object father;
	private final int index;
	
	public DataField(String name, TypeDataField type, Object father, int index) {
		this.name = name;
		this.type = type;
		this.father = father;
		this.index = index;
	}
	
	public void setData(T data) throws IllegalArgumentException, IllegalAccessException {
		Field tmp = father.getClass().getDeclaredFields()[index];
		tmp.setAccessible(true);
		tmp.set(father, data);
	}
	
	public T getData() {
		Field tmp = father.getClass().getDeclaredFields()[index];
		tmp.setAccessible(true);
		try {
			return (T) tmp.get(father);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public abstract AbstractPanelFieldEditor<T> buildPanel();
	
	@Override
	public String toString() {
		Object data = getData();
		return new StringBuffer().append(type).append('|').append((Objects.isNull(data))?"null":data.toString()).toString();
	}
}
