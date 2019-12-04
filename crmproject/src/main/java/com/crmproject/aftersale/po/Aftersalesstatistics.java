package com.crmproject.aftersale.po;

public class Aftersalesstatistics {
    private String aftersalesstatisticsId;

    private String aftersalesId;

    private String sortallAclassify;

    public String getAftersalesstatisticsId() {
        return aftersalesstatisticsId;
    }

    public void setAftersalesstatisticsId(String aftersalesstatisticsId) {
        this.aftersalesstatisticsId = aftersalesstatisticsId == null ? null : aftersalesstatisticsId.trim();
    }

    public String getAftersalesId() {
        return aftersalesId;
    }

    public void setAftersalesId(String aftersalesId) {
        this.aftersalesId = aftersalesId == null ? null : aftersalesId.trim();
    }

    public String getSortallAclassify() {
        return sortallAclassify;
    }

    public void setSortallAclassify(String sortallAclassify) {
        this.sortallAclassify = sortallAclassify == null ? null : sortallAclassify.trim();
    }
}