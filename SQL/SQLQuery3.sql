CREATE PROCEDURE get_sorted_friends
AS
BEGIN
    SELECT * FROM friend
    ORDER BY first_name; 
END
