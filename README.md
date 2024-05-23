[![Badge](https://github.com/yulyashka-lav/tz_333/actions/workflows/main.yml/badge.svg)](https://github.com/yulyashka-lav/tz_333/actions/workflows/main.yml)
## Описание проекта
Перед вами находится проект, который умеет следующее:
1) Считывать все числа из текстового файла
2) Находить среди них минимум, максимум
3) Вычислять сумму и произведение всех чисел
## Установка
Клонируйте репозиторийс помощью команды git clone, воспользовавшись ссылкой на репозиторий (https://github.com/yulyashka-lav/tz_333.git); далее введите команду cd с названием репозитория (tz_333); соберите проект с помощью mvn clean package
## Запуск
1) Вам понадобится заранее подготовленный текстовый файл с числами, разделенными пробелом; Файл необходимо назвать 'input.txt' и поместить в директорию 'src' вашего проекта.
2) Скомпилируйте и запустите проект с помощью команд javac Mainn.java и java Mainn
3) Программа выведет результат реализации указанных функций, а именно выведет максимальное, минимальное, сумму и произведение всех чисел
## Тестирование
Этот проект включает юнит-тесты для проверки функций с использованием JUnit.
Для запуска тестов используйте Maven - mvn test
Примечание: в теста проверяется корректность выполения функций нахождения минимума и максимуа, суммы всех чисел, произведения, проверка скорости работы
