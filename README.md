Forumlite
=========

No matter what
--------------

* Install Git <https://git-scm.com/>
* Some people really like to use a Git UI such as <https://www.sourcetreeapp.com/> as well.
* Git clone the project
* Make a GitHub account if you don't have one yet. Write your GitHub username on the piece of paper that the teacher has. *Clearly*! :-)

Getting started
---------------

If you like IDEs, try Eclipse:

* Eclipse <http://www.eclipse.org/downloads/>

OR if you prefer the command line or are an experience Java geek:

* Git <https://git-scm.com/>
* [The latest JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) (You need version 1.7 or later)
* [Maven](https://maven.apache.org/install.html)


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