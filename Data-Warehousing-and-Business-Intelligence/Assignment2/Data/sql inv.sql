use SparkDW2018
go

exec usp_Generate_FactInventory 700
go
UPDATE [dbo].[FactInventory]
  Set TotalAmountIn = UnitIn*UnitPrice from FactInventory
GO
UPDATE [dbo].[FactInventory]
  Set TotalAmountOut = UnitOut*UnitPrice from FactInventory
GO
UPDATE [dbo].[FactInventory]
  Set SupplierID = 1 where ProductID <= 16
GO
UPDATE [dbo].[FactInventory]
  Set SupplierID = 2 where ProductID > 16 and ProductID < 38
GO
UPDATE [dbo].[FactInventory]
  Set SupplierID = 3 where ProductID > 37 and ProductID < 45
GO
UPDATE [dbo].[FactInventory]
 Set SupplierID = 4 where ProductID > 44 and ProductID < 49
GO
UPDATE [dbo].[FactInventory]
  Set SupplierID = 5 where ProductID = 49
GO
UPDATE [dbo].[FactInventory]
Set CategoryID = 2 where ProductID = 45
GO
UPDATE [dbo].[FactInventory]
Set SupplierLocationID = 2 where SupplierID = 1
GO
UPDATE [dbo].[FactInventory]
Set SupplierLocationID = 4 where SupplierID = 2
GO
UPDATE [dbo].[FactInventory]
Set SupplierLocationID = 5 where SupplierID = 3
GO
UPDATE [dbo].[FactInventory]
Set SupplierLocationID = 1 where SupplierID = 4
GO
UPDATE [dbo].[FactInventory]
Set SupplierLocationID = 3 where SupplierID = 5
GO