package com.jquery.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	public WebDriver driver;
																																																																																																																																																																																					
	

	@BeforeMethod
	public void BeforeEachClass() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/browser/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test (priority=1, enabled = true)
	
	
		
	public void Interactions() {
		driver.get("http://jqueryui.com/");
		try {

			//draggable
		     
		     
			driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1) > ul > li:nth-child(1) > a")).click();
			driver.switchTo().frame(0);
			Actions action = new Actions(driver);
			WebElement DrugBox = driver.findElement(By.id("draggable"));
			action.dragAndDropBy(DrugBox, 200, 100).perform();
			driver.switchTo().defaultContent();
			System.out.println("helolo world");
		
			
		
			
			//Droppable//
			
		     driver.findElement(By.partialLinkText("Droppable")).click();
		     driver.switchTo().frame(0);
			Actions action1 = new Actions(driver);
			WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			action1.clickAndHold(drag).clickAndHold(drop).build().perform();
			driver.switchTo().defaultContent();
			
			//Thread.sleep(3 *1000);
			
			//Resizable//
			
		  driver.findElement(By.partialLinkText("Resizable")).click();
		  driver.switchTo().frame(0);
		  Actions action2= new Actions (driver);
		  WebElement resizableUp = driver.findElement (By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		  action2.clickAndHold(resizableUp).moveByOffset(90, 100).release().build().perform();
          driver.switchTo().defaultContent();
		
        
          //Selectable
          
		 driver.findElement(By.partialLinkText("Selectable")).click();
		 driver.switchTo().frame(0);
		 Actions action3= new Actions (driver);
		 WebElement item1= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));   
		 WebElement item7= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
		 action3.click(item1).click(item7).build().perform();
		 driver.switchTo().defaultContent();
			
          // Sortable
		  driver.findElement(By.partialLinkText("Sortable")).click();
		  driver.switchTo().frame(0);
		  Actions action4= new Actions (driver);
		 List<WebElement> arrayBox = driver.findElements(By.cssSelector("#sortable li"));
		  WebElement square0 = arrayBox.get(0);
	      WebElement square5 = arrayBox.get(5);
	      action4.click(square0).clickAndHold().moveToElement(square5).moveByOffset(1, 10).release().build().perform();
	      driver.switchTo().defaultContent();
		  
		 
		} catch (Exception e) {
		}}
			@Test (priority=0, enabled=true) 
			
	    public void Widget () {
	    driver.get("http://jqueryui.com/");
				 try {
					 
		//Accordion
					 
		driver.findElement(By.partialLinkText("Accordion")).click();
		
		driver.switchTo().frame(0);
		Actions action5= new Actions (driver);
	    WebElement accord = driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span"));
		accord.click();
		driver.switchTo().defaultContent();	
		
		
		//AutoComplete
		
		driver.findElement(By.partialLinkText("Autocomplete")).click();
		driver.switchTo().frame(0);
		Actions action6 = new Actions (driver);
		WebElement AutoC= driver.findElement (By.className("ui-autocomplete-input"));
		AutoC.sendKeys("b");
		List<WebElement> arrayBox2 = driver.findElements (By.className("ui-menu-item"));
		arrayBox2.get(1).click();	
		driver.switchTo().defaultContent();	
		
		
		//Button
		
		driver.findElement(By.partialLinkText("Button")).click();
		driver.switchTo().frame(0);
		Actions action7= new Actions (driver);
		 WebElement asubmitButton= driver.findElement(By.xpath("/html/body/div/input"));
	     asubmitButton.click();
		WebElement anAnchor= driver.findElement (By.xpath("/html/body/button"));
		anAnchor.click();
		Thread.sleep(2000);
        driver.switchTo().defaultContent();
        
        //CheckboxRadio 
        
        driver.findElement(By.partialLinkText("Checkboxradio")).click();
        driver.switchTo().frame(0);
        Actions action8= new Actions (driver);
        WebElement paris= driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]/span[1]"));
        paris.click();
        WebElement fiveStarts= driver.findElement (By.xpath("/html/body/div/fieldset[2]/label[4]/span[1]"));
        fiveStarts.click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        
        //Control group
        
       driver.findElement(By.partialLinkText("Controlgroup")).click();
       driver.switchTo().frame(0);
       Actions action10= new Actions (driver);
       WebElement carType = driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[1]"));
       carType.click();
       WebElement luxury= driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
       luxury.click();
       WebElement automatic= driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[2]"));
       automatic.click();
       WebElement insurance=driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[3]"));
       insurance.click();
       WebElement bookNow=driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/button"));
       bookNow.click();
       JavascriptExecutor j = (JavascriptExecutor)driver;
       j.executeScript("window.scrollBy(0,300 )", "");
        Thread.sleep(2000);
     driver.switchTo().defaultContent();
     
//     JavascriptExecutor jse = (JavascriptExecutor)driver;
//     jse.executeScript("window.scrollBy(100,700 )", "");
     
 	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("scroll(0," + 500 + ")");
     
      Thread.sleep(2000);
      
      Thread.sleep(2000);
      
       //DatePicker
      
      driver.findElement(By.partialLinkText("Datepicker")).click();
      JavascriptExecutor js0 = (JavascriptExecutor) driver;
  	  js0.executeScript("scroll(0," + 500 + ")");
      driver.switchTo().frame(0);
      Actions action11= new Actions (driver);
      WebElement pick = driver.findElement (By.cssSelector("#datepicker"));
      pick.click();
      driver.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(4) > a")).click();
      driver.switchTo().defaultContent();
      
      //Dialog
     driver.findElement(By.partialLinkText("Dialog")).click();
    
     driver.switchTo().frame(0);
     Actions action12=new Actions (driver);
     
     WebElement dialog = driver.findElement (By.cssSelector("span[class='ui-dialog-title']"));
        action12.dragAndDropBy(dialog, 300,100).build().perform();
    // action12.clickAndHold().click(dialog).build().perform();
     Thread.sleep(3*1000);
     
     driver.switchTo().defaultContent();
    
		
			/*
			 * driver.findElement(By.partialLinkText("Dialog")).click();
			 * driver.switchTo().frame(0);
			 * 
			 * Actions action = new Actions(driver); WebElement clickBox =
			 * driver.findElement(By.cssSelector("body > div")); WebElement clickbody =
			 * driver.findElement(By.cssSelector("body"));
			 * action.click(clickBox).dragAndDropBy(clickbody, 400, 300).build().perform();
			 * // should check driver.findElement(By.cssSelector(
			 * "body > div > div.ui-dialog-titlebar.ui-corner-all.ui-widget-header.ui-helper-clearfix.ui-draggable-handle > button"
			 * )).click(); driver.switchTo().defaultContent();
			 * 
			 */
		
		//Menu
     
     driver.findElement(By.partialLinkText("Menu")).click();
     driver.switchTo().frame(0);
     Actions action13=new Actions (driver);
     WebElement menu=driver.findElement(By.id("ui-id-4"));
     menu.click();
     WebElement carHifi= driver.findElement(By.cssSelector("#ui-id-6"));
     carHifi.click();
     driver.switchTo().defaultContent();
     
     
     //ProgressBar
     
     driver.findElement(By.partialLinkText("Progressbar")).click();
      driver.switchTo().frame(0);
      driver.switchTo().defaultContent();
      
      //Select Menu
      
      driver.findElement(By.partialLinkText("Selectmenu")).click();    
     driver.switchTo().frame(0);
     Actions action14=new Actions (driver);
     WebElement selectSpeed= driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[1]"));
     selectSpeed.click();
     WebElement fast= driver.findElement(By.cssSelector("#ui-id-4"));
     fast.click();
     WebElement selectFile= driver.findElement(By.cssSelector("#files-button > span.ui-selectmenu-icon.ui-icon.ui-icon-triangle-1-s"));
     selectFile.click();
     WebElement unknownFile= driver.findElement(By.cssSelector("#ui-id-8"));
     unknownFile.click();
     WebElement selectNumber= driver.findElement(By.cssSelector("#number-button > span.ui-selectmenu-icon.ui-icon.ui-icon-triangle-1-s"));
     selectNumber.click();
     WebElement five= driver.findElement(By.cssSelector("#ui-id-14"));
     five.click();
     WebElement selectTittle= driver.findElement(By.cssSelector("#salutation-button > span.ui-selectmenu-text"));
     selectTittle.click();
     WebElement mrs= driver.findElement(By.cssSelector("#ui-id-31"));
     mrs.click();
     driver.switchTo().defaultContent();
     
     //Slider
     
     driver.findElement(By.partialLinkText("Slider")).click();
     driver.switchTo().frame(0);
     Actions action15= new Actions (driver);
     WebElement smallCube= driver.findElement(By.cssSelector("#slider > span"));
     action15.click(smallCube).dragAndDropBy(smallCube, 400, 300).build().perform();
     driver.switchTo().defaultContent();
     
     //Spinner
     
     driver.findElement(By.partialLinkText("Spinner")).click();
     driver.switchTo().frame(0);
     Actions action16=new Actions (driver);
     for (int i = 0; i < 10; i++){
     WebElement selectValue = driver.findElement(By.xpath("/html/body/p[1]/span/a[1]/span[1]"));
     selectValue.click(); }
     
     WebElement toggleDisable= driver.findElement(By.cssSelector("#disable"));
     toggleDisable= driver.findElement(By.cssSelector("#disable"));
     toggleDisable.click();
     driver.switchTo().defaultContent();
     
     
     //Tabs
     
     driver.findElement(By.cssSelector("#sidebar > aside:nth-child(2) > ul > li:nth-child(13) > a")).click();
     driver.switchTo().frame(0);
     Actions action17=new Actions (driver);
     WebElement nuncT=driver.findElement(By.cssSelector("#ui-id-1"));
     nuncT.click();
     WebElement aenL= driver.findElement(By.cssSelector("#ui-id-3"));
     aenL.click ();
     driver.switchTo().defaultContent();
     
     // Tooltip
     
     driver.findElement (By.partialLinkText("Tooltip")).click();
     driver.switchTo().frame(0);
     WebElement age= driver.findElement(By.id("age"));
     age.sendKeys("21");
     driver.switchTo().defaultContent();
     
     
     
  
  
				} catch (Exception e) {		
				} 	 	 
		
				 
		}
