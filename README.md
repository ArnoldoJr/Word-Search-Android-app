# Word-Search-Android-app
Word search app that uses a 10x10 grid. This was a mobile challenge used for the Shopify co-op application of Fall 2019.

Any list of words can be added juts as it's done in line 419 of MainActivity:
```kotlin
val words = arrayOf("OBJECTIVEC", "VARIABLE", "MOBILE", "KOTLIN", "SWIFT", "JAVA" )
```
More words (or longer ones) can make it hard (or impossible) for the random word generator to fit them in the 10x10 grid.
