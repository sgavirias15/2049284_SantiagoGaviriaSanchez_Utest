# 🛠 Utest Automation training 🛠 
 
## ⚙ Description ⚙
 
Automation project in gradle for the Utest page, which is implemented with the Screenplay design pattern.
 
## 🛠 Packages 🛠
 
The following describes what each package of the proposed base archetype should contain:
 
* **exceptions**: It contains the typology of the exceptions that you want to propagate in the execution of an automation.
* **interactions**: It contains the low-level activities that the actor requires to interact with the system.
* **models**: Contains the representation of real world objects with their characteristics.
* **questions**: It contains those classes that allow us to carry out validations about the state of the elements.
* **tasks**: It contains in each class a set of interactions that allow the actor to perform a complete action in the system.
* **userinterfaces**: Contains in each class the declaration of a user view, which in turn contains each element of the view.
* **utils**: It contains in each class logical transversal functions that allow to complete some of the processes.
* **runners**: It contains the classes that allow the features to be executed in a one-to-one relationship between the feature and the class.
* **stepdefinitions**: It contains the classes that implement the steps used in the features from which tasks (tasks) or questions (questions) can be invoked.
* **drivers**: It contains the files that are used to control browsers, applications, etc.
* **features**: Contains user stories in Gherkin language with declarative narrative in business terms.
* **data**: Contains files that can be data input to run some tests.
 
## 📦 Installation 📦
 
* **Clone Project**: For the installation, the repository _ ** Utest_Automation_Training ** _ located in the workspace _ ** DevOps ** _ must be cloned through the following command: 
 
```
https://2049284@dev.azure.com/2049284/Utest_Automation_Training/_git/Utest_Automation_Training
```
 
* **Local Execution**: 
 
    + **Execution Command:** To run the tests locally, they can be run in different ways, some of the ways to run are shown below:
 
        - **Execution of all tests**
 
        ```
        gradle clean test
        ```
 
        - **Execution of a particular test**
 
        ```
        gradle clean test --tests "co.com.bancolombia.certification.stepdefinitions.CreteAccountStepsDefinitions"
        gradle clean test --tests "co.com.bancolombia.certificacion.stepdefinitions.LogInStepsDefinitions"
        ```
 
        - **Execution with tags**
 
        ```
        gradle clean test -Dcucumber.options="--tags @Tag1"
        ```
 
## ✒ Autor: Santiago Gaviria Sánchez ✒
