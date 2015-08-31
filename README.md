# JavaDecaf
A precompiler for Java Decaf, a simplified version of Java for beginners. MSc Computer Science project 2015.

JavaDecaf requires JRE 1.7 or higher.

The latest version to download is available under "Releases"; if you have downloaded the source code, use mvn package to create a JAR archive. 

## Manual
The manual is included within the ZIP as a PDF file.

Javadoc for this project can be found in the folder /doc.

## Running the Compiler
*Windows:* javadecaf MyFile.jdc

*Mac/Linux:* ./javadecaf MyFile.jdc

## Troubleshooting
#### Windows: NullPointerException in JavaDecafCompiler.compileJava
Rename javadecaf.bat to javadecaf.old, then rename javadecaf-alternative.bat to javadecaf.bat. Run as before.

