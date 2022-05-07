SELECT products.name
	  ,providers.name
      ,categories.name 
FROM products 
  inner join providers 
  	on products.id_providers = providers.id
  INNER JOIN categories 
  	ON products.id_categories = categories.id
  WHERE providers.name = 'Sansul SA' 
            AND categories.name= 'Imported';