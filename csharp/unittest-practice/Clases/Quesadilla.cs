namespace unittestpractice.Clases
{

    public class Quesadilla
    {
        private IQueso _queso;
        private ITortilla _tortilla;
        private ITortilla _tortilla2;
        private int _heatlevel;


        public string PrepareSingle()
        {
            while (GetQueso().GetCurrentTemperature()
                   < GetQueso().GetMeltingTemperature()
                   && GetTortilla().GetCurrentTemperature()
                   < GetTortilla().GetToastTemperature())
            {
                GetTortilla().SetCurrentTemperature(GetTortilla()
                                                        .GetCurrentTemperature() + GetHeatlevel());
                GetQueso().SetCurrentTemperature(GetQueso()
                                                     .GetCurrentTemperature() + GetHeatlevel());
                if (GetTortilla().GetCurrentTemperature()
                    >= GetTortilla().GetToastTemperature())
                {
                    GetTortilla().Toast(true);
                }
                if (GetQueso().GetCurrentTemperature()
                    >= GetQueso().GetMeltingTemperature())
                {
                    GetQueso().Melt(true);
                }
            }
            if (GetQueso().IsMelted() && GetTortilla().IsToasted())
            {
                return "Perfect quesadilla";
            }
            if (GetQueso().IsMelted() && !GetTortilla().IsToasted())
            {
                return "Good quesadilla";
            }
            if (!GetQueso().IsMelted() && GetTortilla().IsToasted())
            {
                return "Terrible quesadilla";
            }
            return "You ran out of gas";
        }


        public string PrepareDouble()
        {
            while (GetQueso().GetCurrentTemperature()
           < GetQueso().GetMeltingTemperature()
               && GetTortilla().GetCurrentTemperature()
               < GetTortilla().GetToastTemperature()
               && GetTortilla2().GetCurrentTemperature()
               < GetTortilla2().GetToastTemperature())
            {
                GetTortilla().SetCurrentTemperature(GetTortilla()
                    .GetCurrentTemperature() + GetHeatlevel());
                GetTortilla2().SetCurrentTemperature(GetTortilla2()
                    .GetCurrentTemperature() + GetHeatlevel());
                GetQueso().SetCurrentTemperature(GetQueso().GetCurrentTemperature()
                    + GetHeatlevel());
                if (GetTortilla().GetCurrentTemperature()
                    >= GetTortilla().GetToastTemperature())
                {
                    GetTortilla().Toast(true);
                }
                if (GetTortilla2().GetCurrentTemperature()
                    >= GetTortilla2().GetToastTemperature())
                {
                    GetTortilla2().Toast(true);
                }
                if (GetQueso().GetCurrentTemperature()
                    >= GetQueso().GetMeltingTemperature())
                {
                    GetQueso().Melt(true);
                }
            }

            if (GetQueso().IsMelted() && GetTortilla().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Perfect quesadilla";
            }
            if (GetQueso().IsMelted() && !GetTortilla().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Good quesadilla";
            }
            if (GetQueso().IsMelted() && !GetTortilla().IsToasted()
                && !GetTortilla2().IsToasted())
            {
                return "Regular quesadilla";
            }
            if (!GetQueso().IsMelted() && GetTortilla().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Bad quesadilla";
            }
            if (!GetQueso().IsMelted() && !GetTortilla().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Terrible quesadilla";
            }
            return "You ran out of gas";
        }



        public IQueso GetQueso()
        {
            return _queso;
        }

        public void SetQueso(IQueso queso)
        {
            _queso = queso;
        }


        public ITortilla GetTortilla()
        {
            return _tortilla;
        }

        public ITortilla GetTortilla2()
        {
            return _tortilla2;
        }

        public void SetTortilla(ITortilla tortilla)
        {
            _tortilla = tortilla;
        }

        public void SetTortilla2(ITortilla tortilla2O)
        {
            _tortilla2 = tortilla2O;
        }

        public int GetHeatlevel()
        {
            return _heatlevel;
        }

        public void SetHeatlevel(int heatlevel)
        {
            _heatlevel = heatlevel;
        }
    }
}