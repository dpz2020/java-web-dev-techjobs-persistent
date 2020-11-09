## Part 1: Test it with SQL

CREATE TABLE `job` (
  `id` int NOT NULL,
  `employer` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `skills` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


## Part 2: Test it with SQL
SELECT * FROM techjobs.employer
Where location = 'St. Louis City'
## Part 3: Test it with SQL
drop table job
## Part 4: Test it with SQL
SELECT name, description
From skill
ORDER BY name ASC;