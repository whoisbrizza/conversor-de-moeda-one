@echo off
javac -cp lib\gson-2.10.1.jar src\ConversorMoeda.java
java -cp src;lib\gson-2.10.1.jar ConversorMoeda
pause