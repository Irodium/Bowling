package dcll.jper;

import java.util.ArrayList;
import dcll.jper.Quille;
import java.util.Random;

/**
 * Created by 21503800 on 08/03/2016.
 */
public class Piste
{
    private Quille[] jeu;
    private Random rand;

    public Piste()
    {
        jeu = new Quille[10];
        rand = new Random();
    }

    private void reset()
    {
        for(int i =0; i < 10; i++)
        {
            jeu[i].setFallen(false);
        }
    }

    private int score()
    {
        int cpt = 0;

        for(int i =0; i < 10; i++)
        {
            if(jeu[i].isFallen())
                cpt ++;
        }

        return cpt;
    }

    private void lancer()
    {
        for(int i =0; i < 10; i++)
        {
            jeu[i].setFallen(rand.nextBoolean());
        }
    }

    public int jouer()
    {
        reset();
        lancer();
        return score();
    }

}

