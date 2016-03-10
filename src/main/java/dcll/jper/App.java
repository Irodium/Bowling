package dcll.jper;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer la séquence de lancés.");

        String str = scan.nextLine();
        System.out.println("Vous avez saisi : " + str);


        Analyse analyzer = new Analyse();

        String finale = new String();

        analyzer.test(str);

        if (analyzer.bool)
            finale = "correcte";
        else
            finale = "incorrecte";

        System.out.println("Votres chaine est "+ finale);

        System.out.println(analyzer.tab.toString());
        System.out.println(analyzer.tab.size());


    }
}
