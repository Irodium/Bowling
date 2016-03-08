package dcll.jper;

/**
 * Created by 21503800 on 08/03/2016.
 */
public class Quille
{
    private boolean fallen;

    public Quille()
    {
        fallen = false;
    }

    public Quille(boolean fallen) {
        this.fallen = fallen;
    }

    public boolean isFallen() {
        return fallen;
    }

    public void setFallen(boolean fallen) {
        this.fallen = fallen;
    }


}
