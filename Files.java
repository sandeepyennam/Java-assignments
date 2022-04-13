import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Files {
    public static void main(String[] args)
    {
        ArrayList<File> ListOfFiles=new ArrayList<>();
        String mainDir = "/home/Desktop";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);

        System.out.println("Content of Directory " + mainDir
                + " is");
        while (!s.empty()) {
            File tmpF = s.pop();

            if (tmpF.isFile()) {

                ListOfFiles.add(tmpF);
//                    System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {

                File[] f = tmpF.listFiles();
                for (File fpp : f) {
                    s.push(fpp);
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        String pattern =sc.nextLine();

        for(File f:ListOfFiles)
        {


            String filenamestr=f.getName();
            if(filenamestr.matches("(.*)"+pattern+"(.*)"))
            {
                Path path= Paths.get(f.getName());
                System.out.println(path.toAbsolutePath());
            }


        }

    }



}