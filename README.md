# spring-boot-health
This is a example of the Spring boot use AbstractHealthIndicator ConfigurationProperties


```properties 
city=Colombia
greetings.city=Colombia
#server.port: 9000
#management.port: 9001
#management.address: 127.0.0.1
```

```html
http://localhost:8080/health

http://localhost:9001/configprops
```




## Start app

```bash 
spring/demo-service$ mvn clean install
spring/demo-service$ java -jar target/demo-service-0.0.1-SNAPSHOT.jar 

```



## Reference
https://www.youtube.com/watch?v=nU-0JajQLB4&list=TLGG0VIQM_plYi8wMjExMjAxNw
https://blog.jayway.com/2014/07/22/spring-boot-custom-healthindicator/

https://docs.cloudfoundry.org/cf-cli/getting-started.html

https://account.run.pivotal.io/z/uaa/identity/apps
