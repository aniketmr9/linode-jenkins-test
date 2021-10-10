FROM openjdk:11
EXPOSE 8086
ADD target/linode-jenkins-test.jar linode-jenkins-test.jar
ENTRYPOINT ["java","-jar","/linode-jenkins-test.jar"]