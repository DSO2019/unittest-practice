package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla tortilla_2;
    private int heatLevel;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
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
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature() && getTortilla_2().getCurrentTemperature()< getTortilla_2().getToastTemperature()){
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getTortilla_2().setCurrentTemperature(getTortilla_2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                getTortilla().toast(true);
            if (getTortilla_2().getCurrentTemperature() >= getTortilla_2().getToastTemperature())
                getTortilla_2().toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }
        if(getQueso().isMelted() && getTortilla().isToasted() && getTortilla_2().isToasted())
            return "Perfect quesadilla";
        if((getQueso().isMelted() && !getTortilla().isToasted() && getTortilla_2().isToasted()) || (getQueso().isMelted() && getTortilla().isToasted() && !getTortilla_2().isToasted()))
            return "Good quesadilla";
        if(!getQueso().isMelted() && getTortilla().isToasted() && getTortilla_2().isToasted())
            return "Bad quesadilla";
        if((!getQueso().isMelted() && !getTortilla().isToasted() && getTortilla_2().isToasted()) || (!getQueso().isMelted() && getTortilla().isToasted() && !getTortilla_2().isToasted()))
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

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public Tortilla getTortilla_2() {
        return tortilla_2;
    }

    public void setTortilla_2(Tortilla tortilla) {
        this.tortilla_2 = tortilla;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
