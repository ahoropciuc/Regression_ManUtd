package Utils;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class GenericMethods {

	public void testSrc(WebDriver driver1) throws ClientProtocolException, IOException {

		List<WebElement> imagesList = driver1.findElements(By.tagName("img"));
		for (WebElement image : imagesList) {
			HttpResponse response = new DefaultHttpClient()
					.execute(new HttpGet(image.getAttribute("src")));
			if (response.getStatusLine().getStatusCode() != 200) {

				driver1.quit();
			}

		}
	}

	public void verifyElementPresent(WebDriver driver1, By actual) {
		WebElement element = driver1.findElement(actual);
		assertNotNull(element);
	}

	public void verifyElementDisplayed(WebDriver driver1, By selElement) {
		WebElement x = driver1.findElement(selElement);
		assertTrue(x.isDisplayed());
	}

}