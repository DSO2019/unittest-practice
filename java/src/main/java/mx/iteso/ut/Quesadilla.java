package mx.iteso.ut;
/**
    Clase Quesadilla.
 */
public class Quesadilla {
    /** Variable queso. */
    private Queso queso;
    /** Variable tortilla. */
    private Tortilla tortilla;
    /** Variable tortilla2. */
    private Tortilla tortilla2;
    /** Variable heatLevel. */
    private int heatLevel;

    /**  Método para preparar una quesadilla simple.
     *  @return String Contiene el resultado de la cocción de la quesadilla.
    */
    public String prepareSingle() {
        while (getQueso().getCurrentTemperature()
               <
               getQueso().getMeltingTemperature()
               && getTortilla().getCurrentTemperature()
               <
               getTortilla().getToastTemperature()) {

            getTortilla().setCurrentTemperature(getTortilla()
                         .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                      .getCurrentTemperature() + getHeatLevel());

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

    /**  Método para preparar una quesadilla doble.
     *  @return String Contiene el resultado de la cocción de la
     *  quesadilla doble.
     */
    public String prepareDouble() {
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                && getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()) {

            getTortilla().setCurrentTemperature(getTortilla()
                         .getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2()
                          .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                      .getCurrentTemperature() + getHeatLevel());

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

        if (getQueso().isMelted()
           && getTortilla().isToasted()
           && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }

        if ((getQueso().isMelted()
             && !getTortilla().isToasted()
             && getTortilla2().isToasted())
             ||
            (getQueso().isMelted()
             && getTortilla().isToasted()
             && !getTortilla2().isToasted())) {
            return "Good quesadilla";
        }

        if (!getQueso().isMelted()
            && getTortilla().isToasted()
            && getTortilla2().isToasted()) {
                return "Bad quesadilla";
        } else if ((!getQueso().isMelted()
                    && !getTortilla().isToasted()
                    && getTortilla2().isToasted())
                    ||
                  (!getQueso().isMelted()
                   && getTortilla().isToasted()
                   && !getTortilla2().isToasted())) {
            return "Terrible quesadilla";
        } else if (!getQueso().isMelted()
                    && !getTortilla().isToasted()
                    && !getTortilla2().isToasted()) {
            return "You ran out of gas";
        } else {
            return "";
        }
    }

    /**  Método que retorna el queso.
     *  @return String Queso de la quesadilla.
     */
    public Queso getQueso() {
        return queso;
    }

    /**  Método que establece el queso.
     * @param pQueso Queso.
     */
    public void setQueso(final Queso pQueso) {
        this.queso = pQueso;
    }

    /**  Método que retorna la tortilla.
     *  @return String Tortilla de la quesadilla.
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**  Método que establece la tortilla.
     * @param pTortilla Tortilla.
     */
    public void setTortilla(final Tortilla pTortilla) {
        this.tortilla = pTortilla;
    }

    /**  Método que establece la tortilla2.
     * @param pTortilla2 Tortilla2.
     */
    public void setTortilla2(final Tortilla pTortilla2) {
        this.tortilla2 = pTortilla2;
    }

    /**  Método que retorna la tortilla 2.
     *  @return String Queso de la quesadilla.
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**  Método que retorna la temperatura.
     *  @return int Temperatura de la quesadilla.
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**  Método que establece la temperatura de la quesadilla.
    *  @param pHeatLevel Temperatura.
    */
    public void setHeatLevel(final int pHeatLevel) {
        this.heatLevel = pHeatLevel;
    }
}
