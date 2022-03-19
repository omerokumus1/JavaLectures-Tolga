package HW.LabHomeworkCompany;

import java.io.FileNotFoundException;

public class Test3 {
    public static void main(String[] args) throws Exception {
        FileOperator fileOperator = new FileOperator("src/HW/LabHomeworkCompany/CSE1242_spring2022_homework_1_input.txt");
        fileOperator.createScannerWithFile();
        ObjectMaker objectMaker = new ObjectMaker();


        while (fileOperator.hasNextLine()){
            Object o = objectMaker.createObject(fileOperator.getNextLine());
            objectMaker.addObject(o);
        }
        System.out.println(objectMaker);

    }
}
