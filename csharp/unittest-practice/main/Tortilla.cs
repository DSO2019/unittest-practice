using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.main
{
    public interface ITortilla
    {
        bool IsToasted();
        int GetToastTemperature();
        int GetCurrentTemperature();
        void SetCurrentTemperature(int temp);
        void Toast(bool toasted);
    }
}
