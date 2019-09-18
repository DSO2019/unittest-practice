using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.test
{
    class TortillaMaizTest
    {
        TortillaMaiz tortillaMaiz;

        [SetUp]
        public void setUp()
        {
            tortillaMaiz = new TortillaMaiz();
        }

        [TestCase]
        public void testCurrentTemperature()
        {
            tortillaMaiz.setCurrentTemperature(21);
            Assert.AreEqual(21, tortillaMaiz.getCurrentTemperature());
        }

        [TestCase]
        public void testFalseToast()
        {
            tortillaMaiz.toast(false);
            Assert.IsFalse(tortillaMaiz.isToasted());
        }

        [TestCase]
        public void testTrueToast()
        {
            tortillaMaiz.toast(true);
            Assert.IsTrue(tortillaMaiz.isToasted());
        }

        [TestCase]
        public void testToasting()
        {
            Assert.AreEqual(20, tortillaMaiz.getToastTemperature());
        }
    }
}
