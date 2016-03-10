package dcll.jper;


import dcll.jper.Joueur;
import dcll.jper.Piste;

public class App 
{
    public static void main( String[] args )
    {
        Joueur j = new Joueur();
        Piste p = new Piste();

        j.jouer(p);
        System.out.println(j.compter());

    }
}
