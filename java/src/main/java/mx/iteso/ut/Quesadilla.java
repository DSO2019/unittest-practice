package mx.iteso.ut;
/**
 * Hello world!
 */
public class Quesadilla {

    /**
     * Declarar queso.
     */
    private Queso queso;

    /**
     * Declarar tortillas.
     */
    private Tortilla tortilla, tortilla2;

    /**
     * Declarar nivel de calentamiento.
     */
    private int heatLevel;

    /**
     * Preparar quesadilla sencilla.
     *
     * @return estado de la quesadilla
     */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()) {

            getTortilla()
                    .setCurrentTemperature(
                            getTortilla().getCurrentTemperature()
                                    + getHeatLevel()
                    );

            getQueso()
                    .setCurrentTemperature(
                            getQueso().getCurrentTemperature()
                                    + getHeatLevel()
                    );

            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted()
                && getTortilla().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
                && !getTortilla().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
                && getTortilla().isToasted()) {
            return "Terrible quesadilla";
        } else {
            return "You ran out of gas";
        }

    }

    /**
     * Preparar quesadilla doble.
     *
     * @return estado de la quesadilla
     */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla()
                    .setCurrentTemperature(
                            getTortilla().getCurrentTemperature()
                                    + getHeatLevel()
                    );

            getTortilla2()
                    .setCurrentTemperature(
                            getTortilla2().getCurrentTemperature()
                                    + getHeatLevel()
                    );

            getQueso()
                    .setCurrentTemperature(
                            getQueso().getCurrentTemperature()
                                    + getHeatLevel()
                    );

            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }

            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }

            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }
        }

        if (getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted()
                && ((getTortilla().isToasted()
                && !getTortilla2().isToasted())
                || (!getTortilla().isToasted()
                && getTortilla2().isToasted()))) {
            return "Good quesadilla";
        }
        if (!getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Bad quesadilla";
        }
        if (getQueso().isMelted()
                && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Regular quesadilla";
        }
        if (!getQueso().isMelted()
                && ((getTortilla().isToasted()
                && !getTortilla2().isToasted())
                || (!getTortilla().isToasted()
                && getTortilla2().isToasted()))) {
            return "Terrible quesadilla";
        } else {
            return "Not cooked";
        }
    }

    /**
     * Obtener queso.
     * @return queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * setqueso.
     * @param aQueso queso
     */
    public void setQueso(
            final Queso aQueso
    ) {
        this.queso = aQueso;
    }

    /**
     * Obtener tortilla.
     * @return tortilla
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Obtener tortilla número 2.
     * @return tortilla2
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * Asignar valor tortilla.
     * @param aTortilla tortilla
     */
    public void setTortilla(
            final Tortilla aTortilla
    ) {
        this.tortilla = aTortilla;
    }

    /**
     * Asignar ambas tortillas.
     * @param aTortilla tortilla
     * @param aTortilla2 tortilla2
     */
    public void setTortillaDoble(
            final Tortilla aTortilla,
            final Tortilla aTortilla2
    ) {
        this.tortilla = aTortilla;
        this.tortilla2 = aTortilla2;
    }

    /**
     * Obtener nivel de calentamiento.
     * @return nivel de calentamiento
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Asignar nivel de calentamiento.
     * @param aHeatLevel heatlevel
     */
    public void setHeatLevel(
            final int aHeatLevel
    ) {
        this.heatLevel = aHeatLevel;
    }

}
