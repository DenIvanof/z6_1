package org.example;

import org.example.zadanie6_1.services.IncomeExpensesService;

public class Main {
    public static void main(String[] args) {

        IncomeExpensesService service = new IncomeExpensesService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
        System.out.println(service.calculate(100_000, 60_000, 150_000));
        System.out.println(service.calculate(10_000, 10_000, 20_000));
    }
}