import java.util.Scanner;

public class MAIN {
    public static void main(String args[])
    {
        Scanner F= new Scanner(System.in);
        String kniga=F.next();
        System.out.println(kniga);
        String a="FIZICKA";
        if(a.equals(kniga))
        {

            Ebook obj= new Ebook();


            Scanner naslov= new Scanner(System.in);
            obj.setNaslov(naslov.next());
            Scanner isdn= new Scanner(System.in);
            obj.setISBN(isdn.next());
            Scanner god= new Scanner(System.in);
            obj.setGodina_izdavanje(god.nextInt());
            Scanner mb= new Scanner(System.in);
            obj.setGolemina_MB(mb.nextInt());
            Scanner knigaa= new Scanner(System.in);
            String pmg=knigaa.next();
            if(pmg.equals("HTML5")) {

                obj.setFormat(Ebook.ebook.HTML5);
            }
            System.out.println(obj.toString());
        }else
        {
            PrintCopy oj= new PrintCopy("simona", "simes", 222, 22, 222);
            System.out.println(oj.getBr_strani());
        }




    }
}
