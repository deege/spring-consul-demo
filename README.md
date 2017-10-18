# spring-consul-demo
Demonstrates running Consul with Spring

This is a short demo to set up Consul as a configuration source for a Spring app. The main feature tested in this demo was the ability to 
override properties set by Consul from the command line.

## Setup

This assumes the following keys are created in Consul.
```
config/Test-Consul-Service/msg = "blah blah"
config/Test-Consul-Service/spring.cloud.config.override-none = true
config/Test-Consul-Service/spring.cloud.config.override-system-properties = false
```   

## Running the App
The application is started running 
```
java -jar ./target/test-consul-0.0.1-SNAPSHOT.jar 
```

This will pull the hello message from Consul using the key **msg**. The hello message is displayed on the web page [http://localhost:8080](http://localhost:8080). 
Changing the **msg** key in Consul while the application is running will refresh to the new value.

To override the message on the command line, run

```
java -jar ./target/test-consul-0.0.1-SNAPSHOT.jar --msg="Hello from the command line"
```

This will change the hello message to "Hello from the command line". 
