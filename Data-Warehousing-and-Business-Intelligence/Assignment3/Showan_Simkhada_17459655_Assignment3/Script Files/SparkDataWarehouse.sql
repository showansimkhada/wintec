USE SparkDW2018
GO

CREATE TABLE [dbo].[DimDate](
	[DateID] [date] Primary Key NOT NULL,
	[Date] [tinyint] Null,
	[DayName] [nvarchar](60) NULL,
	[MonthNumber] [tinyint] NULL,
	[MonthName] [nvarchar](60) NULL,
	[QuarterNumber] [tinyint] NULL,
	[Year] [smallint])

Create Table [dbo].[DimBranchLocation](
	[BranchLocationID] [int] Identity(1401,1) Primary key Not null,
	[City] [nvarchar] (60) null,
	[Region] [nvarchar] (60) null,
	[Country] [nvarchar] (60))
	
CREATE TABLE [dbo].[DimBranch](
	[BranchID] [int] IDENTITY(101,1) Primary Key NOT NULL,
	[BranchName] [nvarchar](60) NULL)

Create table [dbo].[DimCategory](
	[CategoryID] [int] identity(101,1) primary key not null,
	[CategoryName] [nvarchar] (60))

Create Table [dbo].[DimProduct](
	[ProductID] [int] identity(600601,1) primary key not null,
	[ProductName] [varchar] (60),
	[CategoryID] [int] foreign key (CategoryID) references DimCategory not null,
	[Color] [varchar] (60),
	[Storage] [varchar] (60),
	[UnitPrice] [money])

	Create Table [dbo].[DimSupplierLocation](
	[SupplierLocationID] [int] Identity(1401,1) Primary key Not null,
	[City] [nvarchar] (60) null,
	[Region] [nvarchar] (60) null,
	[Country] [nvarchar] (60))

Create table [dbo].[DimSupplier](
	[SupplierID] [int] identity(800,1) primary key not null,
	[SupplierName] [nvarchar] (25))

CREATE TABLE [dbo].[FactInventory](
	[InventoryID] [int] IDENTITY(8001,1) Primary Key NOT NULL,
	[DateID] [date] Foreign Key (DateID) references DimDate NOT NULL,
	[SupplierID] [int] foreign key (SupplierID) references DimSupplier NOT NULL,
	[SupplierLocationID] [int] foreign key (SupplierLocationID) references DimSupplierLocation NOT NULL,
	[BranchID] [int] Foreign Key (BranchID) references DimBranch NOT NULL,
	[BranchLocationID] [int] foreign key (BranchLocationID) references DimBranchLocation NOT NULL,
	[CategoryID] [int] Foreign Key (CategoryID) references DimCategory NOT NULL,
	[ProductID] [int] Foreign Key (ProductID) references DimProduct NOT NULL,
	[UnitIn] [int] NULL,
	[UnitOut] [int] NULL,	
	[UnitPrice] [money] NOT NULL,	
	[TotalAmountIn] [money] NULL,
	[TotalAmountOut] [money] NULL)
