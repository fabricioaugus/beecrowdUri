SELECT products.name
	  ,providers.name 
FROM products 
  inner join providers 
  	on products.id_providers = providers.id
   WHERE providers.name = 'Ajax SA';