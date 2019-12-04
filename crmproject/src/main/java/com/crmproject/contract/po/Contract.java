package com.crmproject.contract.po;

public class Contract {
    private String contractId;

    private String documentaryId;

    private String cname;

    private String serialnumber;

    private String money;

    private String contractdate;

    private String effectivedate;

    private String timelimit;

    private String contactperson;

    private String fixationphone;

    private String movephone;

    private String email;

    private String cctg;

    private String commerceclause;

    private String accessory;

    private String department;

    private String associatedpersons;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getDocumentaryId() {
        return documentaryId;
    }

    public void setDocumentaryId(String documentaryId) {
        this.documentaryId = documentaryId == null ? null : documentaryId.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getContractdate() {
        return contractdate;
    }

    public void setContractdate(String contractdate) {
        this.contractdate = contractdate == null ? null : contractdate.trim();
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate == null ? null : effectivedate.trim();
    }

    public String getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(String timelimit) {
        this.timelimit = timelimit == null ? null : timelimit.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getFixationphone() {
        return fixationphone;
    }

    public void setFixationphone(String fixationphone) {
        this.fixationphone = fixationphone == null ? null : fixationphone.trim();
    }

    public String getMovephone() {
        return movephone;
    }

    public void setMovephone(String movephone) {
        this.movephone = movephone == null ? null : movephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCctg() {
        return cctg;
    }

    public void setCctg(String cctg) {
        this.cctg = cctg == null ? null : cctg.trim();
    }

    public String getCommerceclause() {
        return commerceclause;
    }

    public void setCommerceclause(String commerceclause) {
        this.commerceclause = commerceclause == null ? null : commerceclause.trim();
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory == null ? null : accessory.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getAssociatedpersons() {
        return associatedpersons;
    }

    public void setAssociatedpersons(String associatedpersons) {
        this.associatedpersons = associatedpersons == null ? null : associatedpersons.trim();
    }
}