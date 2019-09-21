package mx.iteso.ut;

/**
 * Clase Quesadilla, para desarrollo de la práctica.
 */
public class Quesadilla {
    /**
     *  Primer dato es el queso que se mockeara en la preparación.
     */
    private Queso queso;
    /** Tortilla con la que será elaborada la quesadilla sencilla.
     *  Puede corresponder a una de las tortillas de la quesadilla doble.
     */
    private Tortilla tortilla;
    /**
     * Segunda Trotilla de la quesadilla doble.
     */
    private Tortilla tortilla1;
    /**
     *  Nivel de calor aplicado a la quesadilla.
     */
    private int heatLevel;

    /**
     * Clase para preparar una quesadilla sencilla.
     * Incluye una sola tortilla y un tipo de queso.
     * @return  el resultado de la quesadilla.
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
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
        }  else {
            return "You ran out of gas";
        }
    }

    /**
     * Metodo para preparar una quesadilla doble, dos tortillas y queso.
     * @return resultado de la preparación de la quesadilla.
     */
    public String prepareDouble() {

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla1().getCurrentTemperature()
                < getTortilla1().getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla().
                    getCurrentTemperature() + getHeatLevel());
            getTortilla1().setCurrentTemperature(getTortilla1().
                    getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                    + getHeatLevel());
            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getTortilla1().getCurrentTemperature()
                    >= getTortilla1().getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla1().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && getTortilla().isToasted()
                && !getTortilla1().isToasted()) {
            return "Good quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla1().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla1().isToasted()) {
            return "Bad quesadilla";
        }
        if (!getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla1().isToasted()) {
            return "Terrible quesadilla";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
                && !getTortilla1().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }
    }

    /**
     *
     * @return el queso utilizado.
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     *
     * @param quesos agrega el queso a la quesadilla.
     */
    public void setQueso(final Queso quesos) {
        this.queso = quesos;
    }

    /**
     *
     * @return el tipo de tortilla utilizada en la quesadilla sencilla.
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     *
     * @return segunda tortilla de quesadilla doble.
     */
    public Tortilla getTortilla1() {
        return tortilla1;
    }

    /**
     *
     * @param tortillas agrega la tortilla de la quesadilla sencilla.
     */
    public void setTortilla(final Tortilla tortillas) {
        this.tortilla = tortillas;
    }

    /**
     *
     * @param tortillas segunda tortilla de la quesadilla doble.
     */
    public void setTortilla1(final Tortilla tortillas) {
        this.tortilla1 = tortillas;
    }

    /**
     *
     * @return el calor aplicado a las quesadillas.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     *
     * @param heat setea el calor aplicado a las quesadillas.
     */
    public void setHeatLevel(final int heat) {
        this.heatLevel = heat;
    }
}
