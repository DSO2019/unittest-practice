using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using unittestPractice.main;

namespace unittestPractice.test
{
    class TortillaMaizTest
    {
        TortillaMaiz _tortillaMaiz;

        [SetUp]
        public void SetUp()
        {
            _tortillaMaiz = new TortillaMaiz();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _tortillaMaiz.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaMaiz.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseToast()
        {
            _tortillaMaiz.Toast(false);
            Assert.IsFalse(_tortillaMaiz.IsToasted());
        }

        [TestCase]
        public void TestTrueToast()
        {
            _tortillaMaiz.Toast(true);
            Assert.IsTrue(_tortillaMaiz.IsToasted());
        }

        [TestCase]
        public void TestToasting()
        {
            Assert.AreEqual(20, _tortillaMaiz.GetToastTemperature());
        }
    }
}
