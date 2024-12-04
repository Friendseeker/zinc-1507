### Reproduction

Run `sbt diagnostic`

Note the spurious library `A/Refined.class`:

```
libraries = Map(${BASE}/A/target/scala-2.13/classes/A/Refined.class -> farm(48deb0d5f219ec97), ${CSR_CACHE}/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar -> farm(822b8cc937cd2860))
```
