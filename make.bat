@echo off
cd src\
javac game\debug\*.java
javac game\framework\*.java
javac game\graphics\*.java
javac game\input\*.java

jar cf Game.jar .
move Game.jar .\..\Game.jar
cd ..