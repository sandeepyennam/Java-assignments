import com.sun.source.tree.TryTree;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Assignment11{
    public static void main(String[] args) {
        HashMap<Character,Integer> mp=new HashMap<>();
        Scanner sc;
        try {
            sc=new Scanner(new File("input.txt"));
            PrintWriter pw=new PrintWriter("output.txt");
            while(sc.hasNext())
            {
                String str=sc.nextLine();

                System.out.println(str);
                for(int i=0;i<str.length();i++)
                {
                    if(!mp.containsKey(str.charAt(i)))
                    {
                        mp.put(str.charAt(i),1);
                    }
                    else
                    {
                        mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
                    }

                }
            }
            for(Character key:mp.keySet())
            {
                System.out.println(key+" "+mp.get(key));
                pw.println(key+" "+mp.get(key));

            }
            sc.close();
            pw.close();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }
}
