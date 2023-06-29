# Дошняя работа
## к семинару Урок 1. Компиляция и интерпретация кода

## Задание

Создать docker-контейнер для формирования полной документации по проекту
(Создание документации к проекту)

Проверяем наличие docker в терминале

    docker version

![alt-текст](./pictures/3.png "Скрин docker version")

Скачаем образ Liberica OpenJDK 17

    docker pull bellsoft/liberica-openjdk-alpine:latest

проверим его среди образов

    docker images

![alt-текст](./pictures/4.png "Скрин образов докера")

Создадим Dockerfile и внесем в него строки:

    FROM bellsoft/liberica-openjdk-alpine

    COPY ./src ./srcMyApp

    RUN javac -sourcepath ./srcMyApp -d out srcMyApp/Main.java

    CMD java -classpath ./out Main

Соберем контейнер

    docker build . -t myapp

![alt-текст](./pictures/1.png "Скрин сборки контейнера")

Запустим контейнер и поработаем в нашей программе в контейнере

    docker run -i myapp

![alt-текст](./pictures/2.png "Скрин запуска проги в контейнере")

Все ок

Внесем комментарии в стиле javadoc в исходники и сгенерируем веб-станицу с документацией к проекту

    javadoc.exe" -protected -splitindex -encoding utf8 -docencoding utf8 -charset utf8 -d E:\Work\JAVA-WEB\Lesson1\Lesson1\docs @C:\Users\ando\AppData\Local\Temp\javadoc_args

![alt-текст](./pictures/5.png "Скрин генерации документации")

Открываем документацию в браузере

![alt-текст](./pictures/6.png "Скрин документации")