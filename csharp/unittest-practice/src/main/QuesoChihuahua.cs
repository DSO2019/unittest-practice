﻿namespace unittestpractice.main
{
    internal class QuesoChihuahua : IQueso
    {
        public bool Melted;
        public int Temperature;
        public int Melting = 20;

        public bool IsMelted()
        {
            return Melted;
        }

        public int GetCurrentTemperature()
        {
            return Temperature;
        }

        public int GetMeltingTemperature()
        {
            return Melting;
        }

        public void SetCurrentTemperature(int temp)
        {
            Temperature = temp;
        }

        public void Melt(bool melted)
        {
            Melted = melted;
        }
    }
}
