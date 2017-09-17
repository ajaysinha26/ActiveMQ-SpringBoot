# ActiveMQ-SpringBoot
Sample project to showcase use SpringBoot for ActiveMQ producer and consumer.

Import this project as a maven project. It contains 2 modules: **producer** and **consumer**

**`NOTE:`** 
Producer and Consumer are using ActiveMQ broker running on localhost. This can be changed to point broker running on a different host. To do so change **application.properties** file of both **producer** and **consumer** modules.



**`Producer`**

Run **producer** module as a SpringBoot application. It has a scheduler which keeps posting an **Order** event every minute

**`Consumer`**

Run **consumer** module as a SpringBoot application. It is listening to **Order** events and will print the message in logs
