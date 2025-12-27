package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
// initialization
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement productslinkbtn;

//getter method
public WebElement getProductslinkbtn() 
{
return productslinkbtn;
}

public ProductsPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void clickProductsPagelink() {
productslinkbtn.click();
}
}
