import java.io.*;
import java.util.Scanner;

public class Emerytura
{
        public static void emerytura (String nazwaPliku) throws IOException
    {
        File file=new File(nazwaPliku);
        Scanner scanner=new Scanner(file);
        String a,b,d,f,r,plec="";
        int c,g;
        String kobiety="",mezczyzni="";
        while(scanner.hasNextLine())
        {
            a=scanner.nextLine();
            b=a.substring(a.length()-2,a.length());
            r=a.substring(a.length()-4,a.length());
            plec=a.substring(a.length()-4,a.length()-3);

            c=Integer.parseInt(b);
            g=67-c;
            f=""+g;
            d=a.replace(r,f);


            if(plec.equals("K"))
            {
                kobiety=kobiety.concat(d+"\n");
            }
            else if(plec.equals("M"))
            {
                mezczyzni=mezczyzni.concat(d+"\n");
            }
        }

        FileWriter plik=new FileWriter("kobiety.txt");
        plik.write(kobiety);
        plik.close();
        FileWriter plikm=new FileWriter("mezczyzni.txt");
        plikm.write(mezczyzni);
        plikm.close();

    }
    public static void main(String[] args) throws IOException
    {
        String nazwa="Emerytura.txt";
        Emerytura emerytura=new Emerytura();
        emerytura.emerytura(nazwa);

    }
}

