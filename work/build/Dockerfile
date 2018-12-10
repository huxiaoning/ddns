FROM daocloud.io/java:8
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 \
        CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar \
        PATH=$JAVA_HOME/bin:$PATH
COPY ./ddns-0.0.1-SNAPSHOT.jar /work/
CMD ["java","-jar","/work/ddns-0.0.1-SNAPSHOT.jar"]