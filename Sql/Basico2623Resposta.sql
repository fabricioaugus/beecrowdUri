SELECT products.name
	  ,categories.name
FROM products 
INNER JOIN categories 
	ON products.id_categories = categories.id
	WHERE amount > 100 
    		and categories.id IN(1,2,3,6,9)
				ORDER BY categories.id;