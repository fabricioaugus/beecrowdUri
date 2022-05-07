SELECT products.name
, providers.name
FROM products
INNER Join providers 
	on products.id_providers = providers.id
INNER JOIN categories
	ON products.id_categories = categories.id
WHERE categories.id = 6;
