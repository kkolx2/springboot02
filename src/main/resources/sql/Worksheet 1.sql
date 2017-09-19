  SELECT year, month, count(arrdelay)
    from ontime
   where arrdelay >0
     and year = 1987
group by year, month;



select year,month, count(depdelay)
   from ontime 
where depdelay > 0 
group by year,month ; 