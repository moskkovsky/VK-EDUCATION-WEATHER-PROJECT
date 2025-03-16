# 🐝 VK EDUCATION
## Задачи
* Создать репозиторий и сделать первый коммит
* Написать первый тест в стиле "assertTrue(true)"

## Решение
1. Добавил зависимости для maven
```
 <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
2. Написал 3 теста для проверки погоды в Сан-Франциско и Даллас, с **assertEquals** и **assertTrue**
```
testWeatherInSanFrantz()
testWeatherInDallas()
testWeatherInSanFrantzMoreDallas()
```

> Тест **testWeatherInDallas()** специально был написан в негативном стиле, чтобы показать ошибку, в случае если актуальный ответ не будет совпадать с ожидаемым. 

3. Все актуальные и ожидаемые переменные вынес в отдельный класс **Values**

## Результат
<img width="917" alt="firstHomeWork_result" src="https://github.com/user-attachments/assets/d194bd0c-01a5-41f3-9a3d-cff7b59607cc" />

