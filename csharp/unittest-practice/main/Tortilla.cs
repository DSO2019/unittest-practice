using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice
{
    public interface Tortilla
    {
        bool isToasted();
        int getToastTemperature();
        int getCurrentTemperature();
        void setCurrentTemperature(int temp);
        void toast(bool toasted);
    }
}
