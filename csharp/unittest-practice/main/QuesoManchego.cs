using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.main
{
    internal class QuesoManchego : IQueso
    {
        private bool _melted;
        private int _temperature;
        private readonly int _melting = 20;

        public bool IsMelted()
        {
            return this._melted;
        }

        public int GetCurrentTemperature()
        {
            return this._temperature;
        }

        public int GetMeltingTemperature()
        {
            return this._melting;
        }

        public void SetCurrentTemperature(int temp)
        {
            this._temperature = temp;
        }

        public void Melt(bool melted)
        {
            this._melted = melted;

        }
    }
}
