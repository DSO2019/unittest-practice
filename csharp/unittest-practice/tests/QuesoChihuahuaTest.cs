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
    class QuesoChihuahuaTest { 
        private QuesoChihuahua _quesoChihuahua;

        [SetUp]
        public void SetUp()
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
