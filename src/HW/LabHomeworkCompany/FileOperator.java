package HW.LabHomeworkCompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperator {
    private File file;
    private Scanner scanner;

    FileOperator(String fileName){
        file = new File(fileName);
    }

    FileOperator(File file){
        this.file = file;
    }

    public void createScannerWithFile() throws FileNotFoundException {
        scanner = new Scanner(file);
    }

    public void createScannerWith(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
    }

    public String getNextLine(){
        if (scanner != null && scanner.hasNextLine())
            return scanner.nextLine();
        return null;
    }

    public boolean hasNextLine(){
        return scanner.hasNextLine();
    }



//    arrayList.add(objectMaker.createObject(fo.getNextLine()))


}
