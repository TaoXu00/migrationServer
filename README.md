# migrationServer
It is the migration server which runs in each host, receive the command from SDN_Statistics controler, and excute the migration to another host. <br /> <br />
src &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; --migration server source code  <br />
target &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  --containes a runnable jar file and configuration file. <br />
<br />
<br />
**configuration file parameter:**<br />
*port*: TCP server listening port. <br  />
*MininetWorkDir*:&nbsp;if the network is deployed using mininet, it is thef folder where migration image files will be stored.<br />
*lookingupTableDir*:&nbsp; Directory where the encrepted secure host IP lookup table will be stored.<br />
*password*:&nbsp; host mechine password.<br />
*container*:&nbsp; docker image which will be used to create new container in local mechine <br />
*restartDir*:&nbsp; Directory where received container images will be stored.<br />
*logfileDir*:&nbsp; Directory where logfile will be stored. <br  />

**how to run migration server?**<br />
1.git clone https://github.com/TaoXu00/migrationServer.git <br />
2.change configuration file if the folder Dir is different <br />
3.cd target <br />
4.java -jar migrationServer.jar <br />
