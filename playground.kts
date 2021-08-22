fun main() {
    val childAge = 1

    val columnsNum = (childAge * 2) - 1

    for(i in 0 until columnsNum) {
        if(i % 2 == 0) { // it means it's an even number
            print("*")
        } else {
            print(" ")
        }
    }

    println()

    for(i in 0 until columnsNum) {
        if(i % 2 == 0) { // it means it's an even number
            print("|")
        } else {
            print(" ")
        }
    }

    println()
    for(i in 0 until columnsNum) {
        print("_")
    }

    for(i in 0 until 3) {
        println()
        for(j in 0 until columnsNum) {
            when(j) {
                0, columnsNum - 1 -> print("*")
                else -> print(" ")
            }
        }
    }

    println()
    for(i in 0 until columnsNum) {
        print("_")
    }
}

main()