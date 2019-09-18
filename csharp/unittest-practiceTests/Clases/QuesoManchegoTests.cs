using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice.Tests
{
    
    [TestClass()]
    public class QuesoManchegoTests
    {
        //Asserts

        QuesoChihuahua quesoManchego = new QuesoChihuahua();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            quesoManchego.setCurrentTemperature(21);
            Assert.AreEqual(21, quesoManchego.getCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseMelt()
        {
            quesoManchego.melt(false);
            Assert.IsFalse(quesoManchego.isMelted());
        }
        [TestMethod()]
        public void testTrueMelt()
        {
            quesoManchego.melt(true);
            Assert.IsTrue(quesoManchego.isMelted());
        }
        [TestMethod()]
        public void testMelting()
        {
            Assert.AreEqual(25, quesoManchego.getMeltingTemperature());
        }
    }
}




