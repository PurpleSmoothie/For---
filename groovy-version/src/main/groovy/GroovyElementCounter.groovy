class GroovyElementCounter {

    static Map getCounts(List numbers) {
        numbers.groupBy { it }.collectEntries { k, v ->
            [(k): v.size()]
        }
    }

    static void main(String[] args) {
        def testData = [1, 3, 4, 5, 1, 5, 4]
        def counts = getCounts(testData)

        println "Результат:"
        counts.each { num, cnt ->
            println "$num appears $cnt times"
        }
    }
}