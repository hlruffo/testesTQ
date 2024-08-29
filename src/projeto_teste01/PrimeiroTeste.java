package projeto_teste01;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimeiroTeste {

	@Test
	public void test() {
		//Abrindo o navegador e instanciando o ChromeDriver
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Hugo");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ruffo");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Avenida Rio Branco, 125");
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("email@email.com");
		
		//clicando no genero
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		
		//clicando em checkbox hobbies
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		
		// Selecionando "AutoCAD" no dropdown
		WebElement menuDrop = driver.findElement(By.id("Skills"));
		Select dropdown = new Select(menuDrop);
		dropdown.selectByVisibleText("AutoCAD");
		
		
		//subindo foto
		WebElement uploadElement = driver.findElement(By.id("imagesrc"));
		uploadElement.sendKeys("C:\\Users\\hlruf\\Downloads\\hlr.png");
		//driver.quit();
	}
}	
		
		
