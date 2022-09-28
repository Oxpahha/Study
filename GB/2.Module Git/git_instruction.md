# 1.Создание репозитория

## *Создание нового репозитория или получение его по существующему URL-адресу*
---

`$ git init [название проекта]`

Создаёт новый локальный репозиторий с заданным именем
___
`$ git clone [url-адрес]`

Скачивает репозиторий вместе со всей его историей изменений
______

# 2.Внесение изменений

## *Просмотр изменений и создание коммитов (фиксация изменений)*
---

`$ git status`

Перечисляет все новые или изменённые файлы, которые нуждаются в фиксации
___

`$ git diff`

Показывает различия по внесённым изменениям в ещё не проиндексированных файлах
___
`$ git add [файл]`

Индексирует указанный файл для последующего коммита
___
`$ git diff --staged`

Показывает различия между проиндексированной и последней зафиксированной версиями файлов
___
`$ git reset [файл]`

Отменяет индексацию указанного файла, при этом сохраняет его содержимое
___
`$ git commit -m "[сообщение с описанием]"`

Фиксирует проиндексированные изменения и сохраняет их в историю версий
___

# 3.Коллективная работа

## *Именованные серии коммитов и соединение результатов работы*
___
`$ git branch`

Список именованных веток коммитов с указанием выбранной ветки
___
`$ git branch [имя ветки]`

Создаёт новую ветку
___
`$ git switch -c [имя ветки]`

Переключается на выбранную ветку и обновляет рабочую директорию до её состояния
___
`$ git merge [имя ветки]`

Вносит изменения указанной ветки в текущую ветку
___
`$ git branch -d [имя ветки]`

Удаляет выбранную ветку
___

# 4.Просмотр истории
## *Просмотр и изучение истории изменений файлов проекта*
___
`$ git log`

`$ git log --oneline`

История коммитов для текущей ветки
___
`$ git log --follow [файл]`

История изменений конкретного файла, включая его переименование
___
`$ git diff [первая ветка]...[вторая ветка]`

Показывает разницу между содержанием коммитов двух веток
___
`$ git show [коммит]`

Выводит информацию и показывает изменения в выбранном коммите
___

# 5.Откат коммитов
## *Удаление ошибок и корректировка созданной истории*
___
`$ git reset [коммит]`

Отменяет все коммиты после заданного, оставляя все изменения в рабочей директории
___
`$ git reset --hard [коммит]`

Сбрасывает всю историю вместе с состоянием рабочей директории до указанного коммита.
___

# 6.Синхронизация с удалённым репозиторием
## *Регистрация удалённого репозитория и обмен изменениями*
___
`$ git fetch [удалённый репозиторий]`

Скачивает всю историю из удалённого репозитория
___
`$ git merge [удалённый репозиторий]/[ветка]`

Вносит изменения из ветки удалённого репозитория в текущую ветку локального репозитория
___
`$ git push [удалённый репозиторий] [ветка]`

Загружает все изменения локальной ветки в удалённый репозиторий
___
`$ git pull`

Загружает историю из удалённого репозитория и объединяет её с локальной. pull = fetch + merge
___

### Источник - [Шпора с ГитХаба](https://training.github.com/downloads/ru/github-git-cheat-sheet/), пусть висит на будущее.