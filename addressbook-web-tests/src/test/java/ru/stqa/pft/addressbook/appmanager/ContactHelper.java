package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactDataMain;
import ru.stqa.pft.addressbook.model.ContactDataTelephone;

public class ContactHelper extends HelperBase {


  public ContactHelper(WebDriver wd) {

    super(wd);
  }

  public void saveContactForm() {
    click(By.xpath("//input[21]"));
  }

  public void fillContactForm(ContactDataMain contactDataMain, ContactDataTelephone contactDataTelephone) {
    type(By.name("firstname"),contactDataMain.firstname());
    type(By.name("middlename"),contactDataMain.middlename());
    type(By.name("lastname"),contactDataMain.lastname());
    type(By.name("nickname"),contactDataMain.nickname());
    type(By.name("title"),contactDataMain.title());
    // wd.findElement(By.name("photo")).click();
    // wd.findElement(By.name("photo")).clear();
    // wd.findElement(By.name("photo")).sendKeys("C:\\Users\\Maria\\Desktop\\резюме\\фото.jpg");
    type(By.name("company"),contactDataMain.company());
    type(By.name("address"),contactDataMain.address());
    type(By.name("mobile"),contactDataTelephone.mobile());
    type(By.name("home"),contactDataTelephone.home());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactDataTelephone.home());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(contactDataTelephone.mobile());
   // wd.findElement(By.name("work")).click();
   // wd.findElement(By.name("work")).clear();
    //wd.findElement(By.name("work")).sendKeys(contactDataTelephone.work());
   // wd.findElement(By.name("fax")).click();
   // wd.findElement(By.name("fax")).clear();
   // wd.findElement(By.name("fax")).sendKeys(contactDataTelephone.fax());
    // wd.findElement(By.name("email")).click();
    //wd.findElement(By.name("email")).clear();
    //wd.findElement(By.name("email")).sendKeys("dfgdgdg");
    // wd.findElement(By.name("email2")).click();
    // wd.findElement(By.name("email2")).clear();
    // wd.findElement(By.name("email2")).sendKeys("hghfh");
    // wd.findElement(By.name("email3")).click();
    // wd.findElement(By.name("email3")).clear();
    // wd.findElement(By.name("email3")).sendKeys("sdf");
    // wd.findElement(By.name("homepage")).click();
    //  wd.findElement(By.name("homepage")).clear();
    // wd.findElement(By.name("homepage")).sendKeys("hfh");
    // wd.findElement(By.name("bday")).click();
    // new Select(wd.findElement(By.name("bday"))).selectByVisibleText("15");
    // wd.findElement(By.xpath("//option[@value='15']")).click();
    // wd.findElement(By.name("bmonth")).click();
    //  new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("November");
    // wd.findElement(By.xpath("//option[@value='November']")).click();
    // wd.findElement(By.name("byear")).click();
    //  wd.findElement(By.name("byear")).clear();
    // wd.findElement(By.name("byear")).sendKeys("1990");
    // wd.findElement(By.name("aday")).click();
    // new Select(wd.findElement(By.name("aday"))).selectByVisibleText("14");
    // wd.findElement(By.xpath("//div[@id='content']/form/select[3]/option[16]")).click();
    // wd.findElement(By.name("amonth")).click();
    //new Select(wd.findElement(By.name("amonth"))).selectByVisibleText("October");
    // wd.findElement(By.xpath("//div[@id='content']/form/select[4]/option[11]")).click();
    // wd.findElement(By.name("ayear")).click();
    // wd.findElement(By.name("ayear")).clear();
    // wd.findElement(By.name("ayear")).sendKeys("2012");
    // wd.findElement(By.name("new_group")).click();
    //  new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("test1");
    // wd.findElement(By.xpath("//div[@id='content']/form/select[5]/option[2]")).click();
    // wd.findElement(By.name("address2")).click();
    // wd.findElement(By.name("address2")).clear();
    // wd.findElement(By.name("address2")).sendKeys("fgdsg");
    // wd.findElement(By.name("phone2")).click();
    //wd.findElement(By.name("phone2")).clear();
    //wd.findElement(By.name("phone2")).sendKeys("sfgs");
    //wd.findElement(By.name("notes")).click();
    //wd.findElement(By.name("notes")).clear();
    // wd.findElement(By.name("notes")).sendKeys("dgfg");
  }

  public void selectContact() {
    click(By.id("1"));

  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.name("update"));
}

  public void submitDeletionContact() {
    click(By.xpath("xpath=//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }
}
