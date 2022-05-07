SELECT customers.name, rentals.rentals_date
FROM rentals
	INNER JOIN customers 
    	ON rentals.id_customers = customers.id
			where rentals.rentals_date 
            	BETWEEN '2016-09-01' AND '2016-09-30';