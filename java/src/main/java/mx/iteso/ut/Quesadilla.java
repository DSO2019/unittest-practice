package mx.iteso.ut;

/**
 * Hello world!
 * Prueba de codigo para push
 *
 */
public class Quesadilla
{
    private Queso queso;
    private Tortilla tortilla;
    private Tortilla tortilla2;
    private int heatLevel;

    public String prepareSingle(){


     while(getQueso().getCurrentTemperature()< getQueso().getMeltingTemperature() && getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
         getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
             getTortilla().toast(true);
         if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
             getQueso().melt(true);
     }

     if(getQueso().isMelted() && getTortilla().isToasted())
         return "Perfect quesadilla";
     if(getQueso().isMelted() && !getTortilla().isToasted())
         return "Good quesadilla";
     if(!getQueso().isMelted() && getTortilla().isToasted())
         return "Terrible quesadilla";
     else
         return "You ran out of gas";
    }

    public String prepareDouble(){

        while
                //Define temperatura de queso < melting
        (getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() &&
        //Define temperatura de tortilla < tostada
        getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature() &&
                getTortilla2().getCurrentTemperature() < getTortilla2().getToastTemperature()
        )

        //Mientras el queso no se derrita ni la tortilla 1 se tueste y ni la tortilal 2 se tueste
        {

            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getTortilla2().setCurrentTemperature(getTortilla2().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel());


            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature())
                getTortilla().toast(true);

            if (getTortilla2().getCurrentTemperature() >= getTortilla2().getToastTemperature())
                getTortilla2().toast(true);

            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature())
                getQueso().melt(true);
        }
        // tortilla 1 tostada
        // tortilla 2 tostada
        // queso derretido
        //Añadir segunda tortilla tostada
        if(getQueso().isMelted() && getTortilla().isToasted()  && getTortilla().isToasted()
                && getTortilla2().isToasted())
            return "Perfect quesadilla";

        // tortilla 1 no tostada
        // tortilla 2 tostada
        // queso derretido
        //Falta checar que una segunda quesadilla no este tostada
        if(getQueso().isMelted() && !getTortilla().isToasted()  && getTortilla2().isToasted() )
            return "Quesadilla Buena";

        // tortilla 1 tostada
        // tortilla 2 no tostada
        // queso derretido
        //Falta checar que una segunda quesadilla no este tostada
        if(getQueso().isMelted() && getTortilla().isToasted() && !getTortilla2().isToasted() )
            return "Quesadilla Buena";

        // tortilla 1 no tostada
        // tortilla 2 tostada
        // queso no derretido

        if(getQueso().isMelted() && !getTortilla().isToasted() && getTortilla2().isToasted())
            return "Quesadilla terribe";

        // tortilla 1 tostada
        // tortilla 2 no tostada
        // queso no derretido

        if(getQueso().isMelted() && getTortilla().isToasted() && !getTortilla2().isToasted())
            return "Quesadilla terribe";

            // tortilla 1 no tostada
            // tortilla 2 no tostada
            // queso derretido
        if(getQueso().isMelted() && !getTortilla().isToasted() && !getTortilla2().isToasted())
            return "Quesadilla regular";

            // tortilla 1 tostada
            // tortilla 2 tostada
            // queso no derretido
        if(getQueso().isMelted() && getTortilla().isToasted() && getTortilla2().isToasted())
                return "Quesadilla Mala";

            // tortilla 1 no tostada
            // tortilla 2 no tostada
            // queso no derretido

        else
            return "You ran out of gas";
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

    public Tortilla getTortilla2() {
        return tortilla2;
    }

    public void setTortilla2(Tortilla tortilla) {
        this.tortilla2 = tortilla;
    }
}
