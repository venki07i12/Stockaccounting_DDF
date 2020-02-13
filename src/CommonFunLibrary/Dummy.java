package CommonFunLibrary;

public class Dummy {

	public static void main(String[] args) throws Exception {
		ERP_Functions erp = new ERP_Functions();
		erp.launchApp("http://webapp.qedge.com/login.php");
		erp.login("admin", "master");
		erp.supplier("venkatesh", "Hyderabad", "Hyderabad", "India", "venkatesh", "9553440104", "venki07i12@gmail.com", "768367843875", "welcome");

	}

}
