### Домашнее задание «Наследование и расширяемость систем. Проблемы наследования»

В этом задании мы будем разрабатывать систему планировщика задач. Вам предстоит разработать и реализовать систему классов задач с использованием наследования и протестировать готовый планировщик задач.

Задачи будут трёх видов:

- `SimpleTask` — простая задача, про неё известны только `id` (число) и `title` (название);
- `Epic` — задача, состоящая из подзадач. Про неё известны `id` (число) и `subtasks` — массив из подзадач, каждая из которых является простым текстом (`String`);
- `Meeting` — задача, описывающая назначенную встречу. Про неё известны `id` — число, `topic` — тема обсуждения, `project` — название проекта, который будут обсуждать, и `start` — дата и время старта текстом.

Все объекты задач должны быть не изменяемы — исходные данные принимать в конструкторе при создании и не иметь сеттеров (только геттеры).

Мы хотим задачи хранить в менеджере. Назовём его класс `Todos` — список дел. Было бы удобно хранить в нём задачи не по отдельности (т. е. один массив из `SimpleTask`, другой массив из `Epic`, третий массив из `Meeting`), а в одном общем массиве. Это позволит сильно сократить и упростить код менеджера, а также мы сможем создавать новые виды задач без изменений кода `Todos`. Чтобы хранить все задачи в одном массиве, нам нужен такой тип ячейки, который позволит в неё положить любую из наших задач. С этим поможет полиморфизм, для которого мы создадим класс `Task`, в который вынесем общее, что есть во всех задачах, а другие задачи от него отнаследуем.