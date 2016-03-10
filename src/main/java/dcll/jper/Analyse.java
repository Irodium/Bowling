package dcll.jper;

import java.util.ArrayList;

/**
 * Created by 21503800 on 10/03/2016.
 */
public class Analyse
{
    public ArrayList<String> tab;
    public String seq;
    public boolean bool;

    public Analyse()
    {
        tab = new ArrayList<String>();
        seq = new String();
        bool = true;
    }

    public void test(String str)
    {

        String tmp = new String("");

        for(int i =0; i<str.length(); i++)
        {
//            if(str.charAt(i) == 'X' && str.charAt(i+1) != '|')
//                bool = false;
//
//            if(
//                    ((str.charAt(i) == '0')||(str.charAt(i) == '1')||(str.charAt(i) == '2')||
//                (str.charAt(i) == '3')||(str.charAt(i) == '4')||(str.charAt(i) == '5')||
//                    (str.charAt(i) == '6')||(str.charAt(i) == '7')||(str.charAt(i) == '8')||
//                    (str.charAt(i) == '9'))
//                &&((str.charAt(i+1) != '*')||(str.charAt(i+1) != '0')||(str.charAt(i+1) != '1')||(str.charAt(i+1) != '2')||
//                            (str.charAt(i+1) != '3')||(str.charAt(i+1) != '4')||(str.charAt(i+1) != '5')||
//                            (str.charAt(i+1) != '6')||(str.charAt(i+1) != '7')||(str.charAt(i+1) != '8')||
//                            (str.charAt(i+1) != '9'))
//                    )
//                bool = false;



            if(str.charAt(i) == '|')
            {
                tab.add(tmp);
                tmp = "";
            }
            else
            {
                tmp += str.charAt(i);
            }
        }
        tab.add(tmp);


        if(tab.size() != 10 || tab.size() != 11 || tab.size() != 12)
        {
            bool = false;
        }
    }


}


