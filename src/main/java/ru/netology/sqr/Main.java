package ru.netology.sqr;

import ru.netology.sqr.NetoMvnPackages.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSortOut(1, 100000));
    }
}