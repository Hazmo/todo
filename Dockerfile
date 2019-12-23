FROM openjdk:11-jre
ARG PROFILE
ENV spring_profiles_active=${PROFILE}
COPY target/dependency/BOOT-INF/lib /app/lib
COPY target/dependency/META-INF /app/META-INF
COPY target/dependency/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","co.uk.harryabaker.todo.Application"]