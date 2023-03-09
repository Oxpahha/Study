-- Покажите содержимое списка клиентов
 select * 
 from chinook.customer;
 
-- Покажите содержимое списка клиентов. Вывести фамилию, Имя, телефон и е-мейл
select FirstName, LastName, Phone, Email
from chinook.customer;

-- Покажите содержимое продаж. 
-- Вывести дату покупки, город в которую совершена продажа и стоимость покупки.
-- Стоимость покупки назвать "Итог" 
select InvoiceDate,BillingCity,Total as "Итог"
from chinook.invoice;

-- Отобразить все музыкальные треки с ценой меньше 1.
select * 
from chinook.track
where UnitPrice <1;

-- Отобразить все музыкальные треки с ценой больше 1.
select * 
from chinook.track
where UnitPrice >1;

-- Отобразить все музыкальные треки с ценой не равной 1.99.
select * 
from chinook.track
where UnitPrice <>1.99;

-- Покажите содержимое продаж. 
-- Вывести дату покупки, город в которую совершена продажа и стоимость покупки больше 2.
-- Стоимость покупки назвать "Итог" 
select InvoiceDate, BillingCity, Total as "Итог"
from chinook.invoice
where Total > 2;

-- Как зовут работников компании? 
-- Показать фамилии и имена в одном столбце назвав FULL_NAME
select concat(FirstName,' '  ,LastName) as FULL_NAME
from chinook.employee;

-- Отобразить все треки, композитром которых является только Apocalyptica и AC/DC. 
select *
from chinook.track
where Composer = "Apocalyptica" or Composer = "AC/DC";

-- Показать все продажи с ценой больше 1.98 и меньше 4
select *
from chinook.invoice
where Total between 1.99 and 3.99;

-- Показать треки трех композиторов из траблицы музыкальных треков.
select *
from chinook.track
where Composer in ('Apocalyptica', 'AC/DC', 'Jerry Cantrell');

-- Показать треки в названии которых находится слово "night".
select * 
from chinook.track 
where Name like ('%night%');

-- Показать треки название которых начинается на букву b.
select * 
from chinook.track 
where Name like ('b%');

-- Показать треки в названии которых содержится буква b
-- и композиторы Apocalyptica и AC/DC.
select * 
from chinook.track 
where Name like ('%b%') and Composer in ('Apocalyptica', 'AC/DC');