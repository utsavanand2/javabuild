## Basic Java Project with Gradle Build

### To build and run the project just run
```sh
# If you don't have gradle already installed
$ ./gradlew run

# If you have gradle installed
$ gradle run
```

### To build a jar, run
```sh
$ ./gradlew build
```

### To run the generated jar, run
```sh
$ cd build/libs
$ java -jar javabuild.jar 1002
Emp No.             Emp Name            Department          Designation         Salary
1002                Sushma              PM                  null                33000
```
### To check for the available tasks you can run
```sh
# If you don't have gradle already installed
$ ./gradlew tasks

# If you have gradle installed
$ gradle tasks
```