using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;

namespace unittestPractice.test
{
    [TestFixture]
    class QuesoManchegoTest
    {
        QuesoManchego quesoManchego;

        [SetUp]
        public void setUp()
        {
            quesoManchego = new QuesoManchego();
        }

        [TestCase]
        public void testCurrentTemperature()
        {
            quesoManchego.setCurrentTemperature(21);
            Assert.AreEqual(21, quesoManchego.getCurrentTemperature());
        }

        [TestCase]
        public void testFalseMelt()
        {
            quesoManchego.melt(false);
            Assert.IsFalse(quesoManchego.isMelted());
        }

        [TestCase]
        public void testTrueMelt()
        {
            quesoManchego.melt(true);
            Assert.IsTrue(quesoManchego.isMelted());
        }
        [TestCase]
        public void testMelting()
        {
            Assert.AreEqual(20, quesoManchego.getMeltingTemperature());
        }


    }
}
