USE [SparkDW2018]
GO

/****** Object:  View [dbo].[report]    Script Date: 8/06/2018 10:11:22 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE view [dbo].[report] as
Select
FactInventory.DateID,
DimSupplier.SupplierID,
DimSupplier.SupplierName,
DimSupplierLocation.SupplierLocationID,
DimSupplierLocation.Country,
DimCategory.CategoryID,
DimCategory.CategoryName,
DimBranchLocation.BranchLocationID,
DimBranchLocation.City,
DimProduct.ProductID,
DimProduct.ProductName,
DimProduct.Color,
DimProduct.Storage,
FactInventory.UnitIn,
FactInventory.TotalAmountIn,
FactInventory.UnitOut,
FactInventory.TotalAmountOut
From DimSupplier Inner Join FactInventory on DimSupplier.SupplierID = FactInventory.SupplierID inner join
DimProduct on FactInventory.ProductID = DimProduct.ProductID Inner Join DimCategory on FactInventory.CategoryID = DimCategory.CategoryID inner join
DimSupplierLocation on DimSupplierLocation.SupplierLocationID = FactInventory.SupplierLocationID inner join
DimBranchLocation on DimBranchLocation.BranchLocationID = FactInventory.BranchLocationID

GO


