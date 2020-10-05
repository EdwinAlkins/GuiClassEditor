package fr.edwinalkins.guiclasseditor.core.editor;
public interface ObjectUpdate<T>{
	public void setup(T obj);
	public void update(T obj);
}