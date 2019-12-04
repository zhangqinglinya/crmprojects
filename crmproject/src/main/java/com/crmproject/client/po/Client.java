package com.crmproject.client.po;

public class Client {
    private String clientId;

    private String clientName;

    private String clientNamePinyin;

    private String clientSex;

    private String sortallClassify;

    private String sortallSource;

    private String sortallBusiness;

    private String department;

    private String country;

    private String city;

    private String detailedAddress;

    private String postalCode;

    private String telephone;

    private String mobileTelephone;

    private String email;

    private String legalPerson;

    private String subjoin;

    private String empId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientNamePinyin() {
        return clientNamePinyin;
    }

    public void setClientNamePinyin(String clientNamePinyin) {
        this.clientNamePinyin = clientNamePinyin == null ? null : clientNamePinyin.trim();
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex == null ? null : clientSex.trim();
    }

    public String getSortallClassify() {
        return sortallClassify;
    }

    public void setSortallClassify(String sortallClassify) {
        this.sortallClassify = sortallClassify == null ? null : sortallClassify.trim();
    }

    public String getSortallSource() {
        return sortallSource;
    }

    public void setSortallSource(String sortallSource) {
        this.sortallSource = sortallSource == null ? null : sortallSource.trim();
    }

    public String getSortallBusiness() {
        return sortallBusiness;
    }

    public void setSortallBusiness(String sortallBusiness) {
        this.sortallBusiness = sortallBusiness == null ? null : sortallBusiness.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(String mobileTelephone) {
        this.mobileTelephone = mobileTelephone == null ? null : mobileTelephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getSubjoin() {
        return subjoin;
    }

    public void setSubjoin(String subjoin) {
        this.subjoin = subjoin == null ? null : subjoin.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }
}