package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDataMain;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactDataMain("dfgdg", "dgdfg", "dgfdfg", "dfgdfgd", "dgdfg", "dgdfgd", "dgdfg","fh123", "1231", null), false);
    app.getContactHelper().submitContactModification();
  }
}
