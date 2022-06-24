package FileCompare;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CompareCSV {

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
		    String dataRow1 = CSVFile1.readLine(); 
		    while (dataRow1 != null)
		    {
		        String[] dataArray1 = dataRow1.split(",");
		        for (String item1:dataArray1)
		        { 
		           al1.add(item1);
		           System.out.println(al1);
		        }

		        dataRow1 = CSVFile1.readLine(); // Read next line of data.
		    }

		    
		     CSVFile1.close();

		    BufferedReader CSVFile2 = new BufferedReader(new FileReader(path+file2));
		    String dataRow2 = CSVFile2.readLine();
		    while (dataRow2 != null)
		    {
		        String[] dataArray2 = dataRow2.split(",");
		        for (String item2:dataArray2)
		        { 
		           al2.add(item2);

		        }
		        dataRow2 = CSVFile2.readLine(); // Read next line of data.
		    }
		     CSVFile2.close();
		     System.out.println("===================");
		     for(String bs:al2)
		     {
		         al1.remove(bs);
		        System.out.println(al1); 
		     }

		     int size=al1.size();
		     System.out.println(size);

		     try
		        {
		            FileWriter writer=new FileWriter(path+file3);
		           
		            	for(int i=0 ;i<size; i++) {
		              
		                writer.append(""+al1.get(i));
		                writer.append('\n');
		            }
		           
		            writer.flush();
		            writer.close();
		        }
		        catch(IOException e)
		        {
		            e.printStackTrace();
		        }
	}

}
