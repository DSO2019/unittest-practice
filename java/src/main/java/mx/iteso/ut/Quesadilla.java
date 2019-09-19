package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {

    /** Esto es queso. */
    private Queso queso;
     /** Esto es tortilla. */
    private Tortilla tortilla;
     /** Esto es el nivel de calor de nuestra quesadilla. */
    private int heatLevel;
     /** Esto es una segunda tortilla para una quesadilla con doble tortilla. */
    private Tortilla tortilla_dos;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
     }

     if(getQueso().isMelted() && getTortilla().isToasted()) {
         return "Perfect quesadilla";
     }
     if(getQueso().isMelted() && !getTortilla().isToasted()) {
         return "Good quesadilla";
     }
     if(!getQueso().isMelted() && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }

    }

    public String prepareDouble(){
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature() && getTortilla_dos().getCurrentTemperature()< getTortilla_dos().getToastTemperature()){
         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         getTortilla_dos().setCurrentTemperature(getTortilla_dos().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
         if (getTortilla_dos().getCurrentTemperature() >= getTortilla_dos().getToastTemperature()) {
             getTortilla_dos().toast(true);
         }
     }

     if(getQueso().isMelted() && getTortilla().isToasted() && getTortilla_dos().isToasted()) {
         return "Perfect quesadilla";
     }
     if(getQueso().isMelted() && (getTortilla().isToasted() || getTortilla_dos().isToasted())) {
         return "Good quesadilla";
     }
     if(getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla_dos().isToasted()) {
         return "Regular quesadilla";
     }
     if(!getQueso().isMelted() && getTortilla().isToasted() && getTortilla_dos().isToasted()) {
         return "Bad quesadilla";
     }
     if(!getQueso().isMelted() && (getTortilla().isToasted() || getTortilla_dos().isToasted())) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }

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

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }

     public Tortilla getTortilla_dos() {
        return tortilla_dos;
    }

    public void setTortilla_dos(Tortilla tortilla) {
        this.tortilla_dos = tortilla;
    }
}