SELECT concat('Approved: ', NAME) as name 
     , grade 
from students
    WHERE grade>=7.0
ORDER BY grade DESC;