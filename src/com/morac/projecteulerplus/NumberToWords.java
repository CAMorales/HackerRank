package com.morac.projecteulerplus;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class NumberToWords {

    static class EnglishNumberToWords {

        private static final String[] tensNames = {
                "",
                " Ten",
                " Twenty",
                " Thirty",
                " Forty",
                " Fifty",
                " Sixty",
                " Seventy",
                " Eighty",
                " Ninety"
        };

        private static final String[] numNames = {
                "",
                " One",
                " Two",
                " Three",
                " Four",
                " Five",
                " Six",
                " Seven",
                " Eight",
                " Nine",
                " Ten",
                " Eleven",
                " Twelve",
                " Thirteen",
                " Fourteen",
                " Fifteen",
                " Sixteen",
                " Seventeen",
                " Eighteen",
                " Nineteen"
        };

        private EnglishNumberToWords() {
        }

        private static String convertLessThanOneThousand(int number) {
            String soFar;
            int modulusOneHundred = number % 100;

            if (modulusOneHundred < 20) {
                soFar = numNames[modulusOneHundred];
                number /= 100;
            } else {
                soFar = numNames[number % 10];
                number /= 10;

                soFar = tensNames[number % 10] + soFar;
                number /= 10;
            }
            if (number == 0) return soFar;
            return numNames[number] + " Hundred" + soFar;
        }


        public static String convert(long number) {
            // 0 to 999 999 999 999
            if (number == 0) {
                return "Zero";
            }

            // pad with "0"
            String mask = "000000000000";
            DecimalFormat df = new DecimalFormat(mask);
            String sNumber = df.format(number);

            // XXXnnnnnnnnn
            int billions = Integer.parseInt(sNumber.substring(0, 3));
            // nnnXXXnnnnnn
            int millions = Integer.parseInt(sNumber.substring(3, 6));
            // nnnnnnXXXnnn
            int hundredThousands = Integer.parseInt(sNumber.substring(6, 9));
            // nnnnnnnnnXXX
            int thousands = Integer.parseInt(sNumber.substring(9, 12));

            String tradBillions;
//            switch (billions) {
//                case 0:
//                    tradBillions = "";
//                    break;
//                case 1:
//                    tradBillions = convertLessThanOneThousand(billions)
//                            + " Billion ";
//                    break;
//                default:
//                    tradBillions = convertLessThanOneThousand(billions)
//                            + " Billion ";
//            }
            if (billions == 0) {
                tradBillions = "";
            } else {
                tradBillions = convertLessThanOneThousand(billions) + " Billion ";
            }
            String result = tradBillions;

            String tradMillions;
//            switch (millions) {
//                case 0:
//                    tradMillions = "";
//                    break;
//                case 1:
//                    tradMillions = convertLessThanOneThousand(millions)
//                            + " Million ";
//                    break;
//                default:
//                    tradMillions = convertLessThanOneThousand(millions)
//                            + " Million ";
//            }

            if (millions == 0) {
                tradMillions = "";
            } else {
                tradMillions = convertLessThanOneThousand(millions) + " Million ";
            }
            result = result + tradMillions;

            String tradHundredThousands;
            switch (hundredThousands) {
                case 0:
                    tradHundredThousands = "";
                    break;
                case 1:
                    tradHundredThousands = "One Thousand ";
                    break;
                default:
                    tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                            + " Thousand ";
            }
            result = result + tradHundredThousands;

            String tradThousand;
            tradThousand = convertLessThanOneThousand(thousands);
            result = result + tradThousand;

            // remove extra spaces!
            return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            System.out.println(EnglishNumberToWords.convert(in.nextLong()));
        }
    }
}
