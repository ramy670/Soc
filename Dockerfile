FROM tomcat:9-jre8-alpine

COPY ./w.war /usr/local/tomcat/webapps/
##WORKDIR /usr/app

EXPOSE 8080
CMD ["catalina.sh", "run"]

 