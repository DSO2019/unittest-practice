using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace unittestPractice.test
{
    

    [TestFixture]
    class QuesoChihuahuaTest { 
        QuesoChihuahua quesoChihuahua;

        [SetUp]
        public void setUp()
        {
            quesoChihuahua = new QuesoChihuahua();
        }

        [TestCase]
        public void testCurrentTemperature()
        {
            quesoChihuahua.setCurrentTemperature(21);
            Assert.AreEqual(21, quesoChihuahua.getCurrentTemperature());            
        }

        [TestCase]
        public void testFalseMelt()
        {
            quesoChihuahua.melt(false);
            Assert.IsFalse(quesoChihuahua.isMelted());
        }

        [TestCase]
        public void testTrueMelt()
        {
            quesoChihuahua.melt(true);
            Assert.IsTrue(quesoChihuahua.isMelted());
        }
        [TestCase]
        public void testMelting()
        {
            Assert.AreEqual(20, quesoChihuahua.getMeltingTemperature());
        }


    
    }
}
