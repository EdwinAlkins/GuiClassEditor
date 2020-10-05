package fr.edwinalkins.guiclasseditor.test;

import fr.edwinalkins.guiclasseditor.core.editor.annotation.Range;

public class ObjTest {

	@Range(min = 0, max = 10)
	private int i = 10;
	private String str = "begin";
	
	@Override
	public String toString() {
		return "ObjTest [i=" + i + ", str=" + str + "]";
	}
}
