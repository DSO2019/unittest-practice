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
    public class TortillaMaizTests
    {
        //Asserts
        TortillaMaiz tortillaMaiz = new TortillaMaiz();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            tortillaMaiz.setCurrentTemperature(21);
            Assert.AreEqual(21, tortillaMaiz.getCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseToast()
        {
            tortillaMaiz.toast(false);
            Assert.IsFalse(tortillaMaiz.isToasted());
        }

        [TestMethod()]
        public void testTrueToast()
        {
            tortillaMaiz.toast(true);
            Assert.IsTrue(tortillaMaiz.isToasted());
        }

        [TestMethod()]
        public void testToasting()
        {
            Assert.AreEqual(35, tortillaMaiz.getToastTemperature());
        }
    }
}




