USE [SparkDW2018]
GO

/****** Object:  StoredProcedure [dbo].[usp_Generate_DIM_Date]    Script Date: 6/06/2018 23:06:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[usp_Generate_DIM_Date] @Start_Date datetime, @End_Date datetime as

--Clean existing table
truncate table DimDate

--Initialize our iterator
declare @Current_Date datetime
set @Current_Date = @Start_Date

--Begain iteration
while(@Current_Date <= @End_Date)
begin
	insert into [dbo].[DimDate]
		([DateID]
		,[Date]
		,[DayName]
		,[MonthNumber]
		,[MonthName]
		,[QuarterNumber]
		,[Year])
	values(
		@Current_Date,						--DateID
		datepart(day, @Current_Date),		--Date
		datename(weekday, @Current_Date),	--DayName
		datepart(month, @Current_Date),		--MonthNumber
		datename(month, @Current_Date),		--MonthName
		datepart(quarter, @Current_Date),	--QuarterNumber
		datepart(year, @Current_Date)		--YearNumber
		)

		--Increment iterator
		set @Current_Date = dateadd(day, 1, @Current_Date)
end


GO
