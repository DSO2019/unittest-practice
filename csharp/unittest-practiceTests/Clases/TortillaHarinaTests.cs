using Microsoft.VisualStudio.TestTools.UnitTesting;
using unittestpractice.Clases;

namespace unittest_practiceTests.Clases
{
    [TestClass]
    public class TortillaHarinaTests
    {
        //Asserts
        private readonly TortillaHarina _tortillaHarina = new TortillaHarina();

        [TestMethod]
        public void TestCurrentTemperature()
        {
            _tortillaHarina.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaHarina.GetCurrentTemperature());
        }

        [TestMethod]
        public void TestFalseToast()
        {
            _tortillaHarina.Toast(false);
            Assert.IsFalse(_tortillaHarina.IsToasted());
        }

        [TestMethod]
        public void TestTrueToast()
        {
            _tortillaHarina.Toast(true);
            Assert.IsTrue(_tortillaHarina.IsToasted());
        }

        [TestMethod]
        public void TestToasting()
        {
            Assert.AreEqual(40, _tortillaHarina.GetToastTemperature());
        }
    }
}

