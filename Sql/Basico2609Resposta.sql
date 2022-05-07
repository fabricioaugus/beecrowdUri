SELECT categories.name
       ,sum(products.amount)
    FROM products
INNER JOIN categories
	ON products.id_categories = categories.id
    GROUP by categories.name;