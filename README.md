# Java Selenium Test Automation Solution (TAS)


Java Selenium TAS has been written using Java, TestNG, Gradle and Dockerized Selenium Grid. 
Framework architecture also provides support for following three additional browsers:

```bash
•	Firefox

•	Chrome

•	Safari

•	Internet Explorer

•	Edge
```

## Installation

Download the project source code from [Bitbucket](https://bitbucket.check24.de)

```bash
git clone https://bitbucket.check24.de/scm/baufi/qafg.git
```
• Use any favourite tool to open the project [Eclipse](https://www.eclipse.org/downloads/) or
[IntelliJ IDEA](https://www.jetbrains.com/idea/). I will refer here IntelliJ.

• If no project is currently opened in IntelliJ IDEA, click Import Project on the welcome screen. 
Otherwise, select File. Open from the main menu. In the dialog that opens, select a directory that contains a project which is 'qafg'
```bash
File -> New -> Project from Existing Resources -> qafg (Project path) -> select javaselenium -> click Open -> Click Ok -> Select the JDK -> Say **Yes** on the displayed warning 'Overwrite idea.xml'
```
• Project has been opened. Time to write tests straight away without taking care of any configuration or dependencies.

## Test Run
• Project can be run locally or in a distributed environment (Selenium Grid)


**Test Run Locally**

• To run tests locally, just update following parameter 'execution.mode=local' in [local.properties](https://bitbucket.check24.de/projects/BAUFI/repos/qafg/browse/javaselenium/src/test/resources/configfiles/local.properties) file.

```python
Windows: gradle test -i -DsuitXmlFile=smoketests.xml
MAC: ./gradlew test -i -DsuitXmlFile=smoketests.xml

```

**Test Run in Distributed Environment**

• To run tests using Selenium Grid, update following two parameters 'execution.mode=grid' in [local.properties](https://bitbucket.check24.de/projects/BAUFI/repos/qafg/browse/javaselenium/src/test/resources/configfiles/local.properties) file.
```python
execution.mode=grid
grid=http://MachineIP-HostName:4444/wd/hub (Path to Selenium/Zalenium Grid)
```

Step by step instructions to create Grid can be found here: [Selenium/Zalenium Grid](https://confluence.check24.de/display/IFG/Testing+with+Selenium-Java+in+Dockerize+Environment)

## Reporting

For detailed Overview about reporting formats, kindly refer the foollwing link: [QA Automation](https://confluence.check24.de/display/IFG/Testing+with+Selenium-Java+in+Dockerize+Environment)

**Gradle Reports**
 
```python
build/reports/tests/test/emailable-report.html
build/reports/tests/test/index.html
```

**TestNG Reports**

```python
build/reports/tests/test/html/index.html
build/reports/tests/test/html/output.html
```

**Allure Reports**

Allure reports are also supported by this Framework.
Screenshots are attached to the test body of allure report for every click to see the test flow.

You have to install the allure first depending on your OS. Information can be found here: [Allure Download](https://docs.qameta.io/allure/)

```python
gradle test -i -DsuitXmlFile="smoketests.xml" (allure-results folder will be genrated with json files)
allure serve Absolute-path-to-allure-results-folder (Give here Path to allure-results and report will be opened in the default browser)
```

## Contribution
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change. Contact Marius Burz for the access rights to this repository.

## More Info

[QA Automation](https://confluence.check24.de/display/IFG/Testing+with+Selenium-Java+in+Dockerize+Environment)

Frame work can be extended to write automated tests for following testing types:

```python
API Testing
Android App Testing
iOS App Testing
Cross-Browser Testing
```

Further information can be obtained per email: 

```python
Riffat Shahzad: riffat.shahzad@check24.de
```




