SELECT d.name
	  , ROUND(SUM((aa.hours*150) + (w.bonus*0.01*aa.hours*150)),1) AS salary
FROM doctors AS d
inner join attendances as aa  
	on d.id = aa.id_doctor
inner join work_shifts as w
	on w.id = aa.id_work_shift
GROUP by d.name
ORDER by salary DESC;