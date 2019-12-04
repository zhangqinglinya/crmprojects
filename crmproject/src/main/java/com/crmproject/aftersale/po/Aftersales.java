package com.crmproject.aftersale.po;

public class Aftersales {
    private String aftersalesId;

    private String themeName;

    private String step;

    private String contractId;

    private String manager;

    private String fixationPhone;

    private String movePhone;

    private String serviceType;

    private String serviceMode;

    private String startTime;

    private String endTime;

    private String serviceContent;

    private String customerFeedback;

    private String serviceStaff;

    private String accessory;

    private String serviceScore;

    public String getAftersalesId() {
        return aftersalesId;
    }

    public void setAftersalesId(String aftersalesId) {
        this.aftersalesId = aftersalesId == null ? null : aftersalesId.trim();
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName == null ? null : themeName.trim();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    public String getFixationPhone() {
        return fixationPhone;
    }

    public void setFixationPhone(String fixationPhone) {
        this.fixationPhone = fixationPhone == null ? null : fixationPhone.trim();
    }

    public String getMovePhone() {
        return movePhone;
    }

    public void setMovePhone(String movePhone) {
        this.movePhone = movePhone == null ? null : movePhone.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode == null ? null : serviceMode.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(String serviceContent) {
        this.serviceContent = serviceContent == null ? null : serviceContent.trim();
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback == null ? null : customerFeedback.trim();
    }

    public String getServiceStaff() {
        return serviceStaff;
    }

    public void setServiceStaff(String serviceStaff) {
        this.serviceStaff = serviceStaff == null ? null : serviceStaff.trim();
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory == null ? null : accessory.trim();
    }

    public String getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(String serviceScore) {
        this.serviceScore = serviceScore == null ? null : serviceScore.trim();
    }
}