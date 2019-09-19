package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
 {
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla tortilla2;
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
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() &&
                tortilla.getCurrentTemperature()< tortilla.getToastTemperature() &&
                tortilla2.getCurrentTemperature() < tortilla2.getToastTemperature()
        ){
            tortilla.setCurrentTemperature(tortilla.getCurrentTemperature() + getHeatLevel());
             tortilla2.setCurrentTemperature(tortilla2.getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());

            if (tortilla.getCurrentTemperature() >= tortilla.getToastTemperature())
                tortilla.toast(true);
            if (tortilla2.getCurrentTemperature() >= tortilla2.getToastTemperature())
                tortilla2.toast(true);
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }

        if(getQueso().isMelted() && tortilla.isToasted() && tortilla2.isToasted())
            return "Perfect quesadilla";
        else if(getQueso().isMelted() && (tortilla.isToasted()  || tortilla2.isToasted()))
            return "Good quesadilla";
        else if(!getQueso().isMelted() && tortilla.isToasted()  && tortilla2.isToasted())
            return "Bad quesadilla";
        else if(!getQueso().isMelted() &&(tortilla.isToasted()  || tortilla2.isToasted()))
            return "Terrible quesadilla";
        else if(!getQueso().isMelted() && !tortilla.isToasted()  && !tortilla2.isToasted())
            return "No se cocino";
        else if(getQueso().isMelted() && !tortilla.isToasted()  && !tortilla2.isToasted())
            return "Regular quesadilla";
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

    public void setTortillaDouble(Tortilla tortilla, Tortilla tortilla2) {
        this.tortilla = tortilla;
        this.tortilla2 = tortilla2;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
