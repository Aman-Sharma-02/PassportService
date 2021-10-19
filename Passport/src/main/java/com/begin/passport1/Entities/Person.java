package com.begin.passport1.Entities;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="application_id", nullable=false, updatable=false)
    private int id;
    
    private int AadharNo;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String Address;
    private String FatherName;
    private String MotherName;
    private String DateOfBirth;
    private String BirthPlace;
    private String IssuePlace;
    private String IssueDate;
    private String ExpiryDate;
    private String Status;

    public Person(int ids,int aadharNo, String firstName, String lastName, String gender, String address, String fatherName, String motherName, String dateOfBirth, String birthPlace, String issuePlace, String issueDate, String expiryDate, String status)
    {
        super();
        this.id= ids;
        this.AadharNo = aadharNo;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Gender = gender;
        this.Address = address;
        this.FatherName = fatherName;
        this.MotherName = motherName;
        this.DateOfBirth = dateOfBirth;
        this.BirthPlace = birthPlace;
        this.IssuePlace = issuePlace;
        this.IssueDate = issueDate;
        this.ExpiryDate = expiryDate;
        this.Status = status;
    }
    
    public Person()
    {
        super();
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        this.LastName = lastName;
    }

    public int getAadharNo()
    {
        return AadharNo;
    }

    public void setAadharNo(int aadharNo)
    {
        this.AadharNo = aadharNo;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        this.Address = address;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String firstName)
    {
        this.FirstName = firstName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        this.FatherName = fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        this.MotherName = motherName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.BirthPlace = birthPlace;
    }

    public String getIssuePlace() {
        return IssuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.IssuePlace = issuePlace;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issueDate) {
        this.IssueDate = issueDate;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.ExpiryDate = expiryDate;
    }

   @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", AadharNo=" + AadharNo +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", MotherName='" + MotherName + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", BirthPlace='" + BirthPlace + '\'' +
                ", IssuePlace='" + IssuePlace + '\'' +
                ", IssueDate='" + IssueDate + '\'' +
                ", ExpiryDate='" + ExpiryDate + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
