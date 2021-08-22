import org.junit.Test
import com.github.stefanbirkner.systemlambda.SystemLambda.*
import org.junit.Assert

class Tests {
    @Test fun testOutput() {

        val output = tapSystemOut {
            main()
        }

        Assert.assertEquals(2.5, output.toDouble(), 0.0)
    }
}