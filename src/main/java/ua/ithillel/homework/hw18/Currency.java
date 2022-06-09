package ua.ithillel.homework.hw18;

public class Currency {

    private double rate;
    private String digitalCode;
    private String date;
    private String letterCode;
    private String name;

    public Currency(double rate, String digitalCode, String date, String letterCode, String name) {
        this.rate = rate;
        this.digitalCode = digitalCode;
        this.date = date;
        this.letterCode = letterCode;
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public String getDigitalCode() {
        return digitalCode;
    }

    public String getDate() {
        return date;
    }

    public String getLetterCode() {
        return letterCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "rate=" + rate +
                ", digitalCode=" + digitalCode +
                ", date='" + date + '\'' +
                ", letterCode='" + letterCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
