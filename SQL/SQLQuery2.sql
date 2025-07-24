CREATE PROCEDURE insert_friend
	@ID INT,
	@first_name NVARCHAR(50),
	@last_name NVARCHAR(50),
	@hobbies NVARCHAR(MAX)
AS
BEGIN
	INSERT INTO friend(ID,first_name,last_name,hobbies)
	VALUES(@ID,@first_name,@last_name,@hobbies)
END