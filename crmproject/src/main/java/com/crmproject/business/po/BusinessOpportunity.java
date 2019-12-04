package com.crmproject.business.po;

public class BusinessOpportunity {
    private String businessOpportunityId;

    private String clientId;

    private String businessOpportunityName;

    private String clientSource;

    private String tradingVolume;

    private String statementDate;

    private String linkman;

    private String department;

    private String duty;

    private String telephone;

    private String mobileTelephone;

    private String email;

    private String requirements;

    private String accessory;

    private String businessOpportunityDepartment;

    private String leader;

    private String participant;

    private String follower;

    public String getBusinessOpportunityId() {
        return businessOpportunityId;
    }

    public void setBusinessOpportunityId(String businessOpportunityId) {
        this.businessOpportunityId = businessOpportunityId == null ? null : businessOpportunityId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getBusinessOpportunityName() {
        return businessOpportunityName;
    }

    public void setBusinessOpportunityName(String businessOpportunityName) {
        this.businessOpportunityName = businessOpportunityName == null ? null : businessOpportunityName.trim();
    }

    public String getClientSource() {
        return clientSource;
    }

    public void setClientSource(String clientSource) {
        this.clientSource = clientSource == null ? null : clientSource.trim();
    }

    public String getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(String tradingVolume) {
        this.tradingVolume = tradingVolume == null ? null : tradingVolume.trim();
    }

    public String getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(String statementDate) {
        this.statementDate = statementDate == null ? null : statementDate.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
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

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements == null ? null : requirements.trim();
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory == null ? null : accessory.trim();
    }

    public String getBusinessOpportunityDepartment() {
        return businessOpportunityDepartment;
    }

    public void setBusinessOpportunityDepartment(String businessOpportunityDepartment) {
        this.businessOpportunityDepartment = businessOpportunityDepartment == null ? null : businessOpportunityDepartment.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant == null ? null : participant.trim();
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower == null ? null : follower.trim();
    }
}