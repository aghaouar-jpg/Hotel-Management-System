FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY lib ./lib
COPY src ./src

RUN javac -cp "lib/*" -d out $(find src -name "*.java")

CMD ["echo", "Hotel Management System compiled successfully"]
