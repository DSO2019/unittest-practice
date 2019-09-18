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
    public class TortillaHarinaTests
    {
        //Asserts
        TortillaHarina tortillaHarina = new TortillaHarina();

        [TestMethod()]
        public void testCurrentTemperature()
        {
            tortillaHarina.setCurrentTemperature(21);
            Assert.AreEqual(21, tortillaHarina.getCurrentTemperature());
        }

        [TestMethod()]
        public void testFalseToast()
        {
            tortillaHarina.toast(false);
            Assert.IsFalse(tortillaHarina.isToasted());
        }

        [TestMethod()]
        public void testTrueToast()
        {
            tortillaHarina.toast(true);
            Assert.IsTrue(tortillaHarina.isToasted());
        }

        [TestMethod()]
        public void testToasting()
        {
            Assert.AreEqual(40, tortillaHarina.getToastTemperature());
        }
    }
}

