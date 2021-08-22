import org.junit.Assert
import org.junit.Test
import com.github.stefanbirkner.systemlambda.SystemLambda.*

class Test {
    @Test fun testSolution() {
        val output = tapSystemOut {
            main()
        }

        Assert.assertTrue(output.trim().startsWith("Dr."))
    }
}