import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSolution() {

        val option1 = "a cute couple".toUpperCase()
        val option2 = "stay single".toUpperCase()

        val output = tapSystemOut {
            main()
        }.trim().toUpperCase()

        Assert.assertTrue(
            output == option1 ||
                    output == option2
        )
    }
}