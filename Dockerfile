FROM gradle:jdk17
RUN mkdir -p /home/gradle/src/gradle
COPY build.gradle gradlew settings.gradle /home/gradle/src
COPY gradle/ /home/gradle/src/gradle
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew clean build -i --stacktrace  -x test
EXPOSE 8080
ENTRYPOINT exec java -jar /home/gradle/src/build/libs/demo-0.0.1-SNAPSHOT.jar
