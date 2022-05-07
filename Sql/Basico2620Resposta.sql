SELECT customers.name
	  ,orders.id
FROM orders
	INNER JOIN customers 
		ON orders.id_customers = customers.id
    WHERE orders_date 
        BETWEEN '2016-01-01' and '2016-06-30';