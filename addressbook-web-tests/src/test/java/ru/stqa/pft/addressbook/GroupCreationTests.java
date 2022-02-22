package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGropCreation();
    fillGroupForm(new GroupData("test6", "test37", "test47"));
    submitGroupCreation();
    returnToGroupPage();

  }
  @Test
  public void testNewContactCreation() {
    gotoAddNewPage();
    fillContactForm(new ContactDataMain("dfgdg", "dgdfg", "dgfdfg", "dfgdfgd", "dgdfg", "dgdfgd", "dgdfg"), new ContactDataTelephone("fh123", "1231", "123", "123"));
    saveContactForm();
    gotoHomePage();
  }

}
