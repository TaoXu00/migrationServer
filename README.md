# Migration Server
It is the migration server which runs in each host, receive the command from SDN_Statistics controler, and excute the migration to another host.

| Folder | Description |
| --- | --- |
| src | Lmigration server source code |
| target | containes a runnable jar file and configuration file. |

## Configuration file parameters

| Parameter | Description |
| --- | --- |
| port | TCP server listening port. |
| MininetWorkDir | if the network is deployed using mininet, it is thef folder where migration image files will be stored. |
| lookingupTableDir | Directory where the encrepted secure host IP lookup table will be stored. |
| password | host mechine password. |
| container | docker image which will be used to create new container in local mechine |
| restartDir | where received container images will be stored. |
| logfileDir | Directory where logfile will be stored. |

## Compile and run instruction
Refer to the instructions provided in [README_RUN](README_RUN.md]).
