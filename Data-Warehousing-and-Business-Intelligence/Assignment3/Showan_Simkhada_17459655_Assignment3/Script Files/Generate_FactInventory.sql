USE SparkDW2018
GO

alter procedure usp_Generate_FactInventory @Quantity int as
declare @ProductID int
declare @Counter int
set @Counter = 1
while(@Counter<=@Quantity)
begin
set @ProductID = rand()*49+1
Insert into FactInventory values(
	convert(date,dateadd(day, rand()*-1095,getdate())), --DateID
	rand()*5+1, --SupplierID
	rand()*5+1, --SupplierLocationID
	rand()*40+1, -- BranchID
	rand()*10+5, --BranchLocationID
	rand()*2+1, --CategoryID
	@ProductID, --ProductID
	rand()*200+100, --UnitIn
	rand()*200+100, --UnitOut
	(select UnitPrice from DimProduct where ProductID = @ProductID), --UnitPrice
	null, --TotalAmountIn
	null) --TotalAmountOut
	
set @Counter = @Counter+1
END