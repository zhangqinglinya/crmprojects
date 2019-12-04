package com.crmproject.client.po;

public class ClientFinancing {
    private String clientFinancingId;

    private String clientId;

    private String bankAccount;

    private String accountName;

    private String bankName;

    private String bankAddress;

    private String ird;

    private String phone;

    public String getClientFinancingId() {
        return clientFinancingId;
    }

    public void setClientFinancingId(String clientFinancingId) {
        this.clientFinancingId = clientFinancingId == null ? null : clientFinancingId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getIrd() {
        return ird;
    }

    public void setIrd(String ird) {
        this.ird = ird == null ? null : ird.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}