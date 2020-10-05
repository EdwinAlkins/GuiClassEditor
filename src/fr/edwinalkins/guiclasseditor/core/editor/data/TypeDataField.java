package fr.edwinalkins.guiclasseditor.core.editor.data;

public enum TypeDataField{
		Data_Boolean,
		Data_Int,
		Data_Float,
		Data_Double,
		Data_String;
		
		private TypeDataField() {}
		
		public static TypeDataField getType(String type) {
			if(type.toLowerCase().contains("int")) return Data_Int;
			else if(type.toLowerCase().contains("float")) return Data_Float;
			else if(type.toLowerCase().contains("double")) return Data_Double;
			else if(type.toLowerCase().contains("boolean")) return Data_Boolean;
			else if(type.toLowerCase().contains("string")) return Data_String;
			return null;
		}
		public DataField getField(String name, Object father, int index) {
			if(this == Data_Boolean) return new DataBooleanField(name, this, father, index);
			else if(this == Data_Int) return new DataIntegerField(name, this, father, index);
			else if(this == Data_Float) return new DataFloatField(name, this, father, index);
			else if(this == Data_Double) return new DataFloatField(name, this, father, index);
			else if(this == Data_String) return new DataStringField(name, this, father, index);
			return null;
		}
	}