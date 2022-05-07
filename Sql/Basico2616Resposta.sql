SELECT customers.id
	  ,customers.name 
FROM customers 
    WHERE  customers.id 
    	NOT IN(SELECT  l.id_customers FROM locations as l)
   			ORDER BY customers.id;