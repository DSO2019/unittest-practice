namespace unittestpractice.Clases
{
    public class Quesadilla
    {
        private IQueso _queso;
        private ITortilla _tortilla;
        private ITortilla _tortilla2;
        private int _heatlevel;


        public string prepareSingle()
        {
            while (getQueso().getCurrentTemperature()
                   < getQueso().getMeltingTemperature()
                   && getTortilla().getCurrentTemperature()
                   < getTortilla().getToastTemperature())
            {
                getTortilla().setCurrentTemperature(getTortilla()
                                                        .getCurrentTemperature() + getHeatLevel());
                getQueso().setCurrentTemperature(getQueso()
                                                     .getCurrentTemperature() + getHeatLevel());
                if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature())
                {
                    getTortilla().toast(true);
                }
                if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature())
                {
                    getQueso().melt(true);
                }
            }
            if (getQueso().isMelted() && getTortilla().isToasted())
            {
                return "Perfect quesadilla";
            }
            if (getQueso().isMelted() && !getTortilla().isToasted())
            {
                return "Good quesadilla";
            }
            if (!getQueso().isMelted() && getTortilla().isToasted())
            {
                return "Terrible quesadilla";
            }
            return "You ran out of gas";
        }


        public string prepareDouble()
        {
            while (getQueso().getCurrentTemperature()
           < getQueso().getMeltingTemperature()
               && getTortilla().getCurrentTemperature()
               < getTortilla().getToastTemperature()
               && getTortilla2().getCurrentTemperature()
               < getTortilla2().getToastTemperature())
            {
                getTortilla().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());
                getTortilla2().setCurrentTemperature(getTortilla2()
                    .getCurrentTemperature() + getHeatLevel());
                getQueso().setCurrentTemperature(getQueso().getCurrentTemperature()
                    + getHeatLevel());
                if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature())
                {
                    getTortilla().toast(true);
                }
                if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature())
                {
                    getTortilla2().toast(true);
                }
                if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature())
                {
                    getQueso().melt(true);
                }
            }

            if (getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla2().isToasted())
            {
                return "Perfect quesadilla";
            }
            if (getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla2().isToasted())
            {
                return "Good quesadilla";
            }
            if (getQueso().isMelted() && !getTortilla().isToasted()
                && !getTortilla2().isToasted())
            {
                return "Regular quesadilla";
            }
            if (!getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla2().isToasted())
            {
                return "Bad quesadilla";
            }
            if (!getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla2().isToasted())
            {
                return "Terrible quesadilla";
            }
            return "You ran out of gas";
        }


        private IQueso getQueso()
        {
            return _queso;
        }

        public void setQueso(IQueso queso)
        {
            _queso = queso;
        }


        private ITortilla getTortilla()
        {
            return _tortilla;
        }

        private ITortilla getTortilla2()
        {
            return _tortilla2;
        }

        public void setTortilla(ITortilla tortilla)
        {
            _tortilla = tortilla;
        }

        public void setTortilla2(ITortilla tortilla2O)
        {
            _tortilla2 = tortilla2O;
        }

        private int getHeatLevel()
        {
            return _heatlevel;
        }

        public void setHeatLevel(int heatlevel)
        {
            _heatlevel = heatlevel;
        }
    }
}