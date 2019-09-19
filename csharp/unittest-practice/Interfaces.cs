using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    public interface Queso
    {
        bool isMelted();
        int getCurrentTemperature();
        int getMeltingTemperature();
        void setCurrentTemperature(int temp);
        void melt(bool melted);
    }

    public interface Tortilla
    {
        bool isToasted();
        int getToastTemperature();
        int getCurrentTemperature();
        void setCurrentTemperature(int temp);
        void toast(bool toasted);

    }



}
