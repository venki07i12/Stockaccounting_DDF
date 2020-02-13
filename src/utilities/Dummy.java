package utilities;

public class Dummy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExcelFileutil exl = new ExcelFileutil();
		int totalRows = exl.rowCount("supplier");
		System.out.println("The Total rows are:" +totalRows);
		
		int totalCols = exl.colCount("supplier");
		System.out.println("The Total Column are:" +totalCols);
		
		String CellData = exl.getData("supplier", 3, 4);
		System.out.println("Cell Data is:" +CellData);
		
		exl.setData("supplier",2, 9, "fail");
	}

}
