using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.main
{
    internal class TortillaHarina : ITortilla
    {
        private bool _toasted;
        private int _temperature;
        private readonly int _toasting = 20;
        public bool IsToasted()
        {
            return this._toasted;
        }

        public int GetToastTemperature()
        {
            return this._toasting;
        }

        public int GetCurrentTemperature()
        {
            return this._temperature;
        }

        public void SetCurrentTemperature(int temp)
        {
            this._temperature = temp;
        }

        public void Toast(bool toasted)
        {
            this._toasted = toasted;
        }
    }
}
