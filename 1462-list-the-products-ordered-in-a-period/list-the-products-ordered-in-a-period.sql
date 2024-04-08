# Write your MySQL query statement below
select  Products.product_name, Products.unit
from
    (select Products.product_name, 
        sum(Orders.unit) as unit
    from Products 
    left join Orders 
    on Products.product_id = Orders.product_id and 
        datediff(order_date, '2020=02-01') >= 0 and
        datediff('2020-03-01', order_date) > 0 
    group by Products.product_id) products
where Products.unit >= 100