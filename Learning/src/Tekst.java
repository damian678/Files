import java.io.*;
import java.util.*;

public class Tekst
{
        public String funkcja(String nazwaSkad,String nazwaZa, String tekst) throws IOException
    {

        File file=new File(nazwaSkad);
        int linia=1;
        ArrayList<String> list=new ArrayList<String>();
        String l="",s,k,o,p="";

        Scanner scanner=new Scanner(file);
        while(scanner.hasNextLine())
        {
            l = linia + ": " + scanner.nextLine();
            list.add(l);
            linia++;
            for (int i = 0; i < l.length(); i++)
            {
                s = l.substring(i, l.length());
                o = s.concat("-----------");
                k = o.substring(0, tekst.length());
                if (k.equals(tekst))
                {
                    p=p.concat(l+"\n");
                }
            }
        }

        FileWriter plik=new FileWriter(nazwaZa);
        plik.write(p);
        plik.close();
        return p;

    }
    public static void main(String[] args) throws IOException
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Podaj nazwę pliku wejściowego: ");
        String nazwa=scanner.nextLine();
        System.out.print("Podaj tekst: ");
        String tekst=scanner.nextLine();
        System.out.print("Podaj nazwę pliku do którego mam zapisać: ");
        String nowa=scanner.nextLine();

        Tekst zdania=new Tekst();
        String s=zdania.funkcja(nazwa,nowa,tekst);
        System.out.println(s);
    }

}
