package com.fdmgroup.collections.Q3;



	import java.awt.Color;
	import java.util.HashMap;
	import java.util.Map;

	public class HashMapColors {
		
		private Map<String, Color> colors;

		public HashMapColors() {
			this.colors = new HashMap<>();
			fillMap();
		}

		//HashMap<String, Color> colors = new HashMap<String, Color>(); 
	  

	    public void fillMap(){

	    	colors.put("BLACK", Color.BLACK);
	    	
	    	colors.put("MAGENTA", Color.MAGENTA);

	    	colors.put("YELLOW", Color.YELLOW);

	        colors.put("CYAN", Color.CYAN);      

	        colors.put("DARK_GRAY", Color.DARK_GRAY);  

	        colors.put("ORANGE", Color.ORANGE);

	        colors.put("GRAY", Color.GRAY);

	        colors.put("WHITE", Color.WHITE);

	        colors.put("BLUE", Color.BLUE);

	        colors.put("GREEN", Color.GREEN);

	        colors.put("RED", Color.RED);

	        colors.put("PINK", Color.PINK);

	        colors.put("LIGHT_GRAY",Color.LIGHT_GRAY);

	        colors.put("BLACK",Color.BLACK);

	    }

	    public Color getColor(String color) {
			if (color == null || !colors.containsKey(color.toUpperCase())) {
				return null;
			}
			return colors.get(color.toUpperCase());
		}

	  
}



