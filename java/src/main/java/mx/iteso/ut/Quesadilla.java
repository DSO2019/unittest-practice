package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla tortilla1;
    private int heatLevel;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature())
     {
         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
             getTortilla().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
     }

     if(getQueso().isMelted() && getTortilla().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";

    }

    public String prepareDouble(){
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()
                && getTortilla1().getCurrentTemperature() < getTortilla1().getToastTemperature()){
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                getTortilla().toast(true);
            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature())
                getTortilla1().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }

        if(getQueso().isMelted() && getTortilla().isToasted() && getTortilla1().isToasted())
            return "Perfect quesadilla";
        if(getQueso().isMelted() && getTortilla().isToasted() && !getTortilla1().isToasted())
            return "Good quesadilla";
        if(!getQueso().isMelted() && getTortilla().isToasted() && getTortilla1().isToasted())
            return "Bad quesadilla";
        if(!getQueso().isMelted() && !getTortilla().isToasted() && getTortilla1().isToasted())
            return "Terrible quesadilla";
        else
            return "You ran out of gas";

    }

    public Queso getQueso() {
        return queso;
    }

    public void setQueso(Queso queso) {
        this.queso = queso;
    }


    public Tortilla getTortilla() {
        return tortilla;
    }

    public Tortilla getTortilla1() {
        return tortilla1;
    }

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public void setTortilla1(Tortilla tortilla) {
        this.tortilla1 = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
