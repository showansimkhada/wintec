use Spark2018
go

Insert into [Supplier.Supplier] values ('Apple', (select LocationID from [Supplier.Address] where Country = 'US'))
Insert into [Supplier.Supplier] values ('Samsung', (select LocationID from [Supplier.Address] where Country = 'South Korea'))
Insert into [Supplier.Supplier] values ('Nokia', (select LocationID from [Supplier.Address] where Country = 'Finland'))
Insert into [Supplier.Supplier] values ('Spark', (select LocationID from [Supplier.Address] where Country = 'Australia'))
Insert into [Supplier.Supplier] values ('Sony', (select LocationID from [Supplier.Address] where Country = 'Japan'))