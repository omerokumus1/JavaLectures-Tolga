package HW;

import java.util.Scanner;

public class HW3_150120022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Which shape would you like to draw");
            System.out.println("1. Line");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Parabola");
            System.out.println("5. Circle");
            System.out.println("6.Exit");
            int shapenumber = input.nextInt();

            if (shapenumber == 1) {
                System.out.println("Line formula is y=ax+b");
                System.out.print("Please enter the coefficients a and b: ");
                int a = input.nextInt();
                int b = input.nextInt();

                for (int j = 10; j >= -11; j--) {// y ekseni
                    for (int i = -10; i <= 11; i++) { // x ekseni

                        if (a * i + b == j)
                            System.out.print("*");
                        else if (j == 0) {
                            if (i == 0)
                                System.out.print("|");
                            else if (a * i + b == j)
                                System.out.print("*");
                            else if (i == 11)
                                System.out.print("x");
                            else
                                System.out.print("-");

                        } else if (i == 0)
                            if (j == 10)
                                System.out.print("y");
                            else
                                System.out.print("|");
                        else {
                            System.out.print(" ");
                        }


                    }
                    System.out.println();
                }

            } else if (shapenumber == 2) {
                System.out.println("For triangle, we need the coordinates of the points for three vertices");
                System.out.print("Please enter the coordinates of 3 vertices a, b, c, d, e, f: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                int d = input.nextInt();
                int e = input.nextInt();
                int f = input.nextInt();
                input.nextLine();
                double k, l, m, n, t, p;
                k = calculateSlope(a, b, c, d);
                l = calculateConstant(a, b, c, d);
                m = calculateSlope(c, d, e, f);
                n = calculateConstant(c, d, e, f);
                t = calculateSlope(a, b, e, f);
                p = calculateConstant(a, b, e, f);
                int ymax = Math.max(Math.max(b, d), f);
                int ymin = Math.min(Math.min(b, d), f);
                int xmax = Math.max(Math.max(a, c), e);
                int xmin = Math.min(Math.min(a, c), e);

                for (int j = 10; j >= -11; j--) {// y ekseni
                    String line = "";
                    for (int i = -10; i <= 11; i++) { // x ekseni
                        boolean isRangeValid = (xmin <= i && i <= xmax) && (ymin <= j && j <= ymax);
                        if (Math.round(k * i + l) == j && isRangeValid) {
                            line += "*";
                        } else if (Math.round(m * i + n) == j && isRangeValid) {
                            line += "*";
                        } else if (Math.round(t * i + p) == j && isRangeValid) {
                            line += "*";
                        } else line = printCoordinateSystem(a, b, ymax, ymin, xmax, xmin, j, line, i);


                    }
                    line = modifyLine(line);
                    System.out.print(line);
                    System.out.println();
                }


            } else if (shapenumber == 3) {
                System.out.println("For rectangle, we need the coordinates of the points for three vertices.");
                System.out.print("Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                int d = input.nextInt();
                int e = input.nextInt();
                int f = input.nextInt();
                input.nextLine();
                if (b != d) {
                    System.out.println("These points cannot construct a rectangle.");
                } else {
                    int ymax = b;
                    int ymin = f;
                    int xmax = c;
                    int xmin = a;
                    for (int j = 10; j >= -11; j--) {// y ekseni
                        String line = "";
                        for (int i = -10; i <= 11; i++) { // x ekseni
                            boolean isRangeValid = (xmin <= i && i <= xmax) && (ymin <= j && j <= ymax);
                            if ((j == ymax || j == ymin) && isRangeValid) {
                                line += "*";
                            } else if ((i == a || i == c) && isRangeValid) {
                                line += "*";
                            } else {
                                line = printCoordinateSystem(a, b, ymax, ymin, xmax, xmin, j, line, i);
                            }


                        }
                        System.out.print(line);
                        System.out.println();
                    }
                }


            } else if (shapenumber == 4) {
                System.out.println("Parabola formula is y = ax^2 + bx + c");
                System.out.print("Please enter the coefficients a, b and c: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                for (int j = 10; j > -11; j--) {
                    for (int i = -10; i <= 11; i++) {
                        boolean root = a * i * i + b * i + c == j;
                        if (root) {
                            System.out.print("*");
                        } else if (j == 0) {
                            if (i == 0)
                                System.out.print("|");
                            else if (root)
                                System.out.print("*");
                            else if (i == 11)
                                System.out.print("x");
                            else
                                System.out.print("-");
                        } else if (i == 0) {
                            if (root)
                                System.out.print("*");
                            else if (j == 10)
                                System.out.print("y");
                            else
                                System.out.print("|");
                        } else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();

                }
            } else if (shapenumber == 5) {
                System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
                System.out.print("Please enter the coordinates of the center (a,b) and the radius: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int radius = input.nextInt();
                input.nextLine();
                for (int j = 10; j >= -11; j--) {// y ekseni
                    for (int i = -10; i <= 11; i++) { // x ekseni
                        boolean root = Math.pow(i - a, 2) + Math.pow(j - b, 2) == Math.pow(radius, 2);
                        if (root)
                            System.out.print("*");
                        else if (j == 0) {
                            if (i == 0)
                                System.out.print("|");
                            else if (root)
                                System.out.print("*");
                            else if (i == 11)
                                System.out.print("x");
                            else
                                System.out.print("-");
                        } else if (i == 0) {
                            if (j == 10)
                                System.out.print("y");
                            else if (root)
                                System.out.print("*");
                            else
                                System.out.print("|");
                        } else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            } else {
                break;
            }


        }

    }

    public static String printCoordinateSystem(int a, int b, int ymax, int ymin, int xmax, int xmin, int j, String line, int i) {
        if (j == 0) {
            if (i == 0) {
                line += "|";
            } else if (a * i + b == j && (xmin <= i && i <= xmax) && (ymin <= j && j <= ymax)) {
                line += "*";
            } else if (i == 11) {
                line += "x";
            } else {
                line += "-";
            }

        } else if (i == 0)
            if (j == 10) {
                line += "y";

            } else {
                line += "|";
            }
        else {
            line += " ";
        }
        return line;
    }

    public static String modifyLine(String line) {

        if (isLineValid(line)) {
            return line;
        } else {
            int firstIndexOfStar = line.indexOf('*');
            int lastIndexOfStar = line.lastIndexOf('*');
            String newLine = "";
            int length = line.length();
            for (int i = 0; i < length; i++) {
                if (line.charAt(i) == '*') {
                    if ((i == firstIndexOfStar) || (i == lastIndexOfStar)) {
                        newLine += "*";
                    } else {
                        newLine += " ";
                    }
                } else {
                    newLine += line.charAt(i);
                }
            }
            return newLine;
        }
    }

    public static boolean isLineValid(String line) {
        int lineLength = line.length();
        int midIndex = (lineLength - 1) / 2;
        return line.charAt(midIndex) != '|' || !line.contains("*");
    }

    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        // y - y1 = m(x-x1) -> y = mx - mx1 + y1
        double slope;
        if ((x1 - x2) == 0) {
            slope = 0;
        } else {
            slope = (double) (y1 - y2) / (x1 - x2);
        }
        return slope;
    }

    public static double calculateConstant(int x1, int y1, int x2, int y2) {
        // y - y1 = m(x-x1) -> y = mx - mx1 + y1
        double slope = calculateSlope(x1, y1, x2, y2);
        return -slope * x1 + y1;
    }


}