#!/bin/bash
rm -rf ../classes
mkdir ../classes
javac -classpath /usr/local/hadoop/current/hadoop-core-1.2.1.jar:/usr/local/hadoop/current/lib/commons-cli-1.2.jar -d ../classes com/PACKT/chapter1/*.java
