package Auto.Travels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Flight_Search extends LaunchBrowser{
	    By from_click= By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
		By from= By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
		By to_click= By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
		By to= By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
		By departure_date= By.xpath("//input[@id='departure']");
		By guests_click= By.xpath("//input[@name='totalManualPassenger']");
		By adults= By.xpath("//select[@id='madult']");
		By child= By.xpath("//select[@id='mchildren']");
		By infant= By.xpath("//select[@id='minfant']");
		By done= By.xpath("//button[@id='sumManualPassenger']");
		By one_way= By.xpath("//div[@class='tab-content shad RTL_shad search-form']//div[1]//div[1]//div[1]//ins[1]");
		By search= By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
		
		WebElement fromClick(){
			return driver.findElement(from_click);
		}
		
		WebElement from(){
			return driver.findElement(from);
		}
		
		WebElement toClick() {
			return driver.findElement(to_click);
		}
		
		WebElement to() {
			return driver.findElement(to);
		}
		
		WebElement departureDate() {
			return driver.findElement(departure_date);
		}
		
		WebElement guestClick() {
			return driver.findElement(guests_click);
		}
		
		WebElement adults() {
			return driver.findElement(adults);
		}
		
		WebElement child() {
			return driver.findElement(child);
		}
		
		WebElement infantb() {
			return driver.findElement(infant);
		}
		
		WebElement done() {
			return driver.findElement(done);
		}
		
		WebElement oneWay() {
			return driver.findElement(one_way);
		}
		
		WebElement searchButton() {
			return driver.findElement(search);
		}
	}


