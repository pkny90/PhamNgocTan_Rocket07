use assignment_1;
SET SQL_SAFE_UPDATES = 0;


-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
CREATE OR REPLACE VIEW DSNV_Sale
AS
	SELECT		A.*, D.DepartmentName
	FROM 		`Account` A 
	INNER JOIN 	`Department` D ON A.DepartmentID = D.DepartmentID
	WHERE		D.DepartmentName = 'Sale';

SELECT 	* 
FROM 	DSNV_Sale;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
CREATE OR REPLACE VIEW AccountWithMaxGroup
AS
Select A.AccountID, count(A.AccountID) QuantityOfGrp
From `account` A
Join groupaccount GA on A.AccountID = GA.AccountID
Group By A.AccountID
Having QuantityOfGrp = ( Select MAX(AC.QuantityOfGrp)
							From (Select `AccountID`, Count(AccountID) QuantityOfGrp
                            Group By AccountID) AC      
                            );
                            
                            


WITH CTE_Test AS ( Select AccountID, Count(AccountID) QuantityOfGrp
						From groupAccount
                        Group By AccountID
                        )
Select accountID, QuantityOfGrp
From CTE_Test
Where Quantity ( Select Max(QuantityOfGrp)
					From CTE_Test )
                   ;



-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 18 từ
-- được coi là quá dài) và xóa nó đi (De cu la 300 tu nhung do thiet ke db tu dau nen sua lai 18 tu de demo
CREATE OR REPLACE VIEW ContenTren18Tu
AS
	SELECT 	LENGTH(Content)
	FROM	Question
	WHERE	LENGTH(Content) > 18;
	
SELECT 	* 
FROM 	ContenTren18Tu;


-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW DepartmentMaxAccount
AS
	SELECT 		D.*, COUNT(A.DepartmentID)
	FROM		Department D 
	INNER JOIN 	`Account` A ON D.DepartmentID = A.DepartmentID
	GROUP BY	D.DepartmentID
	HAVING		COUNT(A.DepartmentID) = (
										SELECT 		COUNT(A.DepartmentID)
										FROM		Department D 
										INNER JOIN 	`Account` A ON D.DepartmentID = A.DepartmentID
										GROUP BY	D.DepartmentID
										HAVING		COUNT(A.DepartmentID)
										ORDER BY	COUNT(A.DepartmentID) DESC
										LIMIT		1
										);
										
SELECT 	* 
FROM 	DepartmentMaxAccount;



-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW QuesHoNguyen
AS
	SELECT 		Q.*, A.FullName
	FROM 		Question Q 
	INNER JOIN 	`Account` A ON Q.CreatorID = A.AccountID
	WHERE		Fullname like '%Nguyen%';

SELECT 	* 
FROM 	QuesHoNguyen;






