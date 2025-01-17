SELECT
    u.user_id,
    u.username,
    t.training_id,
    t.training_date,
    COUNT(*) AS count
FROM
    User u
JOIN
    Training_details t ON u.user_id = t.user_id
GROUP BY
    u.user_id, u.username, t.training_id, t.training_date
HAVING
    COUNT(*) > 1
ORDER BY
    t.training_date DESC,
    u.user_id,
    t.training_id;