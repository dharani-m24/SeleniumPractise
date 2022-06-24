package FileCompare;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CompareCSV2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\dhara\\Desktop\\Automation Testing Training\\Data\\";
	    String file1="File.csv";
	    String file2="File2.csv";
	    String file3="File3.csv";
		
		ArrayList<String> al1=new ArrayList<String>();
	    ArrayList<String> al2=new ArrayList<String>();
	    //ArrayList al3=new ArrayList();

	    BufferedReader CSVFile1 = new BufferedReader(new FileReader(path+file1));
	    BufferedReader CSVFile2 = new BufferedReader(new FileReader(path+file2));
	    String dataRow1 = CSVFile1.readLine();
	    String dataRow2 = CSVFile2.readLine();
	    System.out.println(dataRow1);
	    FileWriter writer=new FileWriter(path+file3);
	    while(dataRow1!=null && dataRow2!=null) {
	        String[] dataArray1 = dataRow1.split(",");
	        for (String item1:dataArray1)
	        { 
	           al1.add(item1);
	        } // Read next line of data.
	        
	        String[] dataArray2 = dataRow2.split(",");
	        for (String item2:dataArray2)
	        { 
	           al2.add(item2);

	        } // Read next line of data.
	    
	  
	     for(int i=0;i<al1.size();i++) {
	    	// System.out.println(al1);
	    	 if(al1.get(i).equals(al2.get(i))) {
 	                writer.append("same,");
 	                
 	            
 	            
	    	 }
	    	 else {
	    		 writer.append(""+al1.get(i)+"_"+al2.get(i)+",");
	              
	            
	           
	    	 }
	     }
	    dataRow1 = CSVFile1.readLine();
 	    dataRow2 = CSVFile2.readLine();
 	    al1.clear();
 	    al2.clear();
 	    
 	    writer.append("\n");
	    }
	     writer.flush();
          writer.close();
          CSVFile1.close();
          CSVFile2.close();

	}

}
