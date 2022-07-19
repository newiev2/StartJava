--all rows with all columns selected
SELECT * FROM Jaegers;

--robots that are not destroyed selected
SELECT * FROM Jaegers WHERE status != 'Destroyed';

--robots of Mark-1 and Mark-6 selected
SELECT * FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-6');

--all rows selected and ordered by mark desk
SELECT * FROM Jaegers ORDER BY mark DESC;

--most old robot selected
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

--robots destroyed more/less kaiju than others
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);

--average weigth of all robots selected
SELECT AVG(weight) averageWeight FROM Jaegers;

--total kaiju killed incremented for robots that are not destroyed
UPDATE Jaegers SET kaijuKill = (kaijuKill + 1) WHERE status != 'Destroyed';

--robots that are destroyed deleted from table
DELETE FROM Jaegers WHERE status = 'Destroyed';
