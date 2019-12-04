package com.crmproject.client.po;

public class ClientStatistics {
    private String clientStatisticsId;

    private String clientId;

    private String businessOpportunityId;

    private String contractId;

    private String aftersalesId;

    public String getClientStatisticsId() {
        return clientStatisticsId;
    }

    public void setClientStatisticsId(String clientStatisticsId) {
        this.clientStatisticsId = clientStatisticsId == null ? null : clientStatisticsId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getBusinessOpportunityId() {
        return businessOpportunityId;
    }

    public void setBusinessOpportunityId(String businessOpportunityId) {
        this.businessOpportunityId = businessOpportunityId == null ? null : businessOpportunityId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getAftersalesId() {
        return aftersalesId;
    }

    public void setAftersalesId(String aftersalesId) {
        this.aftersalesId = aftersalesId == null ? null : aftersalesId.trim();
    }
}