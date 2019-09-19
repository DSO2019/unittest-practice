using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    interface Queso
    {
        bool IsMelted();
        int GetCurrentTemperature();
        int GetMeltingTemperature();
        void SetCurrentTemperature(int temp);
        void Melt(bool melted);
     }
}
