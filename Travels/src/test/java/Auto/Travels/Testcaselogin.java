package Auto.Travels;
import Auto.Travels.Homepage;
import Auto.Travels.Loginpage;
import org.testng.annotations.Test;
public class Testcaselogin {
	
		@Test
		public static void userLogin() throws Exception  {	

		Homepage h=new Homepage();
		h.Launch();
		h.login();
		
		Loginpage l=new Loginpage();
		
		l.loginEmail().sendKeys(h.prop.getProperty("email"));
		l.loginPass().sendKeys(h.prop.getProperty("password"));
		l.loginSubmit();
		}

}
