package mx.iteso.ut;
/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
     * Variable.
     */
    private Queso queso;
    /**
     * Variable.
     */
    private Tortilla tortilla;
    /**
     * Variable.
     */
    private Tortilla tortilla2;
    /**
     * Variable.
     */
    private int heatLevel;
    /**
     * Metodo.
     * @return el valor de que tan buena quedo la quesadilla.
     */
    public final String prepareSingle() {


        while (
                getQueso().getCurrentTemperature()
                        < getQueso().getMeltingTemperature()
                        && getTortilla().getCurrentTemperature()
                        < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().
                    getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                    + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted() && getTortilla().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }
    /**
     * metodo double.
     * @return The quesadilla message status.
     */
    public final String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().
                    getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().
                    getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().
                    getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
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
        if (getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if ((getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla2().isToasted()) || (getQueso().isMelted()
                && getTortilla().isToasted() && !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        }
        if ((!getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla2().isToasted())
                || (!getQueso().isMelted()
                && getTortilla().isToasted()
                && !getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }
    /**
     * Metodo.
     * @return regresa el valor de que tan buena quedo la quesadilla doble.
     */
    public final Queso getQueso() {
        return queso;
    }
    /**
     * Metodo.
     * @param q is a variable.
     */
    public final void setQueso(final Queso q) {
        this.queso = q;
    }

    /**
     * Metodo.
     * @return el valor de tortilla.
     */
    public final Tortilla getTortilla() {
        return tortilla;
    }
    /**
     * Metodo.
     * @param t is a variable.
     */
    public final void setTortilla(final Tortilla t) {
        this.tortilla = t;
    }

    /**
     * Metodo.
     * @return el valor de tortilla.
     */
    public final Tortilla getTortilla2() {
        return tortilla2;
    }
    /**
     * Metodo.
     * @param t2 is a variable.
     */
    public final void setTortilla2(final Tortilla t2) {
        this.tortilla2 = t2;
    }
    /**
     * Metodo.
     * @return el valor de heatlevel.
     */
    public final int getHeatLevel() {
        return heatLevel;
    }
    /**
     * Metodo.
     * @param h is a variable.
     */
    public final void setHeatLevel(final int h) {
        this.heatLevel = h;
    }
}