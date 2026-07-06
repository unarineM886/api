# Use official Tomcat image with Java 21
FROM tomcat:10.1-jdk21

# Remove default ROOT webapp
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copy your WAR to ROOT

COPY target/api.war /usr/local/tomcat/webapps/api.war

# Expose port
EXPOSE 8080
