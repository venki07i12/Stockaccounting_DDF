package utilities;

import CommonFunLibrary.ERP_Functions;

public class Driverscript {

	public static void main(String[] args) throws Exception {
		ExcelFileutil exl=new ExcelFileutil();
        int rows=exl.rowCount("supplier");
        ERP_Functions erp=new ERP_Functions();
        for(int i=1;i<=rows;i++){
        	String sname=exl.getData("supplier", i, 0);
        	String address=exl.getData("supplier", i, 1);
        	String city=exl.getData("supplier", i, 2);
        	String country=exl.getData("supplier", i, 3);
        	String cperson=exl.getData("supplier", i, 4);
        	String pnumber=exl.getData("supplier", i, 5);
        	String mail=exl.getData("supplier", i, 6);
        	String mnumber=exl.getData("supplier", i, 7);
        	String note=exl.getData("supplier", i, 8);
        	
        	erp.launchApp("http://webapp.qedge.com/login.php");
        	erp.login("admin", "master");
        	String result=erp.supplier(sname,address,city,country,cperson,pnumber,mail,mnumber,note);
        	exl.setData("supplier", i, 9, result);
        	erp.closebrw();
        	
        	
        }
	}

}
