package ua.ithillel.homework.hw15;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("book", 300));
        products.add(new Product("shoes", 300));
        products.add(new Product("pen", 300, true));
        products.add(new Product("book", 2, true));
        products.add(new Product("book", 30, true));

        System.out.println(booksWithSale(products));
    }

    public static List<Product> getBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("book"))
                .filter(product -> product.getPrice() > 250)
                .toList();
    }

    public static List<Product> booksWithSale(List<Product> products) {
       return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("book"))
                .filter(Product::getSale)
                .map(price -> price.getPrice() - (price.getPrice() / 100 * 10))
               .flatMap(product -> products.stream())
               .toList();
    }

    public static Product cheapestBook(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new NoSuchElementException("Продукт не найден"));
    }

    public static List<Product> lastThreeProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getDate() != null)
                .filter(product -> product.getDate().getYear() == LocalDate.now().getYear())
                .limit(3)
                .toList();
    }

    public static int sumBooksPrice(List<Product> products) {
        return products.stream()
                .filter(product -> product.getDate() != null)
                .filter(product -> product.getDate().getYear() == 2022)
                .filter(product -> product.getType().equalsIgnoreCase("book"))
                .filter(product -> product.getPrice() < 75)
                .mapToInt(Product::getPrice)
                .sum();
    }

    public static Map<String, List<Product>> groupProducts(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
