package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupCreationTests extends TestBase {
  private WebDriver wd;


  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://127.0.0.1:8080/addressbook/group.php");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.id("LoginForm")).click();
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGropCreation();
    fillGroupForm(new GroupData("test6", "test37", "test47"));
    submitGroupCreation();
    returnToGroupPage();

  }

  private void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.name());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.header());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.footer());
  }

  private void initGropCreation() {
    wd.findElement(By.name("new")).click();
  }

  private void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  @Test
  public void testNewContactCreation() {
    gotoAddNewPage();
    fillContactForm(new ContactDataMain("dfgdg", "dgdfg", "dgfdfg", "dfgdfgd", "dgdfg", "dgdfgd", "dgdfg"), new ContactDataTelephone("fh123", "1231", "123", "123"));
    saveContactForm();
    gotoHomePage();
  }

  private void gotoHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  private void saveContactForm() {
    wd.findElement(By.xpath("//input[21]")).click();
  }

  private void fillContactForm(ContactDataMain contactDataMain, ContactDataTelephone contactDataTelephone) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contactDataMain.firstname());
    wd.findElement(By.name("middlename")).click();

    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(contactDataMain.middlename());
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contactDataMain.lastname());
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(contactDataMain.nickname());
    // wd.findElement(By.name("photo")).click();
    // wd.findElement(By.name("photo")).clear();
    // wd.findElement(By.name("photo")).sendKeys("C:\\Users\\Maria\\Desktop\\резюме\\фото.jpg");
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(contactDataMain.title());
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(contactDataMain.company());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(contactDataMain.address());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(contactDataTelephone.home());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(contactDataTelephone.mobile());
    wd.findElement(By.name("work")).click();
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(contactDataTelephone.work());
    wd.findElement(By.name("fax")).click();
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(contactDataTelephone.fax());
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

  private void gotoAddNewPage() {
    wd.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.findElement(By.linkText("Logout")).click();
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
