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
        public void testCurrentTemperature()
        {
            _tortillaHarina.SetCurrentTemperature(21);
            Assert.AreEqual(21, _tortillaHarina.GetCurrentTemperature());
        }

        [TestMethod]
        public void testFalseToast()
        {
            _tortillaHarina.Toast(false);
            Assert.IsFalse(_tortillaHarina.IsToasted());
        }

        [TestMethod]
        public void testTrueToast()
        {
            _tortillaHarina.Toast(true);
            Assert.IsTrue(_tortillaHarina.IsToasted());
        }

        [TestMethod]
        public void testToasting()
        {
            Assert.AreEqual(40, _tortillaHarina.GetToastTemperature());
        }
    }
}

