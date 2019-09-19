using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestpractice.Clases.Tests
{
    [TestClass()]
    public class QuesoChihuahaTests
    {
        //Asserts
        QuesoChihuahua quesoChihuahua = new QuesoChihuahua();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            quesoChihuahua.setCurrentTemperature(21);
            Assert.AreEqual(21, quesoChihuahua.getCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseMelt()
        {
            quesoChihuahua.melt(false);
            Assert.IsFalse(quesoChihuahua.isMelted());
        }
        [TestMethod()]
        public void testTrueMelt()
        {
            quesoChihuahua.melt(true);
            Assert.IsTrue(quesoChihuahua.isMelted());
        }
        [TestMethod()]
        public void testMelting()
        {
            Assert.AreEqual(25, quesoChihuahua.getMeltingTemperature());
        }
    }
}