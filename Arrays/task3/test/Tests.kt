import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val names = main() as Set<String>

        val output = names.joinToString(separator = ",")

        Assert.assertEquals("Moshe,Omer,Dudu", output)
    }
}