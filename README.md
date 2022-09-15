# rhdemo
A demonstration of creating a simple Java app that reports data and time and packages it all into a .har file

## Create the class file

```
javac rhdemo.java  
```

## Create the .jar file

```
jar -cfvm Rhdemo.jar Manifest.txt rhdemo.class
```

## Run the .jar file

```
java -jar Rhdemo.jar 
```

