package com.company;

import java.io.Serializable;

/**
 * Created by promoscow on 15.04.17.
 */
public class Currency implements Serializable {
    String dCode;
    String code;
    String forAmount;
//    String name;
    String rate;
    String date;

    public Currency() {

    }

    public String getdCode() {
        return dCode;
    }

    public void setdCode(String dCode) {
        this.dCode = dCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForAmount() {
        return forAmount;
    }

    public void setForAmount(String forAmount) {
        this.forAmount = forAmount;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "dCode='" + dCode + '\'' +
                ", code='" + code + '\'' +
                ", forAmount='" + forAmount + '\'' +
//                ", name='" + name + '\'' +
                ", rate='" + rate + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (dCode != null ? !dCode.equals(currency.dCode) : currency.dCode != null) return false;
        if (code != null ? !code.equals(currency.code) : currency.code != null) return false;
        if (forAmount != null ? !forAmount.equals(currency.forAmount) : currency.forAmount != null) return false;
//        if (name != null ? !name.equals(currency.name) : currency.name != null) return false;
        if (rate != null ? !rate.equals(currency.rate) : currency.rate != null) return false;
        return date != null ? date.equals(currency.date) : currency.date == null;

    }

    @Override
    public int hashCode() {
        int result = dCode != null ? dCode.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (forAmount != null ? forAmount.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
