using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using unittestPractice.main;

namespace unittestPractice.test
{
    [TestFixture]
    class TortillaHarinaTest
    {
        private TortillaHarina _tortillaHarina;

        [SetUp]
        public void SetUp()
        {
            _tortillaHarina = new TortillaHarina();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _tortillaHarina.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaHarina.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseToast()
        {
            _tortillaHarina.Toast(false);
            Assert.IsFalse(_tortillaHarina.IsToasted());
        }

        [TestCase]
        public void TestTrueToast()
        {
            _tortillaHarina.Toast(true);
            Assert.IsTrue(_tortillaHarina.IsToasted());
        }

        [TestCase]
        public void TestToasting()
        {
            Assert.AreEqual(20, _tortillaHarina.GetToastTemperature());
        }
    }
    


}
