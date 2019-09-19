using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice
{
    interface Tortilla
    {
        bool IsToasted();
        int GetToastTemperature();
        int GetCurrentTemperature();
        void SetCurrentTemperature(int temp);
        void Toast(bool toasted);
    }
}
