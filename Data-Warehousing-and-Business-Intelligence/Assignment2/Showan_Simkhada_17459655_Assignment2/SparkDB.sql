use Spark2018
go

create table [Supplier.Address](
	[LocationID] [int] IDENTITY(1,1) primary key NOT NULL,
	[City] [nvarchar](60) NOT NULL,
	[Region] [nvarchar] (60) NOT NULL,
	[Country] [nvarchar] (60))

create table [Supplier.Supplier]
	([SupplierID] [int] Identity(1,1) primary key not null,
	[SupplierName] [nvarchar] (60),
	[LocationID] [int] foreign key (LocationID) references [Supplier.Address])

create table [Supplier.Category](
	[CategoryID] [int] identity(1, 1) primary key not null,
	[CategoryName] [nvarchar] (60))

create table [Supplier.Product](
	[ProductID] [int] identity(1,1) primary key not null,
	[ProductName] [nvarchar] (60),
	[CategoryID] [int] foreign key (ProductCategoryID) references [Supplier.Category] not null,
	[Color] [nvarchar] (60),
	[Storage] [nvarchar] (60),
	[UnitPrice] [money])

create table [Inventory.InventoryOrderHeader](
	[InventoryOrderID] [int] identity(1,1) primary key not null,
	[SupplierID] [int] foreign key (SupplierID) references [Supplier.Supplier],
	[OrderDate] [date],
	[ShipDate] [date])


create table [Inventory.InventoryOrderDetails](
	[InventoryOrderDetailID] [int] identity(1,1) primary key not null,
	[InventoryOrderID] [int] foreign key (InventoryOrderID) references [Inventory.InventoryOrderHeader],
	[ProductID] [int] foreign key (ProductID) references [Supplier.Product],
	[Quantity] [int],
	[UnitPrice] [money],
	[SubTotal] [money])

create table [Branch.Address]
	([LocationID] [int] IDENTITY(6,1) primary key NOT NULL,
	[City] [nvarchar](60) NOT NULL,
	[Region] [nvarchar] (60) NOT NULL,
	[Country] [nvarchar] (60))

create table [Branch.Branch]
	([BranchID] [int] identity(1,1) primary key not null,
	[BranchName] [nvarchar] (60),
	[LocationID] [int] foreign key (LocationID) references [Branch.Address])

create table [Branch.BranchOrderHeader](
	[BranchOrderID] [int] identity(1,1) primary key not null,
	[BranchID] [int] foreign key (BranchID) references [Branch.Branch],
	[OrderDate] [date],
	[ShipDate] [date])

create table [Branch.BranchOrderDetails](
	[BranchOrderDetailID] [int] identity(1,1) primary key not null,
	[BranchOrderID] [int] foreign key (BranchOrderID) references [Branch.BranchOrderHeader],
	[ProductID] [int] foreign key (ProductID) references [Supplier.Product],
	[Quantity] [int],
	[UnitPrice] [money],
	[SubTotal] [money])