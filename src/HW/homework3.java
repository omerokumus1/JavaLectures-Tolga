package HW;

import java.util.Scanner;

public class homework3 {
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
                    for (int i = -10; i <= 11; i++) { // x ekseni
// -5 3 0 6 5 3
//                        if (xmin <= i && i <= xmax && ymin <= j && j <= ymax) {
                        if (Math.round(k * i + l) == j)
                            System.out.print("*");
                        else if (Math.round(m * i + n) == j)
                            System.out.print("*");
                        else if (Math.round(t * i + p) == j)
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
//                        }
                        else {
                            System.out.print(" ");
                        }


                    }
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
                int g = c + e - a;
                int h = f + d - b;
                for (int j = 10; j >= -11; j--) {// y ekseni
                    for (int i = -10; i <= 11; i++) { // x ekseni
                        if (j == 0) {
                            if (i == 0)
                                System.out.print("|");

                            else if (i == 11)
                                System.out.print("x");
                            else
                                System.out.print("-");

                        } else if (i == 0) {
                            if (j == 10)
                                System.out.print("y");
                            else
                                System.out.print("|");
                        } else if (j == b || j == f)
                            i = a;
                        while (i <= c) {
                            System.out.print("*");
                            i++;
                        }


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

    public static double calculateSlope(int x1, int y1, int x2, int y2) {
        // y - y1 = m(x-x1) -> y = mx - mx1 + y1
        double slope;
        if ((x1 - x2) == 0) {
            slope = 0;
        } else {
            slope = (double) (y1 - y2) / (x1 - x2);
        }
//        slope = (int) (slope * 100) / 100.0;
        return slope;
    }

    public static double calculateConstant(int x1, int y1, int x2, int y2) {
        // y - y1 = m(x-x1) -> y = mx - mx1 + y1
        double slope = calculateSlope(x1, y1, x2, y2);
        double constant = -slope * x1 + y1;
//        constant = (int) (constant * 100) / 100.0;
        return constant;
    }
}