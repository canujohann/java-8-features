# Java

## Make java great Again !

With java 8, new features appear and transform the java language in a more flexible and functional langugage.

> Java is an old language, it sucks ! 

No,no and no. Java is now functionnal enough to satisfy the ruby or nodejs developers and the learning curve is smooth/flat.

- Anonymous class/functions [here](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/LambdaDemonstration.java)
- lambda and fonctionnal interface [here](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/LambdaDemonstration.java)
- Collection and stream [here](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/CollectionDemonstration.java)
- Consumer Supplier [here](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/ConsumerSupplier.java)
- Interface with default and static methods [to be done](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/ConsumerSupplier.java)
- *var* keyword [here](https://github.com/canujohann/java-8-features/blob/master/src/jp/alj/varKeyword.java)

And if you think it's not enough (what??), new languages based on the JVM (and fully compatible with java libraries) can solve this problem ! Here are the hotest langugages (or at least my favorites ):

| langage        | logo           |  Few words |
| :------------- |:-------------| :-----|
| scala     | ![scala](https://upload.wikimedia.org/wikipedia/en/8/85/Scala_logo.png)  |  functional programming, static type system, concise|
| groovy      | ![groovy](https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Groovy-logo.svg/220px-Groovy-logo.svg.png)      |   powerful, optionally typed and dynamic. Used by Graddle, ...   |
| kotlin | ![kotlin](https://upload.wikimedia.org/wikipedia/commons/b/b5/Kotlin-logo.png)      | Consise, safe, interoperable, tool-friendly    |



## Added value of JBM based languages

> All the examples below are written in koltin

#### Bye bye getter/setter

Create a POJO with getters, setters, equals(), hashCode(), toString() and copy() in a single line: 

```kotlin
data class Customer(val name: String, val email: String, val company: String)
```

#### Singleton

Create singleton :

```kotlin
object ThisIsASingleton {
    val companyName: String = "JetBrains"
}
```

#### ****** NullPointerExceptions

Get rid of those pesky NullPointerExceptions with optional parameter

```kotlin
val name: String? = null
name?.let { 
	println(name) 
}

//elvis operator is also available
val l = b?.length ?: -1
```

#### Small functions in one line

```kotlin
fun compare(a: String, b: String): Boolean = a.length < b.length
```

#### Higher-Order Functions

>  function that takes functions as parameters

```kotlin
fun <T> ArrayList<T>.filterOnCondition(condition: (T) -> Boolean): ArrayList<T>{
    val result = arrayListOf<T>()
    for (item in this){
        if (condition(item)){
            result.add(item)
        }
    }

    return result
}
```

#### String templates

```kotlin
val s2 = "${s1.replace("is", "was")}, but now is $a"
```

#### Ranges

```kotlin
for (i in 1..100) { ... }  // closed range: includes 100
for (i in 1 until 100) { ... } // half-open range: does not include 100
for (x in 2..10 step 2) { ... }
for (x in 10 downTo 1) { ... }
if (x in 1..10) { ... }
```

#### Default values for function parameters

```kotlin
fun foo(a: Int = 0, b: String = "") { ... }
```
#### non-typed variables

```kotlin
val myInt = 5
```

#### Extension Functions

> my favorite one

```kotlin
fun String.addHello(): String{ 
	"Hello" + this
}
println("Franck".addHello()
```


