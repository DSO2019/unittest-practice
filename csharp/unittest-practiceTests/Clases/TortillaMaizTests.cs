using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    [TestClass]
    public class TortillaMaizTests
    {
        //Asserts
        private readonly TortillaMaiz _tortillaMaiz = new TortillaMaiz();

        [TestMethod]
        public void TestCurrentTemperature()
        {
            _tortillaMaiz.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaMaiz.GetCurrentTemperature());
        }

        [TestMethod]
        public void TestFalseToast()
        {
            _tortillaMaiz.Toast(false);
            Assert.IsFalse(_tortillaMaiz.IsToasted());
        }

        [TestMethod]
        public void TestTrueToast()
        {
            _tortillaMaiz.Toast(true);
            Assert.IsTrue(_tortillaMaiz.IsToasted());
        }

        [TestMethod]
        public void TestToasting()
        {
            Assert.AreEqual(35, _tortillaMaiz.GetToastTemperature());
        }
    }
}
