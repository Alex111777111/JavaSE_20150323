package ru.javacourse;

import java.util.Date;

public class Person
{
    private String surName;
    private String givenName;
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person {dateOfBirth=" + dateOfBirth + ", givenName='" + givenName + "', surName='" + surName + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!dateOfBirth.equals(person.dateOfBirth)) return false;
        if (!givenName.equals(person.givenName)) return false;
        if (!surName.equals(person.surName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = surName.hashCode();
        result = 31 * result + givenName.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public Object clone() {
        Person p = new Person();
        p.setDateOfBirth(this.dateOfBirth);

        p.setGivenName(this.givenName);

        p.setSurName(this.surName);

        return p;
    }
}
