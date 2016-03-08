package dcll.jper;

import dcll.jper.Piste;

/**
 * Created by 21503800 on 08/03/2016.
 */
public class Joueur
{
    private int[] tab;
    private int[] tabstrsp;
    private int total;

    public Joueur()
    {
        tab = new int[12];
        for(int i =0; i <12; i++)
        {
            tab[i] =0;
        }

        tabstrsp = new int[10];
        for(int i =0; i <10; i++)
        {
            tabstrsp[i] =0;
        }
        total = 0;
    }

    public void jouer(Piste p)
    {
        for(int i= 0; i<10; i++)
        {
            tab[i] = p.jouer();
            if(p.isSpare())
                tabstrsp[i] = 1;
            else if(p.isStrike())
                tabstrsp[i] = 2;
            else
                tabstrsp[i] =0;

        }

        if(tabstrsp[9] == 2)
        {
            tab[10] = p.jouer();
            tab[11] = p.jouer();
        }
        else if((tabstrsp[9] == 1)||(tabstrsp[8]==2))
        {
            tab[10] = p.jouer();
        }
    }


    public int compter()
    {
        int cpt = 0;

        for(int i =0; i<12; i++)
        {
            if(tabstrsp[i]==1)
            {
                cpt += tab[i];
                cpt += tab[i+1];
            }
            else if (tabstrsp[i] == 2)
            {
                cpt += tab[i];
                cpt += tab[i+1];
                cpt += tab[i+2];

            }
        }

        return cpt;
    }
}
