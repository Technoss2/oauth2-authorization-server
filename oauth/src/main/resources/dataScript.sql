CREATE TABLE [dbo].[Customers](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[Title] [varchar](10) NULL,
	[Name] [varchar](50) NULL,
	[Surname] [varchar](50) NULL,
	[ContactNumber] [varchar](10) NULL,
	[Email] [varchar](50) NULL,
	[PasswordHash] [varchar](500) NULL,
	[Balance] [numeric](12, 2) NULL,
	[token] [varchar](max) NULL,
 CONSTRAINT [PK__Customer__A4AE64B8F52299AC] PRIMARY KEY CLUSTERED
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

ALTER TABLE [dbo].[Customers]  WITH CHECK ADD  CONSTRAINT [CK_Customers_Balance] CHECK  (([Balance]>=(0)))
GO

ALTER TABLE [dbo].[Customers] CHECK CONSTRAINT [CK_Customers_Balance]
GO