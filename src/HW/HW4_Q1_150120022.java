package HW;

import java.util.Scanner;

public class HW4_Q1_150120022 {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int NumberofFlats = input.nextInt();
        double[] flatconsumption = new double[NumberofFlats];
        for (int i = 0; i < flatconsumption.length; i++) {
            flatconsumption[i] = input.nextDouble();
        }
//15 12 14,2 15,87 21,4 19 13 8,1 11 15,14 16 23,14 27 5,98 7,18 17 812,90
        double Totalbill = input.nextDouble();
        System.out.print(NumberofFlats + " ");
        for (int i = 0; i < flatconsumption.length; i++) {
            System.out.print(formatNumber(flatconsumption[i]) + " ");
        }
        System.out.println(formatNumber(Totalbill));
        double[] eachflatbill = calculateTheInvoice(flatconsumption, Totalbill);
        printBills(eachflatbill);


    }

//    public static String formatNumber2(double number){
//        String numberString = String.valueOf(number);
//        String[] partsOfNumber = numberString.split("\\.");
//        int numberAfterDot = Integer.parseInt(partsOfNumber[1]);
//        numberString = formatNumberString(number, numberString, numberAfterDot);
//        return numberString;
//    }

    public static String formatNumber(double number) {
        // "15.04", "15.15", "15.0000", "154.55698", "1.50"
        String numberString = number + "";

        // 1. iş: noktanın indexini bulmak
        int indexOfDot = findIndexOfDot(numberString);

        // 2. iş: noktadan sonraki sayıları elde etmek
        int numberAfterDot = getNumberAfterDot(numberString, indexOfDot);

        // 3. iş: noktadan sonraki sayıların integer değerine göre formatlayıp formatlamamaya karar vermek
        numberString = formatNumberString(number, numberString, numberAfterDot);

        return numberString;
    }

    public static String formatNumberString(double number, String numberString, int numberAfterDot) {
        if (numberAfterDot == 0) {
            numberString = String.valueOf((int) number); // numberString = (int)number + ""; ile aynı şeydir
        }
        else if (0 < numberAfterDot && numberAfterDot < 10){
            numberString += "0";
        }
        return numberString;
    }

    public static int getNumberAfterDot(String numberString, int indexOfDot) {
        String numberAfterDotString = "";
        for (int i = indexOfDot + 1; i < numberString.length(); i++) {
            numberAfterDotString += numberString.charAt(i);
        }
        return Integer.parseInt(numberAfterDotString);
    }

    public static int findIndexOfDot(String doubleNumber){
        int indexOfDot = -1;
        int length = doubleNumber.length();
        for (int i = 0; i < length; i++) {
            if (doubleNumber.charAt(i) == '.') {
                indexOfDot = i;
                break;
            }
        }
        return indexOfDot;
    }

    public static double[] calculateTheInvoice(double[] flats, double totalBill) {
        int n = flats.length;
        double[] eachflatbill = new double[n];
        double totalflat = 0;
        for (int i = 0; i < n; i++) {
            totalflat += flats[i];
        }
        for (int i = 0; i < n; i++)
            eachflatbill[i] = ((totalBill * 0.3) / n) + ((flats[i] / totalflat) * 0.7 * totalBill);

        return eachflatbill;


    }
    //3 12,8 23 9,2 320,40

    public static void printBills(double[] bills) {

        for (int i = 0; i < bills.length; i++) {

            double bill = (int) (bills[i] * 100) / 100.0;

            System.out.println(i + 1 + ".Flat: " + bill);
        }


    }
}
