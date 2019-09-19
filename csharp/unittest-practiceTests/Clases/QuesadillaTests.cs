using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
namespace unittestpractice.Clases.Tests
{
    [TestClass()]
    public class QuesadillaTests
    {
        Quesadilla quesadilla;
        Mock mockedQueso;
        Mock mockedTortilla;
        //TODO ARTURO
        //Asserts
        [TestInitialize]
        public void setup()
        {
            quesadilla = new Quesadilla();
            mockedQueso = new Mock<Queso>();
            mockedTortilla = new Mock<Tortilla>();
        }

        [TestMethod()]
        public void quesadillaPerfecta()
        {
            Assert.Fail();
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