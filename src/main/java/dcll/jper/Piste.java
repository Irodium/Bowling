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
    private boolean strike;
    private boolean spare;

    public Piste()
    {
        jeu = new Quille[10];
        for(int i =0; i < jeu.length; i++)
        {
            jeu[i] = new Quille();
        }
        rand = new Random();
        strike = false;
        spare = false;

    }

    private void reset()
    {
        for(int i =0; i < jeu.length; i++)
        {
            jeu[i].setFallen(false);
        }
        strike = false;
        spare = false;
    }

    private int score()
    {
        int cpt = 0;

        for(int i =0; i < jeu.length; i++)
        {
            if(jeu[i].isFallen())
                cpt ++;
        }

        return cpt;
    }

    private void lancer()
    {
        for(int i =0; i < jeu.length; i++)
        {
            jeu[i].setFallen(rand.nextBoolean());
        }

        if(score() == 10)
        {
            strike = true;
        }

    }

    private void lancer2()
    {
        for(int i =0; i < jeu.length; i++)
        {
            if(!jeu[i].isFallen())
                jeu[i].setFallen(rand.nextBoolean());
        }

        if(score() == 10)
        {
            spare = true;
        }
    }

    public boolean isStrike() {
        return strike;
    }

    public void setStrike(boolean strike) {
        this.strike = strike;
    }

    public boolean isSpare() {
        return spare;
    }

    public void setSpare(boolean spare) {
        this.spare = spare;
    }

    public int jouer()
    {
        reset();
        lancer();
        if(strike == false)
            lancer2();

        int tmp = score();
        return tmp;
    }

}

