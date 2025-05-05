package groovy

def countElements(array) {
    array.groupBy { it }.collectEntries { [it.key, it.value.size()] }
}

def testArray = [1, 8, 4, 5, 5, 5, 10] as Object[]
println "Groovy result: " + countElements(testArray)

