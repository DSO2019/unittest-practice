package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla[] tortillas;
    private int heatLevel;

    public String prepareSingle(){


        while(getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()){
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

        while(getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() 
                && getTortillas(0).getCurrentTemperature() < getTortillas(0).getToastTemperature()
                && getTortillas(1).getCurrentTemperature() < getTortillas(1).getToastTemperature()){
            getTortillas(0).setCurrentTemperature(getTortillas(0).getCurrentTemperature() + getHeatLevel());
            getTortillas(1).setCurrentTemperature(getTortillas(1).getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortillas(0).getCurrentTemperature() >= getTortillas(0).getToastTemperature())
                getTortillas(0).toast(true);
            if (getTortillas(1).getCurrentTemperature() >= getTortillas(1).getToastTemperature())
                getTortillas(1).toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }

        if(getQueso().isMelted() && getTortillas(0).isToasted() && getTortillas(1).isToasted())
            return "Quesadilla perfecta";
        if(getQueso().isMelted() && (!getTortillas(0).isToasted() && getTortillas(1).isToasted()) || (getTortillas(0).isToasted() && !getTortillas(1).isToasted()))
            return "Quesadilla buena";
        if(!getQueso().isMelted() && getTortillas(0).isToasted() && getTortillas(1).isToasted())
            return "Quesadilla mala";
        if(!getQueso().isMelted() && (!getTortillas(0).isToasted() && getTortillas(1).isToasted()) || (getTortillas(0).isToasted() && !getTortillas(1).isToasted()))
            return "Quesadilla terrible";
        if(!getQueso().isMelted() && !getTortillas(0).isToasted() && !getTortillas(1).isToasted())
            return "No se cocinó";
        if(getQueso().isMelted() && !getTortillas(0).isToasted() && !getTortillas(1).isToasted())
            return "Quesadilla regular";
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

    public Tortilla getTortillas(int index) {
        return tortillas[index];
    }

    public void setTortillas(Tortilla[] tortillas) {
        this.tortillas = tortillas;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
