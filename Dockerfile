FROM jboss/wildfly
ADD target/wildfly-kickstart-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

EXPOSE 8080
