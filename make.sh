#!/bin/bash
pwd
cd src/
pwd
javac game/debug/*.java
javac game/framework/*.java
javac game/graphics/*.java
javac game/input/*.java

jar cf Game.jar .
mv Game.jar ./../Game.jar
cd ..
