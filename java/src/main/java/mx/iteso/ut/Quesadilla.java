package mx.iteso.ut;

/**
 * Clase quesadilla.
 *
 */
public class Quesadilla {
    /**
     * Queso.
     */
    private Queso queso;
    /**
     * Tortilla1 (se usa para la sencilla y la doble).
     */
    private Tortilla tortilla1;
    /**
     * Tortilla2 (se usa solamente para la doble).
     */
    private Tortilla tortilla2;
    /**
     * Calor de la quesadilla.
     */
    private int heatLevel;

    /**
     * Clase que prepara una quesadilla sencilla.
     * @return una quesadilla.
     */
    public String prepareSingle() {
     while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            &&
            getTortilla1().getCurrentTemperature()
            < getTortilla1().getToastTemperature()) {
                getTortilla1().setCurrentTemperature(getTortilla1().
                getCurrentTemperature() + getHeatLevel());
                getQueso().setCurrentTemperature(getQueso().
                getCurrentTemperature() + getHeatLevel());
                if (getTortilla1().getCurrentTemperature()
                    >= getTortilla1().getToastTemperature()) {
                        getTortilla1().toast(true);
                    }
                if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                        getQueso().melt(true);
                    }
     }

     if (getQueso().isMelted() && getTortilla1().isToasted()) {
        return "Perfect quesadilla";
     }
     if (getQueso().isMelted() && !getTortilla1().isToasted()) {
        return "Good quesadilla";
     }
     if (!getQueso().isMelted() && getTortilla1().isToasted()) {
        return "Terrible quesadilla";
     } else {
        return "You ran out of gas";
     }
    }

    /**
     * @return una quesadilla doble.
     */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
            < getQueso().getMeltingTemperature()
            && getTortilla1().getCurrentTemperature()
            < getTortilla1().getToastTemperature()
            && getTortilla2().getCurrentTemperature()
            < getTortilla2().getToastTemperature()) {
            getTortilla1().setCurrentTemperature(
                getTortilla1().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(
                getTortilla2().getCurrentTemperature() + getHeatLevel());
             getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel());
             if (getTortilla1().getCurrentTemperature()
                >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
             }
             if (getTortilla2().getCurrentTemperature()
                >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
             }
             if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
             }
         }

        if (getQueso().isMelted() && getTortilla1().isToasted()
            && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && getTortilla1().isToasted()
            && !getTortilla2().isToasted()) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla1().isToasted()
            && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla1().isToasted()
            && getTortilla2().isToasted()) {
            return "Mala quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla1().isToasted()
            && !getTortilla2().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }


    }

    /**
     * @return regresa el queso.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * @param q asigna el queso.
     */
    public void setQueso(final Queso q) {
        this.queso = q;
    }

    /**
     * @return la tortilla1.
     */
    public Tortilla getTortilla1() {
        return tortilla1;
    }

    /**
     * @param tortilla asigna una tortilla a tortilla1.
     */
    public void setTortilla1(final Tortilla tortilla) {
        this.tortilla1 = tortilla;
    }

    /**
     * @return la tortilla2.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * @param tortilla asigna una tortilla a tortilla2.
     */
    public void setTortilla2(final Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }

    /**
     * @return el nivel de calor.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * @param hL asigna el nivel de calor.
     */
    public void setHeatLevel(final int hL) {
        this.heatLevel = hL;
    }
}
