import java.io.*;
import java.util.*;

public class Znaki
{
//    FileWriter plik = new FileWriter("nazwa_pliku.txt");//zapisanie pliku
//        plik.write("Ala ma kota, a kot ma Alę");//zapis w pliku
//        plik.close();
//        File file=new File ("nazwa_pliku.txt");//odczyt z pliku
//        Scanner in = new Scanner(file);
//        String zdanie = in.nextLine();
//        System.out.println(zdanie);
//        file.delete();//usuwa pik

    public String liczznaki(String zawartosc) throws IOException
    {
        int ilosc=zawartosc.length();

        String a;
        int znaki=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(0);
        for(int i=0;i<zawartosc.length();i++)
        {
            a=""+zawartosc.charAt(i);
            if(a.equals(" "))
            {
                znaki++;
                list.add(i);
            }
        }
        list.add(zawartosc.length());

        String b;
        String c;
        int iloscSlow=0;
        for(int j=1;j<=list.indexOf(zawartosc.length());j++)
        {
            b=zawartosc.substring(list.get(j-1),list.get(j));
            c=b.trim();

            iloscSlow++;
        }

        int [] tab=new int[3];
        tab[0]=ilosc;
        tab[1]=znaki;
        tab[2]=iloscSlow;
        String odpowiedz="W tekście jest: znaków: "+tab[0]+ ", znaków białych: "+tab[1]+", a słów: "+tab[2];

        return odpowiedz;
    }
    public static void main(String[] args) throws IOException
    {
        File plik=new File("DamianBilski.txt");
        Scanner scanner=new Scanner(plik);
        String zawartosc=scanner.nextLine();
        Znaki dam=new Znaki();
        String odp=dam.liczznaki(zawartosc);
        System.out.println(odp);
    }

}
