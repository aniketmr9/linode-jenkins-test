FROM openjdk:11
EXPOSE 8086
ADD target/LinodeJenkinsTest.jar LinodeJenkinsTest.jar
ENTRYPOINT ["java","-jar","/LinodeJenkinsTest.jar"]