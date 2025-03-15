import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("wyniki.txt"));
        in.useDelimiter("\\PL+");
        while(in.hasNext())
        {
            System.out.println(in.next());
        }
    }
}