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
        String mainDir = "/home/sandK";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);

        System.out.println("Content of Directory " + mainDir
                + " is");
        while (!s.empty()) {
            File tmpF = s.pop();

            if (tmpF.isFile()) {

                ListOfFiles.add(tmpF);
                System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {

                File[] f = tmpF.listFiles();
                for (File f2 : f) {
                    s.push(f2);
                }
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern of string");
        String pattern =sc.nextLine();

        for(File f:ListOfFiles)
        {


            String filename=f.getName();
            if(filename.matches("(.*)"+pattern+"(.*)"))
            {
                Path path= Paths.get(f.getName());
                System.out.println(path.toAbsolutePath());
            }
            else
                System.out.println("no files in given pattern");


        }

    }



}