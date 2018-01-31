## Compile and run the Migration Server

### Compile

In order to compile the migration server:

- download the source code

  $ git clone https://github.com/TaoXu00/migrationServer
  
- generate .class files

  $ cd migrationServer
  $ mkdir bin
  $ javac -d bin -sourcepath src src/ServerApplication.java
  
- create the final jar

  $ mkdir target
  $ jar cvfm target/MigrationServer.jar src/META-INF/MANIFEST.MF -C bin/ .

### Run

In order to runhe migration server:

- copy the jar in the desired working directory

  $ cp target/MigrationServer.jar [working_directory]/

- copy the [configuration](src/configuration) file in the same folder (and modify it as needed)

  $ cp src/configuration [working_directory]/
  
- finally, run the jar with the following command:

  $ java -jar MigrationServer.jar [host-address]
