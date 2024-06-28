USE [SparkDW2018]
GO

/****** Object:  StoredProcedure [dbo].[usp_Generate_FactInventory]    Script Date: 3/06/2018 16:06:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE procedure [dbo].[usp_Generate_FactInventory] @Quantity int as
declare @ProductID int
declare @Counter int
set @Counter = 1
while(@Counter<=@Quantity)
begin
set @ProductID = rand()*49+1
Insert into FactInventory values(
	convert(date,dateadd(day, rand()*-365,getdate())), --DateID
	rand()*5+1, --SupplierID
	rand()*5+1, --SupplierLocationID
	rand()*40+1, -- BranchID
	rand()*10+5, --BranchLocationID
	rand()*2+1, --CategoryID
	@ProductID, --ProductID
	rand()*2000+100, --UnitIn
	rand()*170+15, --UnitOut
	(select UnitPrice from DimProduct where ProductID = @ProductID), --UnitPrice
	null, --TotalAmountIn
	null) --TotalAmountOut
	
set @Counter = @Counter+1
END
GO

