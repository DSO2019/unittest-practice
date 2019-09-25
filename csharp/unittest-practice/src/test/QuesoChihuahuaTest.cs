using NUnit.Framework;
using unittestpractice.main;

namespace unittestpractice.test
{
    [TestFixture]
    internal class QuesoChihuahuaTest
    {
        private QuesoChihuahua _quesoChihuahua;

        [SetUp]
        public void Setup()
        {
            _quesoChihuahua = new QuesoChihuahua();
        }

        [TestCase]
        public void TestCurrentTemperature()
        {
            _quesoChihuahua.SetCurrentTemperature(21);
            Assert.AreEqual(21, _quesoChihuahua.GetCurrentTemperature());
        }

        [TestCase]
        public void TestFalseMelt()
        {
            _quesoChihuahua.Melt(false);
            Assert.IsFalse(_quesoChihuahua.IsMelted());
        }

        [TestCase]
        public void TestTrueMelt()
        {
            _quesoChihuahua.Melt(true);
            Assert.IsTrue(_quesoChihuahua.IsMelted());
        }

        [TestCase]
        public void TestMelting()
        {
            Assert.AreEqual(20, _quesoChihuahua.GetMeltingTemperature());
        }
    }
}