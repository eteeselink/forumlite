Forumlite
=========

To get started, make sure you have this:

* Git <https://git-scm.com/>
* Eclipse <http://www.eclipse.org/downloads/>

OR

* Git <https://git-scm.com/>
* [The latest JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (You need version 1.7 or later)
* [Maven](https://maven.apache.org/install.html)

Some people really like to use a Git UI such as <https://www.sourcetreeapp.com/> as well. 

Using Eclipse
-------------

* Git clone the project
* In Eclipse, do *Import->Maven->Existing Maven Projects*
* You should see no compile errors.
* Click the "Run" button for fancy lights!
* Right-click the `test` folder and choose *Run As -> JUnit Test*, you should see 1 passed test.

Using the command line
----------------------

* Git clone the project
* `mvn package`
* `mvn test`
* To run: `mvn exec:java -Dexec.mainClass="eu.ooti.forumlite.Main"`