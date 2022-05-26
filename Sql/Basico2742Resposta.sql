SELECT l.name
,ROUND((l.omega*1.618),3) AS "Fator N"
from dimensions as d
inner JOIN life_registry as l  
	on d.id = l.dimensions_id
WHERE d.name IN ('C774','C875') AND l.name LIKE 'Richard%'
	ORDER BY l.omega;