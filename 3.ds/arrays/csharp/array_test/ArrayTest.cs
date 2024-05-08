using System.Collections;
using System.Diagnostics;
using array_ds;

namespace array_test;

[TestClass]
public class ArrayTest
{
    [TestMethod]
    public void TestConstructor()
    {
        // Arrange / SetUp
        int[] data = [1, 2];  // Initial State

        // Act
        ArrayCustom arrayCustom = new(data);

        // Assert
        Assert.AreEqual(data, arrayCustom.Data);
    }

    [TestMethod]
    public void TestInsertAtBeginning()
    {
        // int[] data = [];

        // Arrange / SetUp
        // ArrayCustom arrayCustom = new(data);

        // Act
        // data.insert(2); // [1]
        // arrayCustom.insert(2); // [2]

        // Assert
        // Assert.AreEqual(data, arrayCustom); // [2] = [2]
    }
    public void TestInsertAtEnd()
    {
        // int[] data = [];

        // Arrange / SetUp
        // ArrayCustom arrayCustom = new(data);

        // Act
        // data.insert(2); // [1]
        // arrayCustom.insert(2); // [2]

        // Assert
        // Assert.AreEqual(data, arrayCustom); // [2] = [2]
    }
    public void TestInsertAtMid()
    {
        // int[] data = [];

        // Arrange / SetUp
        // ArrayCustom arrayCustom = new(data);

        // Act
        // data.insert(2); // [1]
        // arrayCustom.insert(2); // [2]

        // Assert
        // Assert.AreEqual(data, arrayCustom); // [2] = [2]
    }

    [TestMethod]
    public void TestMultipleInsert()
    {
        // int[] data = [1];

        // Arrange / SetUp
        // ArrayCustom arrayCustom = new(data);

        // Act
        // data.insert(2, 3); // [1, 2, 3]
        // arrayCustom.insert(2, 3); // [1, 2, 3]

        // Assert
        // Assert.AreEqual(data, arrayCustom); // [1, 2, 3] = [1, 2, 3]
    }

    [TestMethod]
    public void TestDeleteByIndex()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
    [TestMethod]
    public void TestDeleteByValue()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }

    [TestMethod]
    public void TestCountItems()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }

    [TestMethod]
    public void TestReverse()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
    [TestMethod]
    public void TestSort()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
    [TestMethod]
    public void TestGetByValue()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }

    [TestMethod]
    public void TestGetByIndex()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
    [TestMethod]
    public void TestGetByRange()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
    [TestMethod]
    public void TestClear()
    {
        // Arrange / SetUp

        // Act

        // Assert
    }
}
