package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public final class ContactDataMain {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String home;
  private final String mobile;
  private String group;


  public ContactDataMain(String firstname, String middlename, String lastname, String nickname, String title,
                         String company, String address, String home, String mobile, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.home = home;
    this.mobile = mobile;
    this.group = group;
  }

  public String firstname() {
    return firstname;
  }

  public String middlename() {
    return middlename;
  }

  public String lastname() {
    return lastname;
  }

  public String nickname() {
    return nickname;
  }

  public String title() {
    return title;
  }

  public String company() {
    return company;
  }

  public String address() {
    return address;
  }
  public String home() {
    return home;
  }

  public String mobile() {
    return mobile;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (ContactDataMain) obj;
    return Objects.equals(this.firstname, that.firstname) &&
            Objects.equals(this.middlename, that.middlename) &&
            Objects.equals(this.lastname, that.lastname) &&
            Objects.equals(this.nickname, that.nickname) &&
            Objects.equals(this.title, that.title) &&
            Objects.equals(this.company, that.company) &&
            Objects.equals(this.address, that.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, middlename, lastname, nickname, title, company, address);
  }

  @Override
  public String toString() {
    return "ContactDataMain[" +
            "firstname=" + firstname + ", " +
            "middlename=" + middlename + ", " +
            "lastname=" + lastname + ", " +
            "nickname=" + nickname + ", " +
            "title=" + title + ", " +
            "company=" + company + ", " +
            "address=" + address + ']';
  }

  public String getGroup() {
    return group;
  }
}