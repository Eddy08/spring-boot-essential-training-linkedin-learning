# Steps Mentioned in The Course :

## Step 0.
IntelliJ was giving Error related to ```booting-web/pom.xml``` and giving below CVE at that time of using Spring boot 3.1.5
so added 
```
<dependency>
    <groupId>org.yaml</groupId>
    <artifactId>snakeyaml</artifactId>
    <version>2.0</version>
</dependency>

```
## Step 1.
Creating a html page with name ```Index.html``` and adding it in the ```booting-web/src/main/resources/static```
   - You will be able to see the result of the page
## Step 2. 

**** For setting up the environment variable is not working in 3.1.5 so need to change the environment variable name with :

```
spring.config.activate.on-profile=dev
```

```
[x] I came to know there is some changes are introduced in the spring after 2.4 as mentioned below resources: 
[-] https://spring.io/blog/2020/08/14/config-file-processing-in-spring-boot-2-4
 
```

