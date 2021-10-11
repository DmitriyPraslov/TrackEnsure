package scanFolder;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\test");
        scanFolder(file);
    }
    public static File[] scanFolder (File file){
        File[] fileList = file.listFiles();
        for (File temp : fileList){
            if (temp.isDirectory()){
                System.out.println(temp.getName());
                scanFolder(temp);
            } else {
                System.out.println("    " + temp.getName());
            }
        }
        return fileList;
    }
}
