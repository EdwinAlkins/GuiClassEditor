package fr.edwinalkins.guiclasseditor.core.editor.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;

import fr.edwinalkins.guiclasseditor.core.editor.annotation.Range;
import fr.edwinalkins.guiclasseditor.core.editor.data.DataField;
import fr.edwinalkins.guiclasseditor.core.editor.data.DataObjectField;
import fr.edwinalkins.guiclasseditor.core.editor.data.TypeDataField;
import jdk.jfr.Description;

public final class DataExtractor {

	public static DataField[] getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Field[] fld = obj.getClass().getDeclaredFields();  // for axis the fields  
		ArrayList<DataField> datas = new ArrayList<DataField>();
		
        // Loop for get all the Field in class
        for (int index = 0; index < fld.length; index++) {
        	fld[index].setAccessible(true);
        	//System.out.println(((Range) fld[index].getAnnotations()[0]).min());
        	datas.add(TypeDataField.getType(fld[index].getType().getSimpleName()).getField(fld[index].getName(), obj, index));
		}
        return datas.toArray(new DataField[datas.size()]);
	}
}
