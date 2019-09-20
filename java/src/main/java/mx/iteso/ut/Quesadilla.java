package mx.iteso.ut;

/**
 * Quesadilla.
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
    private Tortilla tortillaDos;

    /** Preparar una quesadilla con tortilla simple.
     @return string with result.
     */
    public final String prepareSingle(){


     while(getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature()
            && getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature()){
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

     /** Preparar una quesadilla con tortilla doble.
            @return string con resultados.
     */
    public final String prepareDouble(){
        while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature() && getTortillaDos().getCurrentTemperature()< getTortillaDos().getToastTemperature()){
         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         getTortillaDos().setCurrentTemperature(getTortillaDos().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
         if (getTortillaDos().getCurrentTemperature() >= getTortillaDos().getToastTemperature()) {
             getTortillaDos().toast(true);
         }
     }

     if(getQueso().isMelted() && getTortilla().isToasted() && getTortillaDos().isToasted()) {
         return "Perfect quesadilla";
     }
     if(getQueso().isMelted() && (getTortilla().isToasted() || getTortillaDos().isToasted())) {
         return "Good quesadilla";
     }
     if(getQueso().isMelted() && !getTortilla().isToasted() && !getTortillaDos().isToasted()) {
         return "Regular quesadilla";
     }
     if(!getQueso().isMelted() && getTortilla().isToasted() && getTortillaDos().isToasted()) {
         return "Bad quesadilla";
     }
     if(!getQueso().isMelted() && (getTortilla().isToasted() || getTortillaDos().isToasted())) {
         return "Terrible quesadilla";
     } else {
         return "You ran out of gas";
     }

    }

    /** Getter queso.
        @return queso.
     */
    public final Queso getQueso() {
        return queso;
    }

    /** Setter queso.
        @param quesoSet queso.
     */
    public final void setQueso(final Queso quesoSet) {
        this.queso = quesoSet;
    }

    /** Getter tortilla.
        @return tortilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }

    /** Setter tortilla.
        @param tortillaSet tortilla.
     */
    public final void setTortilla(final Tortilla tortillaSet) {
        this.tortilla = tortillaSet;
    }

    /** Getter heat.
        @return heat.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }

    /** Setter heat.
        @param heatLevelSet nivel de calor.
     */
    public final void setHeatLevel(final int heatLevelSet) {
        this.heatLevel = heatLevelSet;
    }

    /** Getter tortilla dos.
        @return tortilla dos.
     */
     public final Tortilla getTortillaDos() {
        return tortillaDos;
    }

    /** Setter tortilla dos.
        @param tortillaSet tortilla.
     */
    public final void setTortillaDos(final Tortilla tortillaSet) {
        this.tortillaDos = tortillaSet;
    }
}
