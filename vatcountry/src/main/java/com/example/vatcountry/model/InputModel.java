package com.example.vatcountry.model;

public class InputModel {

    private String VatCode;

    public String getVatCode() {
        return VatCode;
    }

    public void setVatCode(String vatCode) {
        this.VatCode = vatCode;
    }

    public InputModel(String vatCode) {
        this.VatCode = vatCode;
    }
    public InputModel(){}

}
