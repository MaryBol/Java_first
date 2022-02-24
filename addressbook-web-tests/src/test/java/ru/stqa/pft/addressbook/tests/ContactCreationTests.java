package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDataMain;

public class ContactCreationTests extends TestBase{
  @Test
  public void testNewContactCreation() {
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().fillContactForm(new ContactDataMain("dfgdg", "dgdfg", "dgfdfg", "dfgdfgd", "dgdfg", "dgdfgd", "dgdfg", "fh123", "1231", "test6"), true) ;
    app.getContactHelper().saveContactForm();
    app.getNavigationHelper().gotoHomePage();
  }
}
