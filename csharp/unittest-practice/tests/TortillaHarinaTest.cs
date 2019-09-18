using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.test
{
    [TestFixture]
    class TortillaHarinaTest
    {
        TortillaHarina tortillaHarina;

        [SetUp]
        public void setUp()
        {
            tortillaHarina = new TortillaHarina();
        }

        [TestCase]
        public void testCurrentTemperature()
        {
            tortillaHarina.setCurrentTemperature(21);
            Assert.AreEqual(21, tortillaHarina.getCurrentTemperature());
        }

        [TestCase]
        public void testFalseToast()
        {
            tortillaHarina.toast(false);
            Assert.IsFalse(tortillaHarina.isToasted());
        }

        [TestCase]
        public void testTrueToast()
        {
            tortillaHarina.toast(true);
            Assert.IsTrue(tortillaHarina.isToasted());
        }

        [TestCase]
        public void testToasting()
        {
            Assert.AreEqual(20, tortillaHarina.getToastTemperature());
        }
    }
    


}
