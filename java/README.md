### org.kevoree:model-java

#### How to generate the Kevoree Java Model
Just run this command:
```sh
mvn install
```

It will retrieve the specified Kevoree meta-model version (pom.xml - ${kevoree.version}) from
`org.kevoree:org.kevoree.model:${kevoree.version}`.
Then **KMF** will use this meta-model file in order to generate the Java model.