-- 1.Брой на потребители.
SELECT COUNT(id)
FROM users;

-- 2.Най-стария потребител.
SELECT * FROM users
order by birthDate asc limit 1;

-- 3.Най-младия потребител.
SELECT * FROM users
order by birthDate desc limit 1;

-- 4.Колко юзъра са регистрирани с мейли от abv и колко от gmail и колко с различни от двата.
SELECT 
(SELECT count(*) FROM users WHERE email LIKE '%@abv.bg') as total_abv_results, 
(SELECT count(*) FROM users WHERE email LIKE '%@gmail.com') as total_gmail_results,
(SELECT count(*) FROM users WHERE email NOT LIKE '%@abv.bg' AND email NOT LIKE '%@gmail.com') as total_other_results FROM users GROUP BY total_abv_results, total_gmail_results, total_other_results;

-- 5.Кои юзъри са banned.
SELECT * FROM users
where isBanned = 1;

-- 6.Изкарайте всички потребители от базата като ги наредите по име в азбучен ред и дата на раждане(от най-младия към най-възрастния).
SELECT * FROM users
order by username asc, birthDate desc;

-- 7. Изкарайте всички потребители от базата, на които потребителското име започва с a.
SELECT * FROM users
WHERE username LIKE 'a%';

-- 8.Изкарайте всички потребители от базата, които съдържат а username името си.
SELECT * FROM users
WHERE username LIKE '%username%';

-- 9. Изкарайте всички потребители от базата, чието име се състои от 2 имена.
SELECT * FROM users
where username LIKE '% %';

-- 10. Регистрирайте 1 юзър през UI-а и го забранете след това от базата.
-- UPDATE users
-- SET isBanned = 1
-- WHERE email = 'batman@abv.bg';

-- 11. Брой на всички постове.
SELECT COUNT(id)
FROM posts;

-- 12 Брой на всички постове групирани по статуса на post-a.
SELECT COUNT(id)
FROM posts
where postStatus like '%public%';

-- 13. Намерете поста/овете с най-къс caption.
SELECT caption,
CHAR_LENGTH(caption)  AS 'character_length' 
FROM posts 
where caption != ''
order by character_length asc limit 1;

-- 14. Покажете поста с най-дълъг caption.
SELECT caption,
CHAR_LENGTH(caption)  AS 'character_length' 
FROM posts 
where caption != ''
order by character_length desc limit 1;

-- 15. Кой потребител има най-много постове. Използвайте join заявка
SELECT count(posts.id) as total_posts, users.username
FROM posts
Inner join users on users.id = posts.userId
group by posts.userId
order by total_posts desc limit 1;

-- 16. Кои потребители имат най-малко постове. Използвайте join заявка.
SELECT count(posts.id) as total_posts, users.username
FROM posts
Inner join users on users.id = posts.userId
group by posts.userId
order by total_posts asc limit 1;

-- 17. Колко потребителя с по 1 пост имаме. Използвайте join заявка, having clause и вложени заявки.
SELECT count(*) from 
(SELECT count(posts.Id) as total_posts
FROM posts
Inner join users on users.id = posts.userId
group by posts.userId
HAVING count(total_posts) = 1) as total_post_tmp;

-- 18. Колко потребителя с по малко от 5 поста имаме. Използвайте join заявка, having clause и вложени заявки.
SELECT count(*) from 
(SELECT count(posts.Id) as total_posts
FROM posts
Inner join users on users.id = posts.userId
group by posts.userId
HAVING count(total_posts) < 5) as total_post_tmp;

-- 19. Кои са постовете с най-много коментари. Използвайте вложена заявка и where clause.

-- 20. Покажете най-стария пост. Може да използвате order или с aggregate function.
SELECT * FROM posts
order by createdAt asc limit 1;

-- Покажете най-новия пост. Може с order или с aggregate function.
SELECT * FROM posts
order by createdAt desc limit 1;

-- 22. Покажете всички постове с празен caption.
SELECT caption,
CHAR_LENGTH(caption)  AS 'character_length' 
FROM posts 
where caption = 0
order by character_length;

-- 24. Покажете всички постове и коментарите им ако имат такива.
SELECT caption
FROM posts;

-- SELECT caption
-- FROM posts
-- Inner join comments on post.id = comments.postId
-- group by comments.postId
-- order by total_posts;

-- 28. Кои потребители са like-нали най-много постове.
SELECT max(postsId)
FROM users_liked_posts;
