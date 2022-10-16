# Expleo UI Test Automation

Following project is used as an interview evaluation tool. 
It consists of a common web UI test automation stack:

- Java 8
- Selenium 3.141.59
- TestNG 7.1
- Maven 3.7

## Installation

Please make sure you have the following tools setup in your local environment:

#### Java 8

- JDK 8 https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- JAVA_HOME environment variable should be set and point to JDK 8

#### Maven

Please make use you have maven 3 installed and available in your command line.
There are many ways to install maven locally:

- download [Maven](https://maven.apache.org/download.cgi) and add to PATH
- MAC: [Homebrew maven formula](https://formulae.brew.sh/formula/maven)
- Windows: [Chocolatey maven package](https://chocolatey.org/packages/maven)

You can verify the proper installation by executing the following command:
```bash
mvn --version
```

### Execution 
-- Test class CurrencyTest.java can be run using run configuration option in Intellj
-- In Eclipse it can be run with option by right click then run as testng

### Reports
-- Execution is reporte is generated in test-output folder in html and xml format

