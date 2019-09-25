using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
namespace unittestpractice.Clases.Tests
{
    [TestClass()]
    public class QuesadillaTests
    {
        Quesadilla quesadilla;
        Mock<Queso> mockedQueso;
        Mock<Tortilla> mockedTortilla;
        //TODO ARTURO
        //Asserts
        [TestInitialize]
        public void setup()
        {
            quesadilla = new Quesadilla();
            mockedQueso = new Mock<Queso>();
            mockedQueso.Setup(foo => foo.getCurrentTemperature()).Returns(15);
            mockedQueso.Setup(foo => foo.getMeltingTemperature()).Returns(10);
            mockedTortilla = new Mock<Tortilla>();
            quesadilla.setQueso(mockedQueso.Object);
            quesadilla.setTortilla(mockedTortilla.Object);
            quesadilla.setHeatLevel(10);
        }

        [TestMethod()]
        public void quesadillaPerfecta()
        {
            
            Assert.AreEqual("Perfect quesadilla", quesadilla.prepareSingle());
        }

        [TestMethod()]
        public void prepareDoubleTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void getQuesoTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void setQuesoTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void getTortillaTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void setTortillaTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void getHeatLevelTest()
        {
            Assert.Fail();
        }

        [TestMethod()]
        public void setHeatLevelTest()
        {
            Assert.Fail();
        }
    }
}