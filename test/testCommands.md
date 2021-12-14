# JUnit4 Versions
## Compile
```
javac -cp ./lib/junit-4.13.2.jar UnitsTestsJunitFour.java 
javac -cp .:./lib/* UnitsTestsJunitFour.java 
javac -cp :./lib/* *.java
```
## Execute
```
java -cp .:./lib/junit-4.13.2.jar:./lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore UnitsTestsJunitFour
```
