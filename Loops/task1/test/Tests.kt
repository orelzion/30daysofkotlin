import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val shouldBePalindrom = isPalindrom("abba")
        val shouldNotBePalindrom = isPalindrom("fsr")

        Assert.assertTrue(shouldBePalindrom)
        Assert.assertFalse(shouldNotBePalindrom)
    }
}