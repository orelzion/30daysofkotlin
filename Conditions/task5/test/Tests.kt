import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val option1 = "אני גדול"
        val option2 = "אני מאותגר גודל"

        val output = tapSystemOut {
            main()
        }

        Assert.assertTrue(output.trim() == option1 || output.trim() == option2)
    }
}