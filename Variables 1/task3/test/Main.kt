import org.junit.Test
import com.github.stefanbirkner.systemlambda.SystemLambda.*
import org.junit.Assert


class Main {
    @Test
    fun testThatThereIsOutput() {
        val output = tapSystemOut {
            main()
        }

        Assert.assertNotEquals("", output.trim())
    }
}