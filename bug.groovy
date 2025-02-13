```groovy
def myMethod(List<String> strings) {
  strings.each { string ->
    if (string == null) {
      println "Null string encountered"
      return // This will exit the each loop prematurely
    }
    println string.toUpperCase()
  }
}

myMethod(["apple", null, "banana"])
```