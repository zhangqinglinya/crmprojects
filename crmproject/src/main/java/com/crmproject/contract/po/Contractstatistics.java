package com.crmproject.contract.po;

public class Contractstatistics {
    private String contractstatisticsId;

    private String contractId;

    private String capitalId;

    private String sortallCstate;

    public String getContractstatisticsId() {
        return contractstatisticsId;
    }

    public void setContractstatisticsId(String contractstatisticsId) {
        this.contractstatisticsId = contractstatisticsId == null ? null : contractstatisticsId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getCapitalId() {
        return capitalId;
    }

    public void setCapitalId(String capitalId) {
        this.capitalId = capitalId == null ? null : capitalId.trim();
    }

    public String getSortallCstate() {
        return sortallCstate;
    }

    public void setSortallCstate(String sortallCstate) {
        this.sortallCstate = sortallCstate == null ? null : sortallCstate.trim();
    }
}