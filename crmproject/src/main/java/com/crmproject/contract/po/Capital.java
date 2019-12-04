package com.crmproject.contract.po;

public class Capital {
    private String capitalId;

    private String contractId;

    private String remittancemoney;

    private String invoice;

    public String getCapitalId() {
        return capitalId;
    }

    public void setCapitalId(String capitalId) {
        this.capitalId = capitalId == null ? null : capitalId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getRemittancemoney() {
        return remittancemoney;
    }

    public void setRemittancemoney(String remittancemoney) {
        this.remittancemoney = remittancemoney == null ? null : remittancemoney.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }
}