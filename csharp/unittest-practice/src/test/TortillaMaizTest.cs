using NUnit.Framework;
using unittestpractice.main;

namespace unittestpractice.test
{
    [TestFixture]
    internal class TortillaMaizTest
    {
        private TortillaMaiz _tortillaMaiz;

        [SetUp]

        public void Setup()
        {
            _tortillaMaiz = new TortillaMaiz();
        }
        
        [TestCase]
        public void TestCurrentTemperature()
        {
            _tortillaMaiz.SetCurrentTemperature(10);
            Assert.AreEqual(10, _tortillaMaiz.GetCurrentTemperature());
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
