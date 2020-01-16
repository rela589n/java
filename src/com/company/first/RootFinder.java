package com.company.first;


public class RootFinder {
    private static double power(double a, double b) {
        return Math.exp(b * Math.log(a));
    }

    private static double eps = 0.0001;

    private static double mySqrt(double number, int pow) throws Exception {
        if (number < 0)
            throw new Exception("Number must be natural int");
        if (pow == 0) {
            return 1;
        }
        if (pow < 0) {
            return power(number, 1. / pow);
        }

        double l = 0, r = number;
        while (r - l > eps) {
            double center = (r + l) / 2.;

            double tmp = power(center, pow);
            if (tmp < number) {
                l = center;
            } else if (tmp > number) {
                r = center;
            } else {
                l = r = center;
            }
        }
        return l;
    }
}
