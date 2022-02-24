package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDataMain;
import ru.stqa.pft.addressbook.model.ContactDataTelephone;

public class ContactCreationTests extends TestBase{
  @Test
  public void testNewContactCreation() {
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().fillContactForm(new ContactDataMain("dfgdg", "dgdfg", "dgfdfg", "dfgdfgd", "dgdfg", "dgdfgd", "dgdfg"), new ContactDataTelephone("fh123", "1231", "123", "123"));
    app.getContactHelper().saveContactForm();
    app.getNavigationHelper().gotoHomePage();
  }
}
