package FileCompare;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class FileCompare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileCompare f = new FileCompare();
		f.CompareRowAndCells();

	}
	
	 
	

	// THIS METHOD WILL COMPARE IF WHORKPSACE HAS EQUAL NUMBER OF ROWS AND CELLS

	// THIS METHOD WILL COMPARE IF WHORKPSACE HAS EQUAL NUMBER OF ROWS AND CELLS

	public void CompareRowAndCells() throws IOException

	{
		 XSSFCell c1;
		 XSSFCell c2;
		 
		 XSSFCellStyle style = new XSSFCellStyle(new StylesTable());
		    style.setFillForegroundColor(IndexedColors.RED.getIndex());
		    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);


		// int i=0,j=0;

		FileInputStream inputStream = new FileInputStream("E:\\data\\File1.xlsx");

		XSSFWorkbook wb1 = new XSSFWorkbook(inputStream);

		XSSFSheet sheet1 = wb1.getSheet("Sheet1");

		int RowCount1 = sheet1.getLastRowNum() - sheet1.getFirstRowNum();

		FileInputStream inputStream2 = new FileInputStream("E:\\data\\File2.xlsx");

		XSSFWorkbook wb2 = new XSSFWorkbook(inputStream2);

		XSSFSheet sheet2 = wb2.getSheet("Sheet1");

		int RowCount2 = sheet2.getLastRowNum() - sheet2.getFirstRowNum();

		// Compares if both excel have equal now of rows

		Assert.assertEquals(RowCount1, RowCount2, "Not sames");

		// compares if both excel file has same Row Number

		Iterator<Row> rowInSheet1 = sheet1.rowIterator();

		Iterator<Row> rowInSheet2 = sheet2.rowIterator();

		while (rowInSheet1.hasNext()) {

			int cellcounts1 = rowInSheet1.next().getPhysicalNumberOfCells();

			int cellcounts2 = rowInSheet2.next().getPhysicalNumberOfCells();

			Assert.assertEquals(cellcounts1, cellcounts2, "Not same");

			for (int i = 0; i < RowCount1; i++) {

				for (int j = 0; j < cellcounts1; j++) {

					 c1 = sheet1.getRow(i).getCell(j);

					 c2 = sheet2.getRow(i).getCell(j);

					int type1 = c1.getCellType();// 0-> Numeric 1->String 4->Boolean

					int type2 = c2.getCellType();
//					System.out.println(type1);
//					System.out.println(type2);
					if (type1 == type2)

					{

						if (type1 == 0)

						{

							if (c1.getNumericCellValue() != c2.getNumericCellValue())

							{
								System.out.println(
										c1.getNumericCellValue() + ", " + c2.getNumericCellValue() + " -->" + " Not Matches");
								
//								c1.setCellStyle(style);
//								c2.setCellStyle(style);
							}

							

						}

					}
				}
			
			}
			
		}
	}
}
