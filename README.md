# test_cft

#### Требования:

* Java 1.6 и выше
* Входной файл содержит данные одного из двух видов: целые числа или строки
* Данные записаны в столбик (каждая строка файла – новый элемент)
* Строки могут содержать любые не пробельные символы
* Максимальное количество сток в файле равно 100

#### Результат работы программы
Результатом работы программы являтся новый файл с содержимым входного файла,
отсортированным по возрастанию или убыванию. Для сортировки строк используется
лексикографический порядок (по кодам символов).

#### Использование

Запуск из коммандной строки (cmd.exe или bash):

```no-highlight
java -jar test_cft <type> <order>   
где тип данных (type):  
    -s строки  
    -i целые числа  
порядок сортировки (order):
    -a по возрастанию
    -d по убыванию
```

#### Пример сортировки целых чисел по возрастанию

`java -jar test_cft in.txt out.txt -i -a`  

| in.txt        | out.txt       |  
| ------------- | ------------- |  
| 323           | 9             |  
| 4678          | 12            |  
| 9             | 15            |  
| 234           | 234           |  
| 12            | 323           |  
| 15            | 4678          |  
