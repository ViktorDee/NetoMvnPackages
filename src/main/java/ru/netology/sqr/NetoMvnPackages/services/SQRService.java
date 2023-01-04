package ru.netology.sqr.NetoMvnPackages.services;

public class SQRService {

    public int calcSortOut(int minNumber, int maxNumber) {
        int squareRootCount = 0;
        for (int targetNumber = 10; targetNumber <= 99; targetNumber++) {
            int squareRoot = targetNumber * targetNumber;
            if (squareRoot >= minNumber & squareRoot <= maxNumber) {
                squareRootCount++;
            }
        }
        return squareRootCount;
    }
}
