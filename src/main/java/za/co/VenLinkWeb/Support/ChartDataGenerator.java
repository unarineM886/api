package za.co.VenLinkWeb.Support;

import java.io.IOException;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ChartDataGenerator {	
	/*public ChartDataGenerator(String labelDataPoint){
		getChartData(labelDataPoint);	
	}*/
	
    public static String getChartData(String labelDataPoint, String title, String chartType){
        JSONObject chartData = new JSONObject();        
        // Labels for the X-axis
        JSONArray labels = new JSONArray();
        // Data points
        JSONArray dataPoints = new JSONArray();
        Random rand = new Random();
        // Color for each grapgh
        JSONArray colors = new JSONArray();
        JSONArray hoverColors = new JSONArray();
        new Print("labelDataPoint: "+labelDataPoint);
        String[] labelDataPointSplit=labelDataPoint.split(",");
        // 1. Add this list of professional colors at the top of your class
        /*String[] palette = {
        	    "54, 162, 235",  // 1. Blue
        	    "255, 99, 132",  // 2. Red/Pink
        	    "75, 192, 192",  // 3. Teal
        	    "255, 159, 64",  // 4. Orange
        	    "153, 102, 255", // 5. Purple
        	    "255, 205, 86",  // 6. Yellow
        	    "201, 203, 207", // 7. Grey
        	    "46, 204, 113",  // 8. Emerald Green
        	    "231, 76, 60",   // 9. Soft Red
        	    "52, 73, 94",    // 10. Wet Asphalt (Navy)
        	    "26, 188, 156",  // 11. Turquoise
        	    "241, 196, 15",  // 12. Sun Flower (Gold)
        	    "155, 89, 182",  // 13. Amethyst (Dark Purple)
        	    "230, 126, 34",  // 14. Carrot Orange
        	    "52, 152, 219",  // 15. Peter River (Sky Blue)
        	    "22, 160, 133",  // 16. Green Sea
        	    "243, 156, 18",  // 17. Orange Peel
        	    "142, 68, 173",  // 18. Wisteria (Plum)
        	    "127, 140, 141", // 19. Asbestos (Dark Grey)
        	    "39, 174, 96"    // 20. Nephritis (Deep Green)
        };*/
        String[] palette = {
        	    "0, 0, 255",      // 2. Pure Blue
        	    "255, 0, 0",      // 1. Pure Red
        	    "0, 255, 0",      // 3. Pure Green
        	    "255, 255, 0",    // 4. Pure Yellow
        	    "255, 0, 255",    // 5. Pure Magenta
        	    "0, 255, 255",    // 6. Pure Cyan
        	    "255, 128, 0",    // 7. Bright Orange
        	    "128, 0, 255",    // 8. Vivid Purple
        	    "0, 128, 0",      // 9. Forest Green (Darker Green)
        	    "128, 0, 0",      // 10. Maroon (Darker Red)
        	    "0, 0, 128",      // 11. Navy (Darker Blue)
        	    "255, 153, 204",  // 12. Hot Pink
        	    "153, 255, 51",   // 13. Neon Lime
        	    "0, 204, 204",    // 14. Darker Cyan
        	    "255, 102, 0",    // 15. Deep Orange
        	    "102, 0, 204",    // 16. Royal Purple
        	    "204, 255, 255",  // 17. Ice Blue (Very Light)
        	    "255, 204, 204",  // 18. Light Coral
        	    "102, 102, 102",  // 19. Solid Grey
        	    "0, 0, 0"         // 20. Pitch Black
       	};

        for(int i=0; i<labelDataPointSplit.length; i++) {
            // 2. Pick a color from the palette based on the current index (i)
            // The % operator ensures we never go "Out of Bounds"
            String rgb = palette[i % palette.length];
            
            String rgba = "rgba(" + rgb + ", 0.7)";
            colors.add(rgba);
            
            String hoverRgba = "rgba(" + rgb + ", 1.0)";
            hoverColors.add(hoverRgba);        	
            
            // 3. Keep your existing split/trim logic
            String[] labelDataSplit = labelDataPointSplit[i].split(":");
            labels.add(labelDataSplit[0].trim());
            dataPoints.add(labelDataSplit[1].trim());
        }
                
        //Dataset object
        JSONObject dataset = new JSONObject();
        dataset.put("title", title);
        dataset.put("data", dataPoints);
        dataset.put("backgroundColor", colors);
        dataset.put("borderColor", colors); // Optional: makes the slices pop
        
        // Then add it(hoverColors) to your dataset object
        dataset.put("hoverBackgroundColor", hoverColors);
        dataset.put("hoverBorderColor", "#000000"); // Optional: black border on hover
        dataset.put("hoverBorderWidth", 1);
        
        JSONArray datasets = new JSONArray();
        datasets.add(dataset);
        
        chartData.put("type", chartType); // Or "doughnut","pie", "bar", "line", etc.
        chartData.put("labels", labels);
        chartData.put("datasets", datasets);
        new Print("JSON_STRING: "+chartData.toJSONString());
        return chartData.toJSONString();
    }
    
    public static void main(String... aArgs) throws IOException{
		String graphRawData="1st:550, 15th:350, 22nd:200, 25th:285";
		new Print("JSON DATA: "+new ChartDataGenerator().getChartData(graphRawData, "Graph Test", "pie"));
	}
}
