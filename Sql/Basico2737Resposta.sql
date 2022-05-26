select lawyers.name
      ,customers_number 
from lawyers 
WHERE  customers_number = (SELECT MAX(customers_number) 
                           fROM lawyers)
union all
select lawyers.name
	  ,customers_number 
from lawyers 
WHERE  customers_number = (SELECT MIN(customers_number) 
                           fROM lawyers)
union all
SELECT 'Average' AS name , TRUNC(AVG(customers_number) , 0)  FROM lawyers;
