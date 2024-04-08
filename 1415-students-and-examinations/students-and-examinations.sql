SELECT s.student_id, s.student_name, sj.subject_name, count(e.subject_name) AS attended_exams 
FROM Students s 
JOIN Subjects sj 
LEFT JOIN Examinations e ON s.student_id = e.student_id AND e.subject_name  = sj.subject_name 
GROUP BY s.student_id, s.student_name, sj.subject_name
ORDER BY s.student_id