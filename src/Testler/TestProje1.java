package Testler;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestProje1 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signup.click();
        MyFunction.Bekle(2);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Grup");
        MyFunction.Bekle(2);
        WebElement surname=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Surname']"));
        surname.sendKeys("Oniki");
        MyFunction.Bekle(2);
        WebElement eposta=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='E_post']"));
        eposta.sendKeys("grup128@gmail.com");
        MyFunction.Bekle(2);
        WebElement mobile=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Mobile']"));
        mobile.sendKeys("05055055555");
        MyFunction.Bekle(2);
        WebElement username=driver.findElement(By.cssSelector("[id='Username']"));
        username.sendKeys("grup128");
        MyFunction.Bekle(2);
        WebElement password=driver.findElement(By.cssSelector("input[class='form-control text-box single-line password'][id='Password']"));
        password.sendKeys("123456");
        MyFunction.Bekle(2);
        WebElement checkpass=driver.findElement(By.cssSelector("input[class='form-control text-box single-line password'][id='ConfirmPassword']"));
        checkpass.sendKeys("123456");
        MyFunction.Bekle(2);
        WebElement submit=driver.findElement(By.cssSelector("div[class='col-md-offset-2 col-md-10']>input"));
        submit.click();
        WebElement successmsg=driver.findElement(By.xpath("//label[text()='Registration Successful']"));
        Assert.assertTrue("Kayıt olunamadı",successmsg.getText().equals("Registration Successful"));
    }
    @Test
    public void Test2(){
        MyFunction.Bekle(2);
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement loginbutton=driver.findElement(By.cssSelector("form[class='form-inline my-2 my-lg-0'] > ul > :nth-child(2) > a"));
        loginbutton.click();
        WebElement username=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Username']"));
        username.sendKeys("grup12");
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        WebElement login=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        login.click();
        WebElement successlogin=driver.findElement(By.cssSelector("[class='container body-content'] h3"));
        Assert.assertTrue("Kayıt olunamadı",successlogin.getText().equals("Welcome grup12"));

    }
    @Test
    public void Test3(){
        MyFunction.Bekle(2);
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement loginbutton=driver.findElement(By.cssSelector("form[class='form-inline my-2 my-lg-0'] > ul > :nth-child(2) > a"));
        loginbutton.click();
        MyFunction.Bekle(2);
        WebElement username=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Username']"));
        username.sendKeys("grup12");
        MyFunction.Bekle(2);
        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        MyFunction.Bekle(2);
        WebElement login=driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        login.click();
        MyFunction.Bekle(2);
        WebElement createnew=driver.findElement(By.xpath("//a[text()='Create New']"));
        createnew.click();
        MyFunction.Bekle(2);
        WebElement name=driver.findElement(By.xpath("//input[@id='Name']"));
        name.sendKeys("techno");
        MyFunction.Bekle(2);
        WebElement company=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Company']"));
        company.sendKeys("technostudy");
        MyFunction.Bekle(2);
        WebElement adress=driver.findElement(By.cssSelector("input[class='form-control text-box single-line'][name='Address']"));
        adress.sendKeys("USA");
        MyFunction.Bekle(2);
        WebElement city=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='City']"));
        city.sendKeys("New York");
        MyFunction.Bekle(2);
        WebElement phone=driver.findElement(By.cssSelector("[class='form-control text-box single-line'][id='Phone']"));
        phone.sendKeys("05055055555");
        MyFunction.Bekle(2);
        WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
        email.sendKeys("technostudy@gmail.com");
        MyFunction.Bekle(2);
        WebElement create=driver.findElement(By.xpath("//input[@type='submit']"));
        create.click();
        BekleKapat();


    }
}



