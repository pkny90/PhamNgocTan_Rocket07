/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS Final_homework;
CREATE DATABASE Final_homework;
USE Final_homework;

DROP TABLE IF EXISTS Manager;
CREATE TABLE Manager(
	ManagerID INT NOT NULL AUTO_INCREMENT,
    FullName VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    pass VARCHAR(100) NOT NULL,
    projectID INT NOT NULL,
    expInYear INT NOT NULL,    
    PRIMARY KEY (ManagerID),
    UNIQUE KEY (email)
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
	EmployeeID INT NOT NULL AUTO_INCREMENT,
    FullName VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL,
    pass VARCHAR(100) NOT NULL,
    projectID INT NOT NULL,
    proSkill VARCHAR(50),
    PRIMARY KEY (EmployeeID),
    UNIQUE KEY (email)
);

DROP TABLE IF EXISTS Project;
CREATE TABLE Project(
	projectID INT NOT NULL AUTO_INCREMENT,
    projectName VARCHAR(100) NOT NULL,
    TeamSize INT NOT NULL,
	ManagerID INT NOT NULL,
    EmployeeID INT NOT NULL,
    PRIMARY KEY (projectID),
    FOREIGN KEY(ManagerID) 			REFERENCES Manager(ManagerID),
    FOREIGN KEY(EmployeeID) 		REFERENCES Employee(EmployeeID)
);

INSERT INTO `Manager`	(  FullName			, email		, pass, expInYear,projectID)
VALUES 					(N'Pham Tan'		,   'phamtan@gmail.com'	, 'Tan123'		,'5','01'),
						(N'Ngoc Dung'		,   'ngocdung@gmail.com',	'dung123'	,'3','05'),
						(N'Van The'			,   'vanthe@gmail.com'	,	'the123'	,'7','08');

 

INSERT INTO `Employee`	(  FullName			, email					, pass			, projectID, proSkill )
VALUES 					(N'Tan Pham'		,   'tanpham@gmail.com'	, 'Tan123'		,'01','		DEV'),
						(N'Dung Ngoc'		,   'dungngoc@gmail.com',	'dung123'		,'02',		'JAVA'),
						(N'The Van'			,   'thevan@gmail.com'	,	'the123'	,'03','		SQL');


INSERT INTO `Project`	(   TeamSize, projectName, ManagerID, EmployeeID )
VALUES 					(N'10'	, 'Java','	01','		01'),
						(N'15'	,'Sql',	'02',		'02'),
						(N'20'	,	'Dev','03','		03');