package mx.iteso.ut;
/**
 * Hello world!
 *
 */
public class Quesadilla {
    /** Queso para la quesadilla. */
    private Queso queso;
    /** Tortilla simple. */
    private Tortilla tortilla;
    /** Tortilla arriba doble. */
    private Tortilla tortilla1;
    /** Tortilla abajo doble. */
    private Tortilla tortilla2;
    /** Nivel de calor. */
    private int heatLevel;

    /**  Método para preparar una tortilla simple.
     *  @return String Contiene el resultado de la cocción.
    */
    public String prepareSingle() {
        while(
            getQueso().getCurrentTemperature() <
                getQueso().getMeltingTemperature()
            && getTortilla().getCurrentTemperature() <
                getTortilla().getToastTemperature()) {

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
        }
        else{
            return "You ran out of gas";
        }
    }

    /** Método que prepara una quesadilla doble.
     *  @return String Contiene el resultado de la cocción.
    */
    public String prepareDouble() {

        while(
            getQueso().getCurrentTemperature() <
                getQueso().getMeltingTemperature()
            && getTortilla1().getCurrentTemperature() <
                getTortilla1().getToastTemperature()
                && getTortilla2().getCurrentTemperature() <
                getTortilla2().getToastTemperature()) {

            getTortilla1().setCurrentTemperature(getTortilla1().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortilla1().getCurrentTemperature() >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        // tortilla 1 tostada, tortilla 2 tostada, queso derretido.
        if(getQueso().isMelted() && getTortilla1().isToasted() 
            && getTortilla2().isToasted()) {
            return "Perfect double quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido.
        else if(getQueso().isMelted() && !getTortilla1().isToasted()
            && getTortilla2().isToasted()) {
            return "Good double quesadilla toasted2";
        }
        // tortilla 1 tostada, tortilla 2 no tostada, queso derretido.
        else if(getQueso().isMelted() && getTortilla1().isToasted()
            && !getTortilla2().isToasted()) {
            return "Good double quesadilla toasted1";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido.
        else if(getQueso().isMelted() && !getTortilla1().isToasted() 
            && !getTortilla2().isToasted()) {
            return "Regular double quesadilla";
        }
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido.
        else if(!getQueso().isMelted() && getTortilla1().isToasted() 
            && getTortilla2().isToasted()) {
            return "Bad double quesadilla";
        }
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido.
        else if(!getQueso().isMelted() && !getTortilla1().isToasted() 
            && getTortilla2().isToasted()) {
            return "Terrible double quesadilla toasted2";
        }
        // tortilla 1 tostada, tortilla 2 no tostada, queso no derretido.
        else if(!getQueso().isMelted() && getTortilla1().isToasted()
            && !getTortilla2().isToasted()) {
            return "Terrible double quesadilla toasted1";
        }
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido.
        else
            return "Not cooked double quesadilla";
    }

    /** Getter para el queso. */
    public Queso getQueso() {
        return this.queso;
    }

    /** Setter para el queso. */
    public void setQueso(Queso queso) {
        this.queso = queso;
    }


    /** Getter para la tortilla en quesadilla simple. */
    public Tortilla getTortilla() {
        return this.tortilla;
    }

    /** Getter para la tortilla de arriba en quesadilla doble. */
    public Tortilla getTortilla1() {
        return this.tortilla1;
    }

    /** Getter para la tortilla de abajo en quesadilla doble. */
    public Tortilla getTortilla2() {
        return this.tortilla2;
    }

    /** Setter para las tortillas en quesadilla doble. */
    public void setTortillas(Tortilla tortilla1,Tortilla tortilla2) {
        this.tortilla1 = tortilla1;
        this.tortilla2 = tortilla2;
    }

    /** Setter para la tortilla en quesadilla simple. */
    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    /** Getter para el nivel de calor. */
    public int getHeatLevel() {
        return this.heatLevel;
    }

    /** setter para el nivel de calor. */
    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
}
