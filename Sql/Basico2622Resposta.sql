SELECT customers.name
FROM customers
INNER JOIN legal_person 
	ON customers.id = legal_person.id_customers
WHERE legal_person.id_customers 
	IN (SELECT legal_person.id_customers FROM legal_person);
