FROM bellsoft/liberica-openjdk-alpine

COPY ./src ./srcMyApp

RUN javac -sourcepath ./srcMyApp -d out srcMyApp/Main.java

CMD java -classpath ./out Main