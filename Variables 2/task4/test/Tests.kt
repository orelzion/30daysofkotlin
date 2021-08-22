import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val output = tapSystemOut {
            main()
        }
        Assert.assertEquals(1, output.trim().toInt())
    }
}