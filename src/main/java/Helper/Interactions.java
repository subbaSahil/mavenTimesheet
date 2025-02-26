package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Interactions {
    private WebDriverWait wait;
    private Actions actions;
    private WebDriver driver;
    public Interactions(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
        this.driver = driver;
    }
    
    //normal click on a particular element
    public void click(By element) {
    	try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.click();
        } catch (Exception e) {
            System.out.println("Error while clicking in the element: " + element + " - " + e.getMessage());
        }
    }
    
    public void clickThreeTimes(By element) {
        int retryCount = 3; // Number of retries
        int attempts = 0;
        boolean clicked = false;

        while (attempts < retryCount && !clicked) {
            try {
                WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
                clickableElement.click();
                clicked = true; // Successfully clicked
                System.out.println("Element clicked successfully: " + element);
            } catch (Exception e) {
                attempts++;
                System.out.println("Attempt " + attempts + " to click on " + element + " failed: " + e.getMessage());
                if (attempts == retryCount) {
                    System.out.println("Failed to click on the element after " + retryCount + " attempts.");
                }
            }
        }
    }
    
    public void clickElement(Object target) {
		WebElement element;
		if (target instanceof By) {
			element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
		} else if (target instanceof WebElement) {
			element = (WebElement) target;
		} else {
			throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
		}
		elementClick(element);
	}
    public void elementClick(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Failed to click the element. Error: " + e.getMessage());
		}
	}
    
    public void mouseClick(By element) {
    	WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(element));
    	actions.moveToElement(elementToClick).perform();
//    	WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(element));
    	actions.click(elementToClick).perform();
    }
    
    //
    public void javascriptClick(By element) {
    	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
    	actions.moveToElement(ele).click().perform();
    	
    }
    
    public void enterTextAndPressEnter(By element, String text) {
    	try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.click();
            inputField.clear();
            inputField.sendKeys(text);
            inputField.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println("Error while entering text in the element: " + element + " - " + e.getMessage());
        }
    }
    
    public void sendingKeys(By locator, String keyValue) {
		WebElement element = visibilityEle(locator);
		element.clear();
		element.sendKeys(keyValue);
	}
    //overide the existing text
    public void enterText(By element, String text) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(element));

            // Scroll into view to ensure the element is in the viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);

            // Click the input field if necessary
            if (!inputField.isDisplayed()) {
                System.out.println("Element not displayed, attempting JavaScript click...");
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputField);
            } else {
                inputField.click();
            }

            inputField.clear();  // Clear existing text before entering new text
            inputField.sendKeys(text);

            System.out.println("Text entered successfully");
        } catch (Exception e) {
            System.err.println("Error while entering text in the element: " + element + " - " + e.getMessage());
        }
    }

    public void enterNumber(By element, int number) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.click();
            inputField.clear();
            inputField.sendKeys(String.valueOf(number));
        } catch (Exception e) {
            System.out.println("Error while entering text in the element: " + element + " - " + e.getMessage());
        }
    }
    
    public void enterDecimalNumber(By element, double number) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.click();
            inputField.clear();
            inputField.sendKeys(String.valueOf(number));
        } catch (Exception e) {
            System.out.println("Error while entering text in the element: " + element + " - " + e.getMessage());
        }
    }
    

    
    public void sendKeysInt(By locator, int number) {
		WebElement element = visibilityEle(locator);
		element.clear();
		element.sendKeys(String.valueOf(number));
		element.sendKeys(Keys.ENTER);
	}
    //clear and input field and enter new text
    public void clearTextAndEnterText(By element, String newText) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            inputField.clear();
            inputField.sendKeys(newText);
        } catch (Exception e) {
            System.out.println("Error while clearing and entering text in the element: " + element + " - " + e.getMessage());
        }
    }
    
    //to get text of a particular element
    public String getText(By element) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return inputField.getText();
        } catch (Exception e) {
            System.out.println("Error while retrieving text from the element: " + element + " - " + e.getMessage());
            return null; // Returning null in case of an error
        }
    }
    
    
    
    //to scroll to a particular element for the current page
    public void scroll(By element) {
    	 try {
             JavascriptExecutor js = (JavascriptExecutor) driver;
             WebElement elementToReach = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
             js.executeScript("arguments[0].scrollIntoView(true);", elementToReach);
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
    
    
    // to get the url for t he current page
    public  void isCurrentUrlCorrect(String expectedUrl) {
        try {
        	Thread.sleep(5);
            String currentUrl = driver.getCurrentUrl(); 
            System.out.println("Current URL: " + currentUrl);

            if (!currentUrl.equals(expectedUrl)) {
                System.out.println("URL mismatch! Redirecting to the base URL: " + expectedUrl);
                driver.navigate().to(expectedUrl); 
                Thread.sleep(10);
               
            }

        } catch (Exception e) {
            System.out.println("Error while retrieving, comparing, or redirecting URLs: " + e.getMessage());
            e.printStackTrace();
    
        }
    }


    
    //check the visibility of an element
    public Boolean elementVisibility(By element) {
        try {
            List<WebElement> elements = driver.findElements(element); // Avoids 40s delay
            if (!elements.isEmpty() && elements.get(0).isDisplayed()) {
                System.out.println("Element is visible: " + element);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error checking visibility: " + e.getMessage());
        }
        System.out.println("Element is NOT visible: " + element);
        return false;
    }


    
    //to click on a particular element on a list
    public void selectFromDropdown(By element, String clientName) {
        try {
            WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(element));

            List<WebElement> options = dropdown.findElements(By.tagName("li"));

            for (WebElement option : options) {
                String text = option.findElement(By.className("itemTemplateLabel_dqr75c")).getText();
                if (text.equals(clientName)) {
                    option.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error while selecting from dropdown: " + element + " - " + e.getMessage());
        }
    }
    
    public void selectYearDiv(String desiredYear) {
    	WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
    		    By.xpath("//div[@role='option' and text()='" + desiredYear + "']")));
    		yearElement.click();
    }
    
    
    //enter multiple inputs on multiple  element of same type
    public void multipleInputs(By locator, String text) {
        // Wait until all matching elements are visible
        List<WebElement> textareas = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

        for (WebElement textarea : textareas) {
            textarea.clear(); // Optional: Clear existing text
            textarea.sendKeys(text);
        }
    }
public void verifyText(By element, String expectedText) {
   	 
        
        for (int attempts = 0; attempts < 3; attempts++) {
       	    try {
       	    	
       	    	WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      	         	String acutalText = inputField.getText();
      	         	System.out.println("Actual Text: " + acutalText);
      	         	Assert.assertEquals(acutalText, expectedText, "Text in did not match expected value.");

       	        // Break the loop if no exception is thrown
       	        break;
       	    } catch (StaleElementReferenceException e) {
       	        // Retry locating and interacting with the element
       	        System.out.println("StaleElementReferenceException encountered. Retrying...");
       	    }
       	}
   }

public void executeWithDelay(Runnable action) {
	try {
		Thread.sleep(500);
		action.run();
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt(); // Restore the interrupted status
		System.out.println("Thread was interrupted: " + e.getMessage());
	}
}

public String getInnerText(By locator) {
	String tabTitle = driver.findElement(locator).getText();
	return tabTitle;
}
public WebElement visibilityEle(By locator) {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
	

	public int getNumberofElements(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		int count = elements.size();
//		System.out.println("Number of matching elements: " + count);
		return count;
	}
	
	public String getOldTaskHours(int index) {
	    String locator = "(//input[@appmagic-control='TextInput2_1textbox'])[" + index + "]";
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	    return element.getAttribute("value");
	}

}
