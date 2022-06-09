package ua.ithillel.homework.hw18;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String[]> list = reader.read("exchangeRates_01.06.22.txt");

        List<Currency> ratesList = new ArrayList<>();
        for (String[] rates : list) {
            Currency currency = new Currency(Double.parseDouble(rates[7]), rates[3],
                    rates[1], rates[4].trim(), rates[6].trim());
            ratesList.add(currency);
        }

        System.out.println("enter currency");
        String request = args[0];

        System.out.println(soutMessage(findCurrency(ratesList, request)));
    }

    private static String soutMessage(Currency currency) {
        return "Средняя стоимости UAH [Ukrainian Hryvnia] к " + currency.getLetterCode() + " ["
                + currency.getName() + "]"
                + " = " + currency.getRate();
    }

    private static Currency findCurrency(List<Currency> ratesList, String request) {
        return ratesList.stream()
                .filter(value -> value.getLetterCode().equalsIgnoreCase(request))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Invalid input"));
    }
}