@Test (priority=3, enabled=true)

			public void Effects() {
				driver.get("http://jqueryui.com/");
				try {	
			
	//Add class
					
   driver.findElement(By.partialLinkText("Add Class")).click();	
   driver.switchTo().frame(0);
   WebElement runEffect= driver.findElement(By.cssSelector("#button"));
   runEffect.click();
   driver.switchTo().defaultContent();
   
   
   //Color animation
   
   driver.findElement(By.partialLinkText("Color Animation")).click();
   driver.switchTo().frame(0);
   WebElement toggleEffect= driver.findElement(By.cssSelector("#button"));
   toggleEffect.click();				
   driver.switchTo().defaultContent();
					
					
  //Easing
	
	driver.findElement(By.partialLinkText("Easing")).click();
	driver.switchTo().frame(0);
	WebElement linear= driver.findElement(By.cssSelector("#graphs > div:nth-child(1) > div:nth-child(2) > canvas"));
	linear.click();
	WebElement swing=driver.findElement(By.cssSelector("#graphs > div:nth-child(2) > div:nth-child(2) > canvas"));
	swing.click();
	driver.switchTo().defaultContent();				
					
					
					
	//Effect
	
	driver.findElement(By.partialLinkText("Effect")).click();
	driver.switchTo().frame(0);
	WebElement effect=driver.findElement(By.id("effectTypes"));
	effect.click();
			/*
			 * WebElement highlight=driver.findElement(By.
			 * cssSelector("#effectTypes > option:nth-child(8)")); highlight.click();
			 * driver.switchTo().defaultContent();
			 */
	

				} catch (Exception e) {		
				} 	 	 
		
		}

    @AfterMethod
	public void AfterEachTest() {
		try {
			Thread.sleep(5 * 1000);
			driver.quit();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
