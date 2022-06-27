package ua.ithillel.homework.hw18;

import java.util.ArrayList;
import java.util.List;

public class RatesOfTheDay {

    private List<Currency> ratesList = new ArrayList<>();

    public RatesOfTheDay(List<Currency> list) {
        this.ratesList = list;
    }

    public List<Currency> getRatesList() {
        return ratesList;
    }
}
