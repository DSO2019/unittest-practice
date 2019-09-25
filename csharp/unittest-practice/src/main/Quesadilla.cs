namespace unittestpractice.main
{
    internal class Quesadilla
    {
        private IQueso _queso;
        private ITortilla _tortilla;
        private ITortilla _tortilla1;
        private const int HeatLevel = 2;


        public string PrepareSingle()
        {
            while (GetQueso().GetCurrentTemperature()
                   < GetQueso().GetMeltingTemperature()
                   && GetTortilla().GetCurrentTemperature()
                   < GetTortilla().GetToastTemperature())
            {
                GetTortilla().SetCurrentTemperature(GetTortilla().GetCurrentTemperature() + GetHeatLevel());
                GetQueso().SetCurrentTemperature(GetQueso().GetCurrentTemperature() + GetHeatLevel());
                if (GetTortilla().GetCurrentTemperature() >= GetTortilla().GetToastTemperature())
                    GetTortilla().Toast(true);
                if (GetQueso().GetCurrentTemperature() >= GetQueso().GetMeltingTemperature())
                    GetQueso().Melt(true);
            }

            if (GetQueso().IsMelted() && GetTortilla().IsToasted())
                return "Perfect quesadilla";
            if (GetQueso().IsMelted() && !GetTortilla().IsToasted())
                return "Good quesadilla";
            if (!GetQueso().IsMelted() && GetTortilla().IsToasted())
                return "Terrible quesadilla";
            return "You ran out of gas";

        }

        public string PrepareDouble()
        {
            while (GetQueso().GetCurrentTemperature()
                   < GetQueso().GetMeltingTemperature()
                   && GetTortilla().GetCurrentTemperature()
                   < GetTortilla().GetToastTemperature()
                   && GetTortilla1().GetCurrentTemperature()
                   < GetTortilla1().GetToastTemperature())
            {
                GetTortilla().SetCurrentTemperature(GetTortilla().GetCurrentTemperature() + GetHeatLevel());
                GetTortilla1().SetCurrentTemperature(GetTortilla1().GetCurrentTemperature() + GetHeatLevel());
                GetQueso().SetCurrentTemperature(GetQueso().GetCurrentTemperature() + GetHeatLevel());
                if (GetTortilla().GetCurrentTemperature() >= GetTortilla().GetToastTemperature())
                    GetTortilla().Toast(true);
                if (GetTortilla1().GetCurrentTemperature() >= GetTortilla1().GetToastTemperature())
                    GetTortilla().Toast(true);
                if (GetQueso().GetCurrentTemperature() >= GetQueso().GetMeltingTemperature())
                    GetQueso().Melt(true);
            }

            if (GetQueso().IsMelted() && GetTortilla().IsToasted() && GetTortilla1().IsToasted())
                return "Perfect quesadilla";
            if (GetQueso().IsMelted() && GetTortilla().IsToasted() && !GetTortilla1().IsToasted())
                return "Good quesadilla";
            if (GetQueso().IsMelted() && !GetTortilla().IsToasted() && GetTortilla1().IsToasted())
                return "Good quesadilla";
            if (!GetQueso().IsMelted() && GetTortilla().IsToasted() && GetTortilla().IsToasted())
                return "Bad quesadilla";
            if (!GetQueso().IsMelted() && !GetTortilla().IsToasted() && GetTortilla1().IsToasted())
                return "Terrible quesadilla";
            if (!GetQueso().IsMelted() && GetTortilla().IsToasted() && !GetTortilla1().IsToasted())
                return "Terrible quesadilla";
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

        public void SetTortilla(ITortilla tortilla)
        {
            _tortilla = tortilla;
        }

        public ITortilla GetTortilla1()
        {
            return _tortilla1;
        }

        public void SetTortilla1(ITortilla tortilla)
        {
            _tortilla1 = tortilla;
        }

        public int GetHeatLevel()
        {
            return HeatLevel;
        }
    }
}
