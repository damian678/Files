import java.io.*;
import java.util.Scanner;

public class BMI
{

    public static void strona(String skad, String dokad) throws IOException
    {
        File plik = new File(skad);
        Scanner scanner = new Scanner(plik);
        String a, b,c = "";

        Writer output = new BufferedWriter(new FileWriter(dokad, true));
        output.append("<html><body>\n");
        output.append("<table>\n");
        while (scanner.hasNextLine())
        {
            a = scanner.nextLine();
            c = a.concat("\n");
            b = "<tr><td>" + c.replace(" ", "</td><td>") + "</td></tr>\n";
            output.append(b);
        }
        output.append("</table>\n");
        output.append("</body></html>\n");
        output.close();
    }

    public static void main(String[] args) throws IOException
    {
        String skad = "daneZPlikuTekstowego.txt";
        String dokad = "daneDoPlikuZKodem.html";
        BMI bmi = new BMI();
        bmi.strona(skad, dokad);
    }
}
