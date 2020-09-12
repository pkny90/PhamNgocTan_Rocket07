use classicmodels;

-- Tính tổng các order đã xuất kho "Shipped" trong tháng 8 năm 2004
SELECT 
    SUM(od.priceEach * od.quantityOrdered) AS Revenue
FROM
    orderdetails od
        INNER JOIN
    orders o ON od.OrderNumber = o.OrderNumber
WHERE
    YEAR(ShippedDate) = '2004'
        AND MONTH(shippedDate) = '08'
        AND o.status = 'Shipped';

/* Tính lợi nhuận (Profit) thu được từ mỗi khách hàng dựa trên các order mà họ thực hiện.
   Liệt kê theo tên khách hàng*/
SELECT 
    o.orderNumber,
    c.CustomerName,
    IFNULL(SUM(priceEach * quantityOrdered), 0) AS revenue,
    IFNULL(SUM(buyPrice * quantityOrdered), 0) AS cost,
    IFNULL(SUM(priceEach * quantityOrdered) - SUM(buyPrice * quantityOrdered),
            0) AS profit
FROM
    Customers c
        LEFT JOIN
    orders o ON o.CustomerNumber = c.CustomerNumber
        LEFT JOIN
    OrderDetails od ON o.orderNumber = od.orderNumber
        LEFT JOIN
    products p ON p.productCode = od.productCode
GROUP BY c.customerName
ORDER BY c.CustomerName;

/* Tính doanh thu mà mỗi sản phẩm mang lại.
   Liệt kê theo tên khách hàng */
SELECT 
    OrderNumber,
    ProductName,
    SUM(priceEach * quantityOrdered) AS Revenue,
    SUM(buyPrice * quantityOrdered) AS 'Total Price',
    SUM(priceEach * quantityOrdered) - SUM(buyPrice * quantityOrdered) AS Profit
FROM
    products p
        LEFT JOIN
    orderdetails o ON p.productCode = o.productCode
GROUP BY p.ProductName;

      