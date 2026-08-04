SELECT user_id,COUNT(user_id) AS prompt_count,ROUND(AVG(tokens),2) AS avg_tokens
FROM prompts 
GROUP BY user_id
HAVING MAX(tokens)>AVG(tokens) AND COUNT(user_id)>2
ORDER BY avg_tokens DESC,user_id ASC