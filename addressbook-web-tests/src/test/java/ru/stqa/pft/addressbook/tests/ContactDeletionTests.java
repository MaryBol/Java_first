package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactDataMain;
import ru.stqa.pft.addressbook.model.ContactDataTelephone;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testNewContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().submitDeletionContact();
    app.getNavigationHelper().gotoHomePage();
  }
}
