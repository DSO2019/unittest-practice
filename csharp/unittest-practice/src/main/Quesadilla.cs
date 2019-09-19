using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    class Quesadilla
    {
            private Queso queso;
            private Tortilla tortilla;
            private int heatLevel;

            public String prepareSingle()
            {


                while (GetQueso().GetCurrentTemperature() < GetQueso().GetMeltingTemperature() && GetTortilla().GetCurrentTemperature() < GetTortilla().GetToastTemperature())
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
                else
                    return "You ran out of gas";

            }

            public String prepareDouble()
            {
                // tortilla 1 tostada, tortilla 2 tostada, queso derretido
                // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
                // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
                // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
                // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
                // tortilla 1 tostada, tortilla 2 tostada, queso no derretido

                return "";
            }

            public Queso GetQueso()
            {
                return queso;
            }

            public void SetQueso(Queso queso)
            {
                this.queso = queso;
            }


            public Tortilla GetTortilla()
            {
                return tortilla;
            }

            public void SetTortilla(Tortilla tortilla)
            {
                this.tortilla = tortilla;
            }

            public int GetHeatLevel()
            {
                return heatLevel;
            }

            public void SetHeatLevel(int heatLevel)
            {
                this.heatLevel = heatLevel;
            }
    }
}
