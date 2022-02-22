package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public final class ContactDataTelephone {
  private final String home;
  private final String mobile;
  private final String work;
  private final String fax;

  public ContactDataTelephone(String home, String mobile, String work, String fax) {
    this.home = home;
    this.mobile = mobile;
    this.work = work;
    this.fax = fax;
  }

  public String home() {
    return home;
  }

  public String mobile() {
    return mobile;
  }

  public String work() {
    return work;
  }

  public String fax() {
    return fax;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (ContactDataTelephone) obj;
    return Objects.equals(this.home, that.home) &&
            Objects.equals(this.mobile, that.mobile) &&
            Objects.equals(this.work, that.work) &&
            Objects.equals(this.fax, that.fax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, mobile, work, fax);
  }

  @Override
  public String toString() {
    return "ContactDataTelephone[" +
            "home=" + home + ", " +
            "mobile=" + mobile + ", " +
            "work=" + work + ", " +
            "fax=" + fax + ']';
  }

}