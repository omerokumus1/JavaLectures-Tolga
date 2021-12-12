package HW;

// UnitTest
public class HW3Test {
    public static void main(String[] args) {
        String line = "      **  |  **       ";
        modifyLineTest(line);

        line = "      **|**       ";
        modifyLineTest(line);

        line = "        *         ";
        modifyLineTest(line);

        line = "        |         ";
        modifyLineTest(line);


    }

    public static void modifyLineTest(String line){
        line = homework3.modifyLine(line);
        System.out.println(line);
    }
}
