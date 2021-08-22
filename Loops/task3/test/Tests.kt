import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val output = tapSystemOut {
            main()
        }

        Assert.assertEquals("3\n5\n7\n9\n11\n13\n15\n17\n19", output.trim())
    }
}