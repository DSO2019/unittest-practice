/**
 * Domain classes used to produce .....
 * <p>
 * Quesadilla
 * </p>
 *
 * @since 1.0
 * @author Erick Cardona
 * @version 1.0
 */
package mx.iteso.ut;

/**
 * Clase quesadilla para poder realizar las pruebas vistas en clase.
 * Tiene queso, tortilla y tortilla 2
 */
public class Quesadilla {
    /**
     * Instancia de queso para la quesadilla de la interfaz
     * de Queso.
     */
    private Queso queso;
    /**
     * Instancia de tortilla para la quesadilla.
     */
    private Tortilla tortilla;
    /**
     * Instancia de tortilla 2 para la practica de quesadilla de doble tortilla.
     */
    private Tortilla tortilla2;
    /**
     * Para poder dorar la tortilla o derretir el queso.
     */
    private int heatLevel;

    /**
     * Preparar quesadilla de una sola tortilla.
     * @return un str que menciona que tan buena fue la quesadilla
     */
    public String prepareSingle() {

        while (getQueso().getCurrentTemperature()
             <
             getQueso().getMeltingTemperature()
             &&
             getTortilla().getCurrentTemperature()
             <
             getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(getTortilla()
                 .getCurrentTemperature()
                 + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso()
                 .getCurrentTemperature()
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

     if (getQueso().isMelted()
             && getTortilla().isToasted()) {
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
     * Preparar una quesadilla de doble tortilla y un solo queso.
     * @return regresa que tan buena es la quesadilla
     */
    public String prepareDouble() {

        //Define temperatura de queso < melting.
        while (getQueso().getCurrentTemperature()
                <
                getQueso().getMeltingTemperature()
                &&
        //Define temperatura de tortilla < tostada.
        getTortilla().getCurrentTemperature()
                <
                getTortilla().getToastTemperature()
                &&
                getTortilla2().getCurrentTemperature()
                        <
                        getTortilla2().getToastTemperature()
        ) {
            getTortilla().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature()
                    + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2()
                    .getCurrentTemperature()
                    + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                    .getCurrentTemperature()
                    + getHeatLevel());


            if (getTortilla().getCurrentTemperature()
                    >=
                    getTortilla().getToastTemperature()) {
                getTortilla().toast(true);
            }

            if (getTortilla2().getCurrentTemperature()
                    >=
                    getTortilla2().getToastTemperature()) {
                getTortilla2().toast(true);
            }

            if (getQueso().getCurrentTemperature()
                    >=
                    getQueso().getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        // tortilla 1 tostada.
        // tortilla 2 tostada.
        // queso derretido.
        //Añadir segunda tortilla tostada.
        if (getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Perfect quesadilla";
        }

        // tortilla 1 no tostada.
        // tortilla 2 tostada.
        // queso derretido.
        //Falta checar que una segunda quesadilla no este tostada.
        if (getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Quesadilla Buena";
        }

        // tortilla 1 tostada.
        // tortilla 2 no tostada.
        // queso derretido.
        //Falta checar que una segunda quesadilla no este tostada.
        if (getQueso().isMelted()
                && getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Quesadilla Buena";
        }

        // tortilla 1 no tostada.
        // tortilla 2 tostada.
        // queso no derretido.

        if (!getQueso().isMelted()
                && !getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Quesadilla terrible";
        }

        // tortilla 1 tostada.
        // tortilla 2 no tostada.
        // queso no derretido.

        if (!getQueso().isMelted()
                && getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Quesadilla terrible";
        }

            // tortilla 1 no tostada.
            // tortilla 2 no tostada.
            // queso derretido.
        if (!getQueso().isMelted()
                && !getTortilla().isToasted()
                && !getTortilla2().isToasted()) {
            return "Quesadilla regular";
        }

            // tortilla 1 tostada.
            // tortilla 2 tostada.
            // queso no derretido.
        if (!getQueso().isMelted()
                && getTortilla().isToasted()
                && getTortilla2().isToasted()) {
            return "Quesadilla Mala";

        } else {
            return "You ran out of gas";
        }
    }

    /**
     * Creacion de queso.
     * @return queso
     */
    public Queso getQueso() {
        return queso;
    }

    /**
     * Añadimos queso.
     * @param val igualamos valor al queso que creamos
     */
    public void setQueso(final Queso val) {
        this.queso = val;
    }

    /**
     * Obtenemos tortilla.
     * @return tortilla creada
     */
    public Tortilla getTortilla() {
        return tortilla;
    }

    /**
     * Apuntamos tortilla.
     * @param val apuntamos tortilla a la creada
     */
    public void setTortilla(final Tortilla val) {
        this.tortilla = val;
    }

    /**
     * Obtenemos el nivel del calor.
     * @return int del nivel del calor
     */
    public int getHeatLevel() {
        return heatLevel;
    }

    /**
     * Actualizamos el nivel del calor.
     * @param val se iguala al valor instanciado
     */
    public void setHeatLevel(final int val) {
        this.heatLevel = val;
    }

    /**
     * Creacion de tortilla2.
     * @return Segunda tortilla creada para la quesadilla doble
     */
    public Tortilla getTortilla2() {
        return tortilla2;
    }

    /**
     * Crear tortilla2.
     * @param val darle un valor sino queda en null
     */
    public void setTortilla2(final Tortilla val) {
        this.tortilla2 = val;
    }
}
