using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using unittestPractice.main;

namespace unittestPractice.test
{
    [TestFixture]
    class QuesoManchegoTest
    {
        private QuesoManchego _quesoManchego;

        [SetUp]
        public void SetUp()
        {
            _quesoManchego = new QuesoManchego();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _quesoManchego.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoManchego.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseMelt()
        {
            _quesoManchego.Melt(false);
            Assert.IsFalse(_quesoManchego.IsMelted());
        }

        [TestCase]
        public void TestTrueMelt()
        {
            _quesoManchego.Melt(true);
            Assert.IsTrue(_quesoManchego.IsMelted());
        }
        [TestCase]
        public void TestMelting()
        {
            Assert.AreEqual(20, _quesoManchego.GetMeltingTemperature());
        }


    }
}
