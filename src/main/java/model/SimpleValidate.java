package model;

public class SimpleValidate {
    private String memberStateCode;
    private String vatNumber;
    public SimpleValidate() {
    }

    public SimpleValidate(String memberStateCode, String vatNumber) {
        this.memberStateCode = memberStateCode;
        this.vatNumber = vatNumber;
    }

    public String getMemberStateCode() {
        return memberStateCode;
    }

    public void setMemberStateCode(String memberStateCode) {
        this.memberStateCode = memberStateCode;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

}
