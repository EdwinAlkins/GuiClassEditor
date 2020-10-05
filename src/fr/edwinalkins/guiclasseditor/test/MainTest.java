package fr.edwinalkins.guiclasseditor.test;

import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;
import fr.edwinalkins.guiclasseditor.core.editor.utils.DataExtractor;

public class MainTest {

	public static void main(String[] args) {
		ObjTest o = new ObjTest();
		try {
			System.out.println(o.toString());
			DataField[] data = DataExtractor.getField(o);
			data[0].setData(1);
			System.out.println(o.toString());
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
