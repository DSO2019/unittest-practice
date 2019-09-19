using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice
{
    public interface Queso
    {
        bool isMelted();
        int getCurrentTemperature();
        int getMeltingTemperature();
        void setCurrentTemperature(int temp);
        void melt(bool melted);

    }
}
