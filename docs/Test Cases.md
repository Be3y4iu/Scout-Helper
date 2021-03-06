### Содержание
  1. [Введение](#1)
  2. [Объект тестирования](#2)
  3. [Риски](#3)
  4. [Аспекты тестирования](#4)<br>
  5. [Подходы к тестированию](#5)
  6. [Представление результатов](#6)
  7. [Выводы](#7)

<a name="1"></a>
### 1. Введение
  Данный файл содержит тест-план приложения **ScoutHelper**. Основной целью тестирования является
  проверка приложения на соответствие требованиям SRS.

<a name="2"></a>
### 2. Объект тестирования
Объект тестирования -  приложение **ScoutHelper**.  
Функция, которую выполняет данное приложение:  
предоставление статистики футболистов.  

Приложение обязано обладать определенными атрибутами качества:

1. Функциональность:
+ функциональная корректность: приложение должно выполнять все заявленные функции;
+ функциональная целесообразность: отсутствуют незаявленные функции, которые бы мешали приложению выполнять первоначально поставленные задачи.
+ функциональная полнота: приложение обязано выполнять все заявленные функции в соответствии с SRS;

2. Удобство использования:  
+ адаптивный UX-дизайн: элементы управления эргономично располагаются на экране;  
+ минималистичность: приложение выполняет только конкретные задачи пользователя.
+ актуальность: обновление необходимой информации происходит при доступе к интернету;  

<a name="3"></a>
### 3. Риски
К рискам можно отнести следующие пункты:
* Большое количество одновременно выполняющийся запросов

<a name="4"></a>
### 4. Аспекты тестирования
К аспектам тестирования относится реализация основных функций приложения:
* возможность просмотра страницы игрока со статистикой;
* возможность получения списка игроков, соответствующих определенному параметру;

#### Функциональные требования:

##### Возможность просмотра страницы игрока со статистикой
Этот вариант использования небходимо протестировать на:
1. Успешное открытие страницы игрока
2. Кликабельность кнопок

##### Возможность получения списка игроков, соответствующих определенному параметру
Этот вариант использования небходимо протестировать на:
1. Успешное отображение списка игроков, соответствующих определенному параметру
2. Кликабельность кнопок
#### Нефункциональные требования:
1. Быстрый запуск
2. Надёжность. Доступ к системе "ScoutHelper" должен осуществляться по HTTPS протоколу
3. Удобный UX дизайн  

<a name="5"></a>
### 5. Подходы к тестированию
Каждый аспект тестирования был произведен с помощью системного тестирования.  
Системное тестирование - это тестирование программы в целом.  
Каждый тест производится вручную.  
Такой метод подходит для небольших проектов.

<a name="6"></a>
### 6. Представление результатов
Результаты тестирования представлены в таблице:
Case ID | Case Description | Scenarion/Steps | Expected Result | Action Result | Pass/Fail
--- | --- | --- | --- | --- | ---
1 | Просмотр страницы игрока со статистикой | 1. Переход на страницу при помощи клика по профилю <br> 2. Получение информации из базы данных | Откроется страница со статистикой игрока, которого мы выбрали | Откроется страница со статистикой игрока, которого мы выбрали | Pass
2 | Получение списка игроков, соответствующих определенному параметру | 1. Ввод параметров поиска <br> 2. Нажатие кнопки поиска | Получение списка игроков, соответствующих введенному параметру | Получение списка игроков, соответствующих введенному параметру | Pass

<a name="7"></a>
### 7. Выводы
Данный тестовый план позволяет протестировать основной функционал приложения.  
Успешное прохождение всех тестов может свидетельствовать тому, что приложение  
соответствует всем заявленным требованиям и стабильно работает.
