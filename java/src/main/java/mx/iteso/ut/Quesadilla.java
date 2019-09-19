
package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla_1;
    private Tortilla tortilla_2;
    private int heatLevel;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla_1().getCurrentTemperature()< getTortilla_1().getToastTemperature()){
        getTortilla_1().setCurrentTemperature(getTortilla_1().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla_1().getCurrentTemperature() >= getTortilla_1().getToastTemperature())
         getTortilla_1().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
     }

     if(getQueso().isMelted() && getTortilla_1().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla_1().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla_1().isToasted())
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

        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla_1().getCurrentTemperature()< getTortilla_1().getToastTemperature() && getTortilla_2().getCurrentTemperature()< getTortilla_2().getToastTemperature()){
            
            getTortilla_1().setCurrentTemperature(getTortilla_1().getCurrentTemperature() + getHeatLevel());
            getTortilla_2().setCurrentTemperature(getTortilla_2().getCurrentTemperature() + getHeatLevel());
             getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
             if (getTortilla_1().getCurrentTemperature() >= getTortilla_1().getToastTemperature())
                getTortilla_1().toast(true);
             if (getTortilla_2().getCurrentTemperature() >= getTortilla_2().getToastTemperature())
                getTortilla_2().toast(true);
             if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                 getQueso().melt(true);
         }
    
         if(getQueso().isMelted() && getTortilla_1().isToasted() && getTortilla_2().isToasted())
             return "Perfect quesadilla";
         if(getQueso().isMelted() && getTortilla_1().isToasted() && !getTortilla_2().isToasted())
             return "Good quesadilla";
         if(getQueso().isMelted() && !getTortilla_1().isToasted() && !getTortilla_2().isToasted())
             return "Regular quesadilla";
         if(!getQueso().isMelted() && getTortilla_1().isToasted() && getTortilla_2().isToasted())
             return "Mala quesadilla";
         if(!getQueso().isMelted() && getTortilla_1().isToasted() && !getTortilla_2().isToasted())
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


    public Tortilla getTortilla_1() {
        return tortilla_1;
    }

    public void setTortilla_1(Tortilla tortilla) {
        this.tortilla_1 = tortilla;
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
