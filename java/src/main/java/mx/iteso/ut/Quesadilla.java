/**
 * Info about this package doing something for package-info.java file.
 */
package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    /**
    * This is a Javadoc comment.
    */
    private Queso queso;
    /**
    * This is a Javadoc comment.
    */
    private Tortilla tortilla;
    /**
    * This is a Javadoc comment.
    */
    private Tortilla[] tortillas;
    /**
    * This is a Javadoc comment.
    */
    private int heatLevel;

    /**
    * This is a Javadoc comment.
    * @return String with Quesadilla type.
    */
    public String prepareSingle() {

        while (getQueso().getCurrentTemperature()
                    < getQueso().getMeltingTemperature()
                && getTortilla().getCurrentTemperature()
                    < getTortilla().getToastTemperature()) {
            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel());
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
    * This is a Javadoc comment.
    * @return String with Double Quesadilla type.
    */
    public String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido.
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido.
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido.
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido.
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido.
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido.

        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
            && getTortillas(0).getCurrentTemperature()
                < getTortillas(0).getToastTemperature()
            && getTortillas(1).getCurrentTemperature()
                < getTortillas(1).getToastTemperature()) {
            getTortillas(0).setCurrentTemperature(
                getTortillas(0).getCurrentTemperature() + getHeatLevel());
            getTortillas(1).setCurrentTemperature(
                getTortillas(1).getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel());
            if (getTortillas(0).getCurrentTemperature()
                >= getTortillas(0).getToastTemperature()) {
                getTortillas(0).toast(true);
            }
            if (getTortillas(1).getCurrentTemperature()
                >= getTortillas(1).getToastTemperature()) {
                getTortillas(1).toast(true);
            }
            if (getQueso().getCurrentTemperature()
                >= getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }

        if (getQueso().isMelted()
            && getTortillas(0).isToasted()
            && getTortillas(1).isToasted()) {
            return "Quesadilla perfecta";
        }
        if (getQueso().isMelted()
            && (!getTortillas(0).isToasted()
            && getTortillas(1).isToasted())
                || (getTortillas(0).isToasted()
                    && !getTortillas(1).isToasted())) {
            return "Quesadilla buena";
        }
        if (!getQueso().isMelted()
            && getTortillas(0).isToasted()
            && getTortillas(1).isToasted()) {
            return "Quesadilla mala";
        }
        if (!getQueso().isMelted()
            && (!getTortillas(0).isToasted()
            && getTortillas(1).isToasted())
                || (getTortillas(0).isToasted()
                    && !getTortillas(1).isToasted())) {
            return "Quesadilla terrible";
        }
        if (!getQueso().isMelted()
            && !getTortillas(0).isToasted()
            && !getTortillas(1).isToasted()) {
            return "No se cocinó";
        }
        if (getQueso().isMelted()
            && !getTortillas(0).isToasted()
            && !getTortillas(1).isToasted()) {
            return "Quesadilla regular";
        }
        return "You ran out of gas";
    }

    /**
    * This is a Javadoc comment.
    * @return Queso.
    */
    public Queso getQueso() {
        return queso;
    }

    /**
    * This is a Javadoc comment.
    * @param queso0 queso0.
    */
    public void setQueso(final Queso queso0) {
        this.queso = queso0;
    }

    /**
    * This is a Javadoc comment.
    * @return tortilla.
    */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
    * This is a Javadoc comment.
    * @param tortilla0 tortilla0.
    */
    public void setTortilla(final Tortilla tortilla0) {
        this.tortilla = tortilla0;
    }

    /**
    * This is a Javadoc comment.
    * @param index index.
    * @return Tortilla.
    */
    public Tortilla getTortillas(final int index) {
        return tortillas[index];
    }

    /**
    * This is a Javadoc comment.
    * @param tortillas0 tortillas0.
    */
    public void setTortillas(final Tortilla[] tortillas0) {
        this.tortillas = tortillas0;
    }

    /**
    * This is a Javadoc comment.
    * @return int heat level.
    */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
    * This is a Javadoc comment.
    * @param heatLevel0 heat level.
    */
    public void setHeatLevel(final int heatLevel0) {
        this.heatLevel = heatLevel0;
    }
}
