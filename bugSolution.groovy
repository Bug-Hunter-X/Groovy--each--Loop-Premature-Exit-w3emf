```groovy
def myMethod(List<String> strings) {
  for (int i = 0; i < strings.size(); i++) {
    String string = strings.get(i);
    if (string == null) {
      println "Null string encountered"
      break // This will exit the loop entirely
    }
    println string.toUpperCase()
  }
}

myMethod(["apple", null, "banana"])
```