using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using unittestPractice.main;

namespace unittestPractice.main
{
    internal class Quesadilla
    {
        private IQueso _queso;
        private ITortilla _tortilla1;
        private ITortilla _tortilla2;
        private int _heatLevel;

        public string prepareSingle()
        {
            while (GetQueso().GetCurrentTemperature() < GetQueso().GetMeltingTemperature() && GetTortilla1().GetCurrentTemperature() < GetTortilla1().GetToastTemperature())
            {
                GetTortilla1().SetCurrentTemperature(GetTortilla1().GetCurrentTemperature() + GetHeatLevel());
                GetQueso().SetCurrentTemperature(GetQueso().GetCurrentTemperature() + GetHeatLevel());
                if (GetTortilla1().GetCurrentTemperature() >= GetTortilla1().GetToastTemperature())
                    GetTortilla1().Toast(true);
                if (GetQueso().GetCurrentTemperature() >= GetQueso().GetMeltingTemperature())
                    GetQueso().Melt(true);
            }
            if (GetQueso().IsMelted() && GetTortilla1().IsToasted())
                return "Perfect quesadilla";
            if (GetQueso().IsMelted() && !GetTortilla1().IsToasted())
                return "Good quesadilla";
            if (!GetQueso().IsMelted() && GetTortilla1().IsToasted())
                return "Terrible quesadilla";
            else
                return "You ran out of gas";
        }


        public string PrepareDouble()
        {
            while (GetQueso().GetCurrentTemperature()
            < GetQueso().GetMeltingTemperature()
            && GetTortilla1().GetCurrentTemperature()
            < GetTortilla1().GetToastTemperature()
            && GetTortilla2().GetCurrentTemperature()
            < GetTortilla2().GetToastTemperature())
            {
                GetTortilla1().SetCurrentTemperature(
                    GetTortilla1().GetCurrentTemperature() + GetHeatLevel());
                GetTortilla2().SetCurrentTemperature(
                    GetTortilla2().GetCurrentTemperature() + GetHeatLevel());
                GetQueso().SetCurrentTemperature(
                    GetQueso().GetCurrentTemperature() + GetHeatLevel());
                if (GetTortilla1().GetCurrentTemperature()
                   >= GetTortilla1().GetToastTemperature())
                {
                    GetTortilla1().Toast(true);
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

            if (GetQueso().IsMelted() && GetTortilla1().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Perfect quesadilla";
            }
            if (GetQueso().IsMelted() && GetTortilla1().IsToasted()
                && !GetTortilla2().IsToasted())
            {
                return "Good quesadilla";
            }
            if (GetQueso().IsMelted() && !GetTortilla1().IsToasted()
                && !GetTortilla2().IsToasted())
            {
                return "Regular quesadilla";
            }
            if (!GetQueso().IsMelted() && GetTortilla1().IsToasted()
                && GetTortilla2().IsToasted())
            {
                return "Mala quesadilla";
            }
            if (!GetQueso().IsMelted() && GetTortilla1().IsToasted()
                && !GetTortilla2().IsToasted())
            {
                return "Terrible quesadilla";
            }
            else
            {
                return "You ran out of gas";
            }
        }

        public IQueso GetQueso()
        {
            return _queso;
        }

        public void SetQueso(IQueso queso)
        {
            this._queso = queso;
        }

        public ITortilla GetTortilla1()
        {
            return _tortilla1;
        }

        public ITortilla GetTortilla2()
        {
            return _tortilla2;
        }

        public void SetTortilla1(ITortilla tortilla)
        {
            this._tortilla1 = tortilla;
        }

        public void SetTortilla2(ITortilla tortilla)
        {
            this._tortilla2 = tortilla;
        }

        public int GetHeatLevel()
        {
            return _heatLevel;
        }

        public void SetHeatLevel(int heatLevel)
        {
            this._heatLevel = heatLevel;
        }

    }
}
