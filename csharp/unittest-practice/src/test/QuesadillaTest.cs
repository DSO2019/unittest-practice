using Moq;
using NUnit.Framework;
using unittestpractice.main;


namespace unittestpractice.test
{

    [TestFixture]
    internal class QuesadillaTest
    {
        public Quesadilla Quesadilla;
        public Mock<IQueso> MockedQueso;
        public Mock<ITortilla> MockedTortilla;
        public Mock<ITortilla> MockedTortilla1;

        [SetUp]
        public void SetUp()
        {
            Quesadilla = new Quesadilla();
            MockedQueso = new Mock<IQueso>();
            MockedTortilla = new Mock<ITortilla>();
            MockedTortilla1 = new Mock<ITortilla>();

            Quesadilla.SetQueso(MockedQueso.Object);
            Quesadilla.SetTortilla(MockedTortilla.Object);
            Quesadilla.SetTortilla1(MockedTortilla1.Object);
        }

        [TestCase]
        public void QuesadillaPerfecta()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(10);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", Quesadilla.PrepareSingle());
        }
        
        [TestCase] 
        public void QuesadillaBuena()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", Quesadilla.PrepareSingle());
        }

        [TestCase]
        public void QuesadillaTerrible()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(8);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", Quesadilla.PrepareSingle());
        }

        [TestCase]
        public void NoHayGas()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(10);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(20);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", Quesadilla.PrepareSingle());
        }

        [TestCase]
        public void QuesadillaDoblePerfecta()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(10);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Perfect quesadilla", Quesadilla.PrepareDouble());
        }
        [TestCase]
        public void QuesadillaDobleBuena()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla1 => tortilla1.IsToasted()).Returns(false);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(5);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(15);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Good quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaDobleMala()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(true);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(15);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(5);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Bad quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaDobleTerrible()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(8);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla1 => tortilla1.IsToasted()).Returns(true);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(20);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(5);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("Terrible quesadilla", Quesadilla.PrepareDouble());
        }

        [TestCase]
        public void QuesadillaDobleOutOfGas()
        {
            MockedQueso.Setup(queso => queso.IsMelted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.IsToasted()).Returns(false);
            MockedTortilla.Setup(tortilla => tortilla.GetCurrentTemperature()).Returns(15);
            MockedTortilla.Setup(tortilla => tortilla.GetToastTemperature()).Returns(10);
            MockedTortilla1.Setup(tortilla1 => tortilla1.IsToasted()).Returns(false);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetCurrentTemperature()).Returns(12);
            MockedTortilla1.Setup(tortilla1 => tortilla1.GetToastTemperature()).Returns(10);
            MockedQueso.Setup(queso => queso.GetCurrentTemperature()).Returns(2);
            MockedQueso.Setup(queso => queso.GetMeltingTemperature()).Returns(10);
            Assert.AreEqual("You ran out of gas", Quesadilla.PrepareDouble());
        }
    }
}